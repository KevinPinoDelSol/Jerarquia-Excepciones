package Excepciones.Codigo;

/**
 *
 * @author Kevin
 */
public class IngredienteAgotadoException extends ElementoAgotadoException {
    
    public IngredienteAgotadoException(){
        //mensaje por defecto
        super("No alcanza un ingrediente para preaparar el platillo");
    }
    public IngredienteAgotadoException(String mensaje){
        //mensaje persializado
        super(mensaje);
    }
    
}
