import javax.swing.JPanel;

/*
*@Moneda es una clase que representa las monedas en general.
*@return: Un puntero que da el tamaño de esta y su valor.
*/

public abstract class Moneda extends JPanel{
    private int x;
    private int y;
    private int Tamano;
    public Moneda(){
        x = 0;
        y = 0;
        Tamano = 0;
    }
    public String getSerie(){
        return(Integer.toHexString(this.hashCode()));
    }
    public int getx(){return x;}
    public int gety(){return y;}
    public int getescala(){return Tamano;}
    public abstract int getValor();
}
