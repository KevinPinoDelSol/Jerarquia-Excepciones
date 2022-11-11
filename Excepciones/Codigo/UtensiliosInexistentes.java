package Excepciones.Codigo;

/**
 *
 * @author Kevin
 */
public class UtensiliosInexistentes extends ElementoAgotado{
        public UtensiliosInexistentes(){
        //mensaje por defecto
        super("No hay utensilios para preparar este platillo");
    }
    
    public UtensiliosInexistentes(String mensaje){
        //personalizado
        super(mensaje);
    }
}

    

