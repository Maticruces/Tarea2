import java.util.ArrayList;
import java.awt.Graphics;
import javax.swing.JPanel;

/*
*@Deposito es una clase que interactua con Expendedor
*@param: posx
*@param: posy
*@param: tescale
*@return: La cantidad de dinero sobrante
*/

class Deposito extends JPanel{
    private ArrayList<Producto> al;
    int x, y, escala;
    public Deposito(int posx, int posy, int tescale){
        al = new ArrayList<Producto>();
        escala = tescale;
        x = posx;
        y = posy;
    }
    public void addProducto(Producto b){ al.add(b); }
    public Producto getProducto(){
        if(al.isEmpty()) return new NoProducto(-1,0,0,0);

        else return al.remove(0);
    }
    public Producto getProductoEn(int n){
        if (n>=al.size()) return new NoProducto(0,0,0,0);

        else return al.get(n);
    }
    public int getStorage(){
        return al.size();
    }
    @Override
    public void paint(Graphics g){
        for (int i = 0; i < 5; i++) {
            Producto b;
            b = this.getProductoEn(i);
            b.changeLocation(x + 3*escala/16 + (i*(3*escala/16)), y + 3*escala/16);
            b.paint(g);
        }
    }
}
