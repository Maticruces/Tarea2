
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ventana extends JFrame{
    private JButton JBPanelN1,JBPanelN2,JBPanelN3,JBPanelN0;
    private JButton moneda100, moneda500, Billete1000, getvuelto, getProducto, moneda100_2, moneda500_2, Billete1000_2;
    private JButton conProducto, refill1,refill2,refill3;
    private PanelPrincipal PP;
    private int escala, numpad = 0;
    private Expendedor exp;
    private Comprador com;
    public Ventana(){
        super();
        escala = 240; //con 160 es 640x480 con 240 es 960x720 con 320 es 1280x960

        PP = new PanelPrincipal(escala);
        exp = PP.getExp();
        com = PP.getCom();

        setSize(4*escala, 3*escala); //tamaño fijo de 4:3
        setTitle("Maquina Expendedora");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        this.setResizable(false);
        crearGUI();
        add(PP);
        setVisible(true);
    }
    public void crearGUI(){
        ImageIcon imagen = new ImageIcon(getClass().getResource("BotonCocaCola.png"));
        JBPanelN1 = new JButton(new ImageIcon(imagen.getImage().getScaledInstance(3*escala/16, escala/16, Image.SCALE_SMOOTH)));JBPanelN1.setBounds(11*escala/8, 5*escala/8, 3*escala/16, escala/16);

        imagen = new ImageIcon(getClass().getResource("BotonSprite.png"));
        JBPanelN2 = new JButton(new ImageIcon(imagen.getImage().getScaledInstance(3*escala/16, escala/16, Image.SCALE_SMOOTH)));JBPanelN2.setBounds(11*escala/8, 11*escala/16, 3*escala/16, escala/16);

        imagen = new ImageIcon(getClass().getResource("BotonRayita.png"));
        JBPanelN3 = new JButton(new ImageIcon(imagen.getImage().getScaledInstance(3*escala/16, escala/16, Image.SCALE_SMOOTH)));JBPanelN3.setBounds(11*escala/8, 6*escala/8, 3*escala/16, escala/16);

        imagen = new ImageIcon(getClass().getResource("BotonE.png"));
        JBPanelN0 = new JButton(new ImageIcon(imagen.getImage().getScaledInstance(3*escala/16, escala/16, Image.SCALE_SMOOTH)));JBPanelN0.setBounds(11*escala/8, 13*escala/16, 3*escala/16, escala/16);

        imagen = new ImageIcon(getClass().getResource("RefillC.png"));
        refill1 = new JButton(new ImageIcon(imagen.getImage().getScaledInstance(3*escala/16, escala/16, Image.SCALE_SMOOTH)));refill1.setBounds(11*escala/8, 15*escala/16, 3*escala/16, escala/16);

        imagen = new ImageIcon(getClass().getResource("RefillS.png"));
        refill2 = new JButton(new ImageIcon(imagen.getImage().getScaledInstance(3*escala/16, escala/16, Image.SCALE_SMOOTH)));refill2.setBounds(11*escala/8, escala, 3*escala/16, escala/16);

        imagen = new ImageIcon(getClass().getResource("RefillS8.png"));
        refill3 = new JButton(new ImageIcon(imagen.getImage().getScaledInstance(3*escala/16, escala/16, Image.SCALE_SMOOTH)));refill3.setBounds(11*escala/8, 17*escala/16, 3*escala/16, escala/16);

        imagen = new ImageIcon(getClass().getResource("Moneda100.png"));
        moneda100 = new JButton(new ImageIcon(imagen.getImage().getScaledInstance(escala/4, escala/4, Image.SCALE_SMOOTH)));moneda100.setBounds(2*escala,  escala/4, escala/4, escala/4);
        moneda100.setBorderPainted(false);
        moneda100.setContentAreaFilled(false);
        moneda100_2 = new JButton(new ImageIcon(imagen.getImage().getScaledInstance(escala/4, escala/4, Image.SCALE_SMOOTH)));moneda100_2.setBounds(49*escala/16, 17*escala/16, escala/4, escala/4);
        moneda100_2.setBorderPainted(false);
        moneda100_2.setContentAreaFilled(false);
        moneda100_2.setToolTipText("Actualmente no hay monedas de 100");

        imagen = new ImageIcon(getClass().getResource("Moneda500.png"));
        moneda500 = new JButton(new ImageIcon(imagen.getImage().getScaledInstance(escala/4, escala/4, Image.SCALE_SMOOTH)));moneda500.setBounds(9*escala/4,  escala/4, escala/4, escala/4);
        moneda500.setBorderPainted(false);
        moneda500.setContentAreaFilled(false);
        moneda500_2 = new JButton(new ImageIcon(imagen.getImage().getScaledInstance(escala/4, escala/4, Image.SCALE_SMOOTH)));moneda500_2.setBounds(49*escala/16, 23*escala/16, escala/4, escala/4);
        moneda500_2.setBorderPainted(false);
        moneda500_2.setContentAreaFilled(false);
        moneda500_2.setToolTipText("Actualmente no hay monedas de 500");

        imagen = new ImageIcon(getClass().getResource("Billete1000.png"));
        Billete1000 = new JButton(new ImageIcon(imagen.getImage().getScaledInstance(escala/4, escala/4, Image.SCALE_SMOOTH)));
        Billete1000.setBounds(5*escala/2,  escala/4, escala/4, escala/4);
        Billete1000.setBorderPainted(false);
        Billete1000.setContentAreaFilled(false);
        Billete1000_2 = new JButton(new ImageIcon(imagen.getImage().getScaledInstance(escala/4, escala/4, Image.SCALE_SMOOTH)));
        Billete1000_2.setBounds(49*escala/16, 29*escala/16, escala/4, escala/4);
        Billete1000_2.setBorderPainted(false);
        Billete1000_2.setContentAreaFilled(false);
        Billete1000_2.setToolTipText("Actualmente no hay monedas de 1000");

        getvuelto = new JButton();getvuelto.setBounds(5*escala/4, 7*escala/4, 3*escala/16, 3*escala/16);
        getProducto = new JButton();
        getProducto.setBounds(3*escala/8, 17*escala/8, escala, escala/4);
        getProducto.setBorderPainted(false);
        getProducto.setContentAreaFilled(false);
        getProducto.setToolTipText("Click para extraer Producto en Maquina");

        getvuelto= new JButton();getvuelto.setBounds(5*escala/4, 7*escala/4, 3*escala/8, 3*escala/16);
        getvuelto.setBorderPainted(false);
        getvuelto.setContentAreaFilled(true);
        getvuelto.setToolTipText("Click para extraer Vuelto en Maquina");

        conProducto = new JButton();
        conProducto.setBounds(111*escala/32, 3*escala/8, 3*escala/16, escala/4);
        conProducto.setBorderPainted(false);
        conProducto.setContentAreaFilled(false);
        conProducto.setToolTipText("Espacio de Producto del Cliente");

        evento_numpad(JBPanelN1);evento_numpad(JBPanelN2);evento_numpad(JBPanelN3);evento_numpad(JBPanelN0);
        evento_moneda(moneda100);evento_moneda(moneda500);evento_moneda(Billete1000);
        evento_takeProducto(getProducto);
        evento_takeVuelto(getvuelto);
        evento_conProducto(conProducto);evento_moneda_2(moneda100_2);evento_moneda_2(moneda500_2);evento_moneda_2(Billete1000_2);
        evento_refill(refill1);evento_refill(refill2);evento_refill(refill3);

        add(JBPanelN1);add(JBPanelN2);add(JBPanelN3);add(JBPanelN0);add(moneda100);add(moneda500);add(Billete1000);
        add(getProducto);add(getvuelto);add(moneda100_2);add(moneda500_2);add(Billete1000_2);add(conProducto);
        add(refill1);add(refill2);add(refill3);
    }
    public void evento_refill(JButton act){
        act.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (act.getBounds().y==15*escala/16) exp.refill(1);
                else{
                    if (act.getBounds().y==escala) exp.refill(2);

                    else{
                        if (act.getBounds().y==17*escala/16) exp.refill(3);
                    }
                }
                repaint();
            }
        });
    }
    public void evento_moneda_2(JButton act){
        act.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) throws RuntimeException {
                if (act.getBounds().y == 17*escala/16) {
                    try {
                        exp.IngresaMoneda(com.getMonedabyValor(new Moneda100()));
                    } catch (NohayMonedaException | PagoIncorrectoException ex) {
                        throw new RuntimeException(ex);
                    }
                }else{
                    if(act.getBounds().y == 23*escala/16) {
                        try {
                            exp.IngresaMoneda(com.getMonedabyValor(new Moneda500()));
                        } catch (NohayMonedaException | PagoIncorrectoException ex) {
                            throw new RuntimeException(ex);
                        }
                    }else{
                        try {
                            exp.IngresaMoneda(com.getMonedabyValor(new Billete1000()));
                        } catch (NohayMonedaException | PagoIncorrectoException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                }
                if (com.getcountm100()>0) moneda100_2.setToolTipText("El numero de serie de la primera moneda encontrada es " + com.getMonedaby(new Moneda100()).getSerie());

                if (com.getcountm100()==0) moneda100_2.setToolTipText("Actualmente no hay monedas de 100");

                if (com.getcountm500()>0) moneda500_2.setToolTipText("El numero de serie de la primera moneda encontrada es " + com.getMonedaby(new Moneda500()).getSerie());

                if (com.getcountm500()==0) moneda500_2.setToolTipText("Actualmente no hay monedas de 500");

                if (com.getcountb1000()>0) Billete1000_2.setToolTipText("El numero de serie de la primera moneda encontrada es " + com.getMonedaby(new Billete1000()).getSerie());

                if (com.getcountb1000()==0) Billete1000_2.setToolTipText("Actualmente no hay Billetes de 1000");
                repaint();
            }
        });
    }
    public void evento_conProducto(JButton act){
        act.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (com.ProductoEnCom()) {
                    JOptionPane.showMessageDialog(null, "Bebiste una " + com.queProducto());
                    conProducto.setToolTipText("Espacio de Producto del Cliente");
                }else JOptionPane.showMessageDialog(null, "Aun no se a recogido un Producto");
            }
        });
    }
    public void evento_takeVuelto(JButton act){
        act.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                com.getVuelto();
                if (com.getcountm100()>0) moneda100_2.setToolTipText("El numero de serie de la primera moneda encontrada es " + com.getMonedaby(new Moneda100()).getSerie());

                if (com.getcountm500()>0) moneda500_2.setToolTipText("El numero de serie de la primera moneda encontrada es " + com.getMonedaby(new Moneda500()).getSerie());

                if (com.getcountb1000()>0) Billete1000_2.setToolTipText("El numero de serie de la primera moneda encontrada es " + com.getMonedaby(new Billete1000()).getSerie());
                repaint();
            }
        });
    }
    public void evento_takeProducto(JButton act){
        act.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (act.getBounds().x == 3*escala/8&&!com.ProductoEnCom()){
                    try {
                        com.recojeProducto();
                    } catch (NoHayProductoException ex) {
                        throw new RuntimeException(ex);
                    }
                    conProducto.setToolTipText("Consumir producto con numero de serie: " + com.getProducto().getSerie());
                    repaint();
                }
            }
        });
    }
    public void evento_moneda(JButton act){
        act.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (act.getBounds().x == 2*escala) {
                    try {
                        exp.IngresaMoneda(new Moneda100());
                    } catch (PagoIncorrectoException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                }else{
                    if(act.getBounds().x == 9*escala/4){
                        try {
                            exp.IngresaMoneda(new Moneda500());
                        } catch (PagoIncorrectoException ex) {
                            JOptionPane.showMessageDialog(null, ex.getMessage());
                        }
                    }else{
                        try {
                            exp.IngresaMoneda(new Billete1000());
                        } catch (PagoIncorrectoException ex) {
                            JOptionPane.showMessageDialog(null, ex.getMessage());
                        }
                    }
                }
                repaint();
            }
        });
    }
    public void evento_numpad(JButton act){
        act.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (act.getBounds().y == 13*escala/16) {
                    try {
                        com.comprarProducto(numpad);
                        numpad = 0;
                    } catch (PagoIncorrectoException | PagoInsuficienteException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    } catch (YaComproException | NoHayProductoException | ProductoNoDisponibleExcepcion ex) {
                        throw new RuntimeException(ex);
                    }
                    repaint();
                }else{
                    if (act.getBounds().y == 5*escala/8) numpad = 1;

                    else{
                        if (act.getBounds().y == 11*escala/16) numpad = 2;

                        else{
                            if (act.getBounds().y == 6*escala/8) numpad =3;
                        }
                    }
                }
            }
        });
    }
}