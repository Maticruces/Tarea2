import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
*Esta clase es publica y representa el producto Coca-Cola,
a esta hay vinculada una imagen .png de la misma
*@autor: Matias Cruces Gomez
*@param: x
*@param: y
*@param: escala
*@param: numSerie
*@return:(Retorna en texto e imagen .png) CocaCola
*/

public class CocaCola extends Producto{
    public CocaCola(int numSerie, int x, int y, int escala){
        super(numSerie, x, y, escala);
    }
    @Override
    public String consumir(){
        return "CocaCola";
    }
    @Override
    public void paint(Graphics g){
        JButton jb;
        ImageIcon imagen = new ImageIcon(getClass().getResource("CocaCola.png"));
        g.drawImage(imagen.getImage(), getx(), gety(), 3*getTamano()/16, getTamano()/4, this);
        jb = new JButton(new ImageIcon(imagen.getImage().getScaledInstance(getTamano()/4, getTamano()/4, Image.SCALE_SMOOTH)));
        jb.setBounds(getx(),  gety(), 3*getTamano()/16, getTamano()/4);
        setJButton(jb);
    }
}
