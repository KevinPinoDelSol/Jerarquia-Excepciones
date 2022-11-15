package Excepciones.Codigo;

/**
 *
 * @author Kevin
 */
public class EspumaderaInexistenteException extends ElementoAgotadoException{
        public EspumaderaInexistenteException(){
        //mensaje por defecto
        super("Es ecesaria una espumadera para preparar este platillo.");
    }
    
    public EspumaderaInexistenteException(String mensaje){
        //personalizado
        super(mensaje);
    }
}
