package Excepciones.Codigo;

/**
 *
 * @author Kevin
 */
public class AceiteAgotado extends IngredienteAgotado{
    public AceiteAgotado(){
        //mensaje por defecto
        super("No alcanza el aceite para preparar el platillo");
    }
    
    public AceiteAgotado(String mensaje){
        //personalizado
        super(mensaje);
    }
}
