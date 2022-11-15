package Excepciones.Codigo;

/**
 *
 * @author Kevin
 */
public class UtensiliosInexistentesException extends ElementoAgotadoException{
        public UtensiliosInexistentesException(){
        //mensaje por defecto
        super("No hay utensilios para preparar este platillo");
    }
    
    public UtensiliosInexistentesException(String mensaje){
        //personalizado
        super(mensaje);
    }
}

    

