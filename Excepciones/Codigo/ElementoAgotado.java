package Excepciones.Codigo;

/**
 *
 * @author Kevin
 */
public class ElementoAgotado extends Exception{
    public ElementoAgotado(){
        //mensaje por defecto
        super("Hay un item que no existe o es insuficiente");
    }
    
    public ElementoAgotado(String mensaje){
        //personalizado
        super(mensaje);
    }
}
