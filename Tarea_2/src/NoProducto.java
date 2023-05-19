import java.awt.Graphics;
import javax.swing.ImageIcon;
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
