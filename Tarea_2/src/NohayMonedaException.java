/*
*@NoHayMonedaException es una clase que interactua con Exception,
esta es utilizada para enviar un mensaje de error en el caso de que no
se hubiera insertado ninguna moneda en el expendedor.
*/
public class NohayMonedaException extends Exception{
    public NohayMonedaException(String errorMesagge){
        super(errorMesagge);
    }
}
