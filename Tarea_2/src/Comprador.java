import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * @Comprador interactua con el expendedor
 * @sonido recibe lo que se esta consumiendo
 * @vuelto hace el pago
 **/
public class Comprador extends JPanel{
    private String sonido;
    private int vuelto;
    public Comprador(Moneda m, int cualProducto, Expendedor exp) throws PagoInsuficienteException, ProductoNoDisponibleExcepcion, PagoIncorrectoException {
        Producto a = exp.comprarProducto(m, cualProducto);
        try {
            a = exp.comprarProducto(m, cualProducto);
        } catch (ProductoNoDisponibleExcepcion e) {
            throw new RuntimeException(e);
        } catch (PagoIncorrectoException e) {
            throw new RuntimeException(e);
        } catch (PagoInsuficienteException e) {
            throw new RuntimeException(e);
        }

        if (a == null) sonido = null;
        else sonido = a.consumir();

        public void getVuelto(){
            while (true) {
                Moneda m = exp.getVuelto();
                if (m == null) break;
                vuelto.addMoneda(m);
            }
            for (int i = 0; i < vuelto.check(); i++) {
                Moneda m = vuelto.getMoneda();
                valorvuelto = valorvuelto + m.getValor();
                vuelto.addMoneda(m);
            }
            countm100 = countm100 + exp.getcountm100();
            exp.setcountm100(0);
            countm500 = countm500 + exp.getcountm500();
            exp.setcountm500(0);
            countm1000 = countm1000 + exp.getcountm1000();
            exp.setcountm1000(0);
        }
        public int cuantoVuelto(){
            return (valorvuelto);
        }
    }

    public Object getMonedabyValor(Moneda500 moneda500) {
    }

    public Object getMonedabyValor(Moneda500 moneda500) {
    }

    public boolean getcountm100() {
    }

    public void comprarBebida(int numpad) {
    }

    public boolean getcountm500() {
    }

    public boolean getcountm1000() {
    }
}