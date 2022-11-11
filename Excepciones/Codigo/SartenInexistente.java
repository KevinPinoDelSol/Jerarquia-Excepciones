package Excepciones.Codigo;

/**
 *
 * @author Kevin
 */
public class SartenInexistente extends UtensiliosInexistentes {
        public SartenInexistente(){
        //mensaje por defecto
        super("Es necesario un sarten para preparar este platillo");
    }
    
    public SartenInexistente(String mensaje){
        //personalizado
        super(mensaje);
    }
}

