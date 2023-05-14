import java.util.ArrayList;
class DepositoM{
    private ArrayList<Moneda> mon;
    public DepositoM(){ mon = new ArrayList(); }
    public void addMoneda(Moneda b){ mon.add(b); }
    public Moneda getMoneda(){
        if(mon.size()==0) return null;

        Moneda b = mon.remove(0);
        return b;
    }
}