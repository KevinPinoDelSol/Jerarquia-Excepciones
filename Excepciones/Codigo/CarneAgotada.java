package Excepciones.Codigo;

/**
 *
 * @author Kevin
 */
public class CarneAgotada extends IngredienteAgotado{
    public CarneAgotada(){
        //mensaje por defecto
        super("No alcanza la Carne para preparar ese platillo");
    }
    
    public CarneAgotada(String mensaje){
        //personalizado
        super(mensaje);
    }
}
