/**
 * @Comprador interactua con el expendedor
 * @sonido recibe lo que se esta consumiendo
 * @vuelto hace el pago
 **/
class Comprador{
    private String sonido;
    private int vuelto;
    public Comprador(Moneda m, int cualProducto, Expendedor exp) {
        Producto a = exp.comprarProducto(m, cualProducto);

        if (a == null) sonido = null;
        else sonido = a.consumir();
        boolean b = true;

        while (b){
            Moneda s = exp.getVuelto();
            if (s != null) vuelto += s.getValor();
            else b = false;
        }
    }
}