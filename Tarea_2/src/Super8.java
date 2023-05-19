import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

class Super8 extends Producto{
    public Super8(int numSerie, int x, int y, int escala){ super(numSerie, x, y, escala); }
    @Override
    public String consumir(){ return "Super8"; }
    @Override
    public void paint(Graphics g){
        JButton jb;
        ImageIcon imagen = new ImageIcon(getClass().getResource("Super8.png"));
        g.drawImage(imagen.getImage(), getx(), gety(), 3*getTamano()/16, getTamano()/4, this);
        jb = new JButton(new ImageIcon(imagen.getImage().getScaledInstance(getTamano()/4, getTamano()/4, Image.SCALE_SMOOTH)));
        jb.setBounds(getx(),  gety(), 3*getTamano()/16, getTamano()/4);
        setJButton(jb);
    }
}