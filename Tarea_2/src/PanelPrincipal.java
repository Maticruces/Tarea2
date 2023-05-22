
import java.awt.*;
import javax.swing.JPanel;

/*
*@PanelPrincipal es una clase que interactua con la ventana
del expendedor.
*/

public class PanelPrincipal extends JPanel{
    private Comprador com;
    private Expendedor exp;
    public PanelPrincipal(int Tamano){
        super();
        setBounds(0, 0, 4*Tamano, 3*Tamano);
        exp = new Expendedor(3, 400, Tamano/8 , Tamano/8, Tamano);
        com = new Comprador(exp, Tamano);
        this.setBackground(Color.white);
    }
    public void paint(Graphics g){
        super.paint(g);
        com.paint(g); 
        exp.paint(g); 
    }
    public Expendedor getExp(){
        return exp;
    }
    public Comprador getCom(){
        return com;
    }
}
