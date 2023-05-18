import java.awt.*;
import javax.swing.*;

public class Expendedor extends JPanel {
    private Deposito coca;
    private Deposito sprite;
    private Deposito super8;
    private Deposito rayita;
    private DepositoM monVu;
    private int codigo;
    private int precioB;
    private int precioD;
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public static final int SUPER8 = 3;
    public static final int RAYITA = 4;
    private int escala;
    private int countserie;
    private int countm100, countm500, countm1000, money;

    public Expendedor(int numProductos, int precio, int x, int y, int escala) {
        countserie = numProductos * 2;
        countm100 = 0;
        countm500 = 0;
        countm1000 = 0;
        money = 0;
        coca = new Deposito();
        sprite = new Deposito();
        super8 = new Deposito();
        rayita = new Deposito();
        monVu = new DepositoM();

        this.precioB = precio;
        this.precioD = precio + 400;

        for (int i = 0; i < numProductos; i++) {
            CocaCola cc = new CocaCola(i, 0, 0, escala);
            coca.addProducto(cc);
            Sprite sp = new Sprite(numProductos + i, 0, 0, escala);
            sprite.addProducto(sp);
            Super8 s8 = new Super8((numProductos * 2) + i, 0, 0, escala);
            super8.addProducto(s8);
            Rayita rt = new Rayita((numProductos * 2) + i, 0, 0, escala);
            rayita.addProducto(rt);
        }
    }

    public void refill(int n) {
        if (n == 1) {
            for (int i = countserie; i < countserie + 10; i++) {
                CocaCola cc = new CocaCola(i, 0, 0, escala);
                coca.addProducto(cc);
            }
            countserie = countserie + 10;
        }
        if (n == 2) {
            for (int i = countserie; i < countserie + 10; i++) {
                Sprite sp = new Sprite(countserie, 0, 0, escala);
                sprite.addProducto(sp);
            }
            countserie = countserie + 10;
        }
        if (n == 3) {
            for (int i = countserie; i < countserie + 10; i++) {
                Super8 s8 = new Super8(countserie, 0, 0, escala);
                super8.addProducto(s8);
            }
            countserie = countserie + 10;
        }
        if (n == 4) {
            for (int i = countserie; i < countserie + 10; i++) {
                Rayita rt = new Rayita(countserie, 0, 0, escala);
                rayita.addProducto(rt);
            }
            countserie = countserie + 10;
        }
    }

    public int getcountm100() {
        return countm100;
    }

    public int getcountm500() {
        return countm500;
    }

    public int getcountm1000() {
        return countm1000;
    }

    public void setcountm100(int c) {
        countm100 = c;
    }

    public void setcountm500(int c) {
        countm500 = c;
    }

    public void setcountm1000(int c) {
        countm1000 = c;
    }

    public Producto comprarProducto(Moneda m, int n) throws ProductoNoDisponibleExcepcion, PagoIncorrectoException, PagoInsuficienteException {
        this.codigo = n;

        if (m != null && m.getValor() >= precioB) {
            switch (n) {
                case 1:
                    Producto cc = coca.getProducto();
                    if (cc != null) throw new ProductoNoDisponibleExcepcion("Producto no disponible\n");

                case 2:
                    Producto sp = sprite.getProducto();
                    if (sp != null) throw new ProductoNoDisponibleExcepcion("Producto no disponible\n");

                case 3:
                    Producto s8 = super8.getProducto();
                    if (s8 != null) throw new ProductoNoDisponibleExcepcion("Producto no disponible\n");

                case 4:
                    Producto rt = rayita.getProducto();
                    if (rt != null) throw new ProductoNoDisponibleExcepcion("Producto no disponible\n");

                case 5:
                    int money = m.getValor();
                    if (m == null) throw new PagoIncorrectoException("Pago Incorrecto");

                case 6:
                    if (m.getValor() < precioB || m.getValor() < precioD)
                        throw new PagoInsuficienteException("Cantidad de dinero incorrecta");
            }
            monVu.addMoneda(m);
            return null;
        }
        monVu.addMoneda(m);
        return null;
    }

    public int getPrecio() {
        if (codigo == 1 || codigo == 2) return precioB;
        else return precioD;
    }

    public Moneda getVuelto() {
        return monVu.getMoneda();
    }

    public void IngresaMoneda(Object monedabyValor) {
    }
}