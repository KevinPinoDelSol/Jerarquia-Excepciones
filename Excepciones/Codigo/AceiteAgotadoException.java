package Excepciones.Codigo;

/**
 *
 * @author Kevin
 */
public class AceiteAgotadoException extends IngredienteAgotadoException{
    public AceiteAgotadoException(){
        //mensaje por defecto
        super("No alcanza el aceite para preparar el platillo");
    }
    
    public AceiteAgotadoException(String mensaje){
        //personalizado
        super(mensaje);
    }
}
