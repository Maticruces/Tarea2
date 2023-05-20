import javax.swing.*;
import java.awt.*;

class Moneda500 extends Moneda{
    public Moneda500(){ super(); }
    @Override
    public int getValor() {
        return 500;
    }
    public void paint(Graphics g){
        ImageIcon imagen = new ImageIcon(getClass().getResource("Moneda500.png"));
        g.drawImage(imagen.getImage(), getx(), gety(), getescala()/4, getescala()/4, this);
    }
}