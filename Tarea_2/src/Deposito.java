import java.util.ArrayList;
class Deposito{
    private ArrayList<Producto> al;
    public Deposito(){ al = new ArrayList<>(); }
    public void addProducto(Producto b){ al.add(b); }
    public Producto getProducto(){

        if(al.size()==0) return null;

        Producto b = al.remove(0);
        return b;
    }
}