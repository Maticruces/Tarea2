/*
*@NoHayProductoExcepcion es una clase que interactua con Exception
esta es utilizada para enviar un mensaje de error en el caso de que
no quede disponible cierto producto en el expendedor.
*/
public class NoHayProductoException extends Exception{
    public NoHayProductoException(String errorMesagge){
        super(errorMesagge);
    }
}
