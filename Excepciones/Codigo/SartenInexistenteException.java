package Excepciones.Codigo;

/**
 *
 * @author Kevin
 */
public class SartenInexistenteException extends UtensiliosInexistentesException {
        public SartenInexistenteException(){
        //mensaje por defecto
        super("Es necesario un sarten para preparar este platillo");
    }
    
    public SartenInexistenteException(String mensaje){
        //personalizado
        super(mensaje);
    }
}

