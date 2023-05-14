import javax.swing.JPanel;
public abstract class Moneda extends JPanel{
    private int x;
    private int y;
    private int Tamano;
    public Moneda(){
        x = 0;
        y = 0;
        Tamano = 0;
    }
    public String getSerie(){
        return(Integer.toHexString(this.hashCode()));
    }
    public void ChangeLocationScale(int x,int y, int escala){
        this.x = x;
        this.y = y;
        this.Tamano = escala;
    }
    public int getx(){return x;}
    public int gety(){return y;}
    public int getescala(){return Tamano;}
    public abstract int getValor();
}