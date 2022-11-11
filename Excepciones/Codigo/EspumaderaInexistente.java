package Excepciones.Codigo;

/**
 *
 * @author Kevin
 */
public class EspumaderaInexistente extends ElementoAgotado{
        public EspumaderaInexistente(){
        //mensaje por defecto
        super("Es ecesaria una espumadera para preparar este platillo.");
    }
    
    public EspumaderaInexistente(String mensaje){
        //personalizado
        super(mensaje);
    }
}
