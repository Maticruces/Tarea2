import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
class Ventana extends JFrame {
    private MiPanel dp;//un panel para objetos gráficos
    private PanelBotones bp;//un panel para objetos gráficos
    Ventana(){
        this.setLayout(new BorderLayout());

        dp=new MiPanel();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //cerrar aplicación
        this.add(dp,BorderLayout.CENTER); //se agrega al centro

        bp = new PanelBotones();
        this.add(bp,BorderLayout.SOUTH); //se agrega al sur
        this.setSize(600,400);//this.pack();
        this.setVisible(true);
    }
}
class MiPanel extends JPanel implements MouseListener {
    private Triangulo t;
    public MiPanel(){
        super();
        this.setBackground(Color.cyan);
        t = new Triangulo(100,100);
        this.addMouseListener(this); // inscribe el manejador de evento para que lo llamen (en este caso él mimo)
    }
    public void paint(Graphics g){
        super.paint(g);
        if(t!=null)t.paint(g);
    }
    public void mouseClicked(MouseEvent me) {;} // es llamado cuando el press y el release ocurren en el mismo pixel
    public void mousePressed(MouseEvent me) {
        System.out.println("press"); //se imprimirá press cada vez que se oprima un botón del mouse dentro del área
    }
    public void mouseReleased(MouseEvent me) {;} // el llamado al soltar el botón
    public void mouseEntered(MouseEvent me) {;}  // cursor entra al área
    public void mouseExited(MouseEvent me) {;}   // cursor sale del área
}
class Triangulo{
    private Polygon p;
    private int x,y;
    public Triangulo(int x, int y){
        this.x=x;
        this.y=y;
        p = new Polygon();
        p.addPoint(x,y);
        p.addPoint(x+120, y+50);
        p.addPoint(x+40, y+150);
    }
    public void paint(Graphics g){
        g.setColor(Color.red);
        if(p!=null)g.drawPolygon(p);
    }
}
class PanelBotones extends JPanel {
    public PanelBotones() {
        this.setLayout(new BorderLayout());
// se agregan botones no útiles para demostrar las zonas del Layout
        this.add(new JButton("sur"), BorderLayout.SOUTH);
        this.add(new JButton("centro"), BorderLayout.CENTER);
        this.add(new JButton("norte"), BorderLayout.NORTH);
        this.add(new JButton("este"), BorderLayout.EAST);
        this.add(new JButton("oeste"), BorderLayout.WEST);
    }
}
