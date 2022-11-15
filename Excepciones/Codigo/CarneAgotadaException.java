package Excepciones.Codigo;

/**
 *
 * @author Kevin
 */
public class CarneAgotadaException extends IngredienteAgotadoException{
    public CarneAgotadaException(){
        //mensaje por defecto
        super("No alcanza la Carne para preparar ese platillo");
    }
    
    public CarneAgotadaException(String mensaje){
        //personalizado
        super(mensaje);
    }
}
