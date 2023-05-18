
import java.awt.*;
import javax.swing.JPanel;

public class PanelPrincipal extends JPanel{ //se ve en el centro de la ventana
    private Comprador com;
    private Expendedor exp;
    public PanelPrincipal(int Tamano){
        super();
        setBounds(0, 0, 4*Tamano, 3*Tamano);
        exp = new Expendedor(3, 400, Tamano/8 , Tamano/8, Tamano);
        com = new Comprador(exp, Tamano);
        this.setBackground(Color.white);
    }
    public void paint (Graphics g) { //todo se dibuja a partir de este método
        super.paint(g); //llama al método pint al que hace override en la super
                        //el de la super clase solo pinta el fondo (background)
        com.paint(g); //llama al metodo paint definido en el PanelComprador
        exp.paint(g); //llama al metodo paint definido en el PanelExpendedor
    }
    public Expendedor getExpendedor(){
        return exp;
    }
    public Comprador getComprador(){
        return com;
    }
}