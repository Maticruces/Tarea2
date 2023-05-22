import javax.swing.*;
import java.awt.*;

/*
*@Billete1000 clase que se define como el billete de mil pesos,
a este hay vinculado un png imagen del billete
*@return: (valor) 1000
*/

class Billete1000 extends Moneda{
    public Billete1000(){ super(); }
    @Override
    public int getValor() {
        return 1000;
    }
    public void paint(Graphics g){
        ImageIcon imagen = new ImageIcon(getClass().getResource("Billete1000.png"));
        g.drawImage(imagen.getImage(), getx(), gety(), getescala()/4, getescala()/4, this);
    }
}
