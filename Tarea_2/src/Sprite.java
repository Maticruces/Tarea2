import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Sprite extends Producto{
    public Sprite(int numSerie, int x, int y, int escala){
        super(numSerie, x, y, escala);
    }
    @Override
    public String consumir(){
        return "Sprite";
    }
    @Override
    public void paint(Graphics g){
        JButton jb;
        ImageIcon imagen = new ImageIcon(getClass().getResource("Sprite.png"));
        g.drawImage(imagen.getImage(), getx(), gety(), 3*getTamano()/16, getTamano()/4, this);
        jb = new JButton(new ImageIcon(imagen.getImage().getScaledInstance(getTamano()/4, getTamano()/4, Image.SCALE_SMOOTH)));
        jb.setBounds(getx(),  gety(), 3*getTamano()/16, getTamano()/4);
        setJButton(jb);
    }
}
