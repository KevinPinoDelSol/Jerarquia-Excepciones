package Excepciones.Codigo;

/**
 *
 * @author Kevin
 */
public class ElementoAgotadoException extends Exception{
    public ElementoAgotadoException(){
        //mensaje por defecto
        super("Hay un item que no existe o es insuficiente");
    }
    
    public ElementoAgotadoException(String mensaje){
        //personalizado
        super(mensaje);
    }
}
