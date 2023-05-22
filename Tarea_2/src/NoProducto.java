import java.awt.Graphics;
import javax.swing.ImageIcon;

/*
*@NoProducto es una clase que representa el numero o codigo
asociado a cierto producto del expendedor
*@param: numSerie
*@param: x
*@param: y
*@param: escala
*@return: La posicion de cierto producto dentro del expendedor
*/

public class NoProducto extends Producto {
    public NoProducto(int numSerie, int x, int y, int escala){
        super(numSerie, x, y, escala);
    }
    @Override
    public String consumir(){
        return " ";
    }
    @Override
    public void paint(Graphics g){
        ImageIcon imagen = new ImageIcon(getClass().getResource("0.png"));
        g.drawImage(imagen.getImage(), 0, 0, 0, 0, this);
    }
}
