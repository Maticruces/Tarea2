import javax.swing.JButton;
import javax.swing.JPanel;

/*
*@Producto es una clase que representa los productos de la expendedora
*@param: x
*@param: y
*@param: escala
*@return: numSerie, el numero de serie y la posicion de cierto producto.
*/

public abstract class Producto extends JPanel{
    private int numSerie;
    private int x, y, Tamano;
    private JButton JB;
    public Producto(int numSerie, int x, int y, int escala){
        this.numSerie = numSerie;
        this.x = x;
        this.y = y;
        this.Tamano = escala;
    }
    public int getSerie(){
        return numSerie;
    }
    public void changeLocation(int x,int y){
        this.x = x;
        this.y = y;
    }
    public void setJButton(JButton act){
        JB = act;
    }
    public int getx(){
        return x;
    }
    public int gety(){
        return y;
    }
    public int getTamano(){
        return Tamano;
    }
    public abstract String consumir();
}
