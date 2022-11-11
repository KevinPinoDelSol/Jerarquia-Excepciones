package Excepciones.Codigo;

/**
 *
 * @author Kevin
 */
public class IngredienteAgotado extends ElementoAgotado {
    
    public IngredienteAgotado(){
        //mensaje por defecto
        super("No alcanza un ingrediente para preaparar el platillo");
    }
    public IngredienteAgotado(String mensaje){
        //mensaje persializado
        super(mensaje);
    }
    
}
