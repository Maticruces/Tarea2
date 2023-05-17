public class ExpendedorMod{
    private Deposito coca;
    private Deposito sprite;
    private Deposito super8;
    private Deposito rayita;
    private DepositoM monVu;
    private int codigo;
    private int precioB;
    private int precioD;
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public static final int SUPER8 = 3;
    public static final int RAYITA = 4;
    public Expendedor(int numProductos, int precioBebidas, int precioDulces) {
        coca = new Deposito();
        sprite = new Deposito();
        super8 = new Deposito();
        rayita = new Deposito();
        monVu = new DepositoM();

        this.precioB = precioBebidas;
        this.precioD = precioDulces;

        for (int i = 0; i < numProductos; i++) {
            Producto cc = new CocaCola(100 + i);
            coca.addProducto(cc);
            Producto sp = new Sprite(200 + i);
            sprite.addProducto(sp);
            Producto s8 = new Super8( 300 + i);
            super8.addProducto(s8);
            Producto rt = new rayita( 400 + i);
            rallita.addProducto(rt);
        }
    }
    public Producto comprarProducto(Moneda m, int n) throws ProductoNoDisponibleExcepcion, PagoIncorrectoExcepcion, PagoInsuficienteExcepcion {
        this.codigo = n;


        if (m != null && m.getValor() >= precioB) {
            switch(n){
                case 1: Producto cc = coca.getProducto();
                    if (cc != null) {
                        throw new ProductoNoDisponibleExcepcion("Producto no disponible\n");
                        for (int i = 0; i < (m.getValor() - precioB) / 100; i++) {
                            Moneda a = new Moneda100();
                            monVu.addMoneda(a);
                        }
                        return cc;
                    }
                case 2: Producto sp = sprite.getProducto();
                    if (sp != null) {
                        throw new ProductoNoDisponibleExcepcion("Producto no disponible\n");
                        for (int i = 0; i < (m.getValor() - precioB) / 100; i++) {
                            Moneda a = new Moneda100();
                            monVu.addMoneda(a);
                        }
                        return sp;
                    }
                case 3: Producto s8 = super8.getProducto();
                    if (s8 != null) {
                        throw new ProductoNoDisponibleExcepcion("Producto no disponible\n");
                        for (int i = 0; i < (m.getValor() - precioD) / 100; i++) {
                            Moneda a = new Moneda100();
                            monVu.addMoneda(a);
                        }
                        return s8;
                    }
                case 4: Producto rt = rayita.getProducto();
                    if (rt != null) {
                        throw new ProductoNoDisponibleExcepcion("Producto no disponible\n");
                        for (int i = 0; i < (m.getValor() - precioD) / 100; i++) {
                            Moneda a = new Moneda100();
                            monVu.addMoneda(a);
                        }
                        return rt;
                    }
                case 5: int money = m.getValor();
                if(m == null){
                    throw new PagoIncorrectoExcepcion("Pago Invalido");
                }
                case 6: if(m.getValor() < precioB || m.getValor()< precioD){
                    throw new PagoInsuficienteExcepcion("Cantidad de dinero incorrecta");
                }
            }
        }else{
            monVu.addMoneda(m);
            return null;
        }
        monVu.addMoneda(m);
        return null;
    }
    public int getPrecio(){
        if (codigo == 1 || codigo == 2) return precioB;
        else return precioD;
    }
    public Moneda getVuelto(){ return monVu.getMoneda(); }
}