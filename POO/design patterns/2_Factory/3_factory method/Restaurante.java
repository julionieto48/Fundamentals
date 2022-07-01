public abstract class Restaurante { // con el objetivo que... crear metodo sea abstracto esta no puede ser instanciada solo heredada

    public Restaurante() {
    }

    public Hamburguesa ordenarHamburguesa(){

        Hamburguesa hamburguesa_pedida = crearHamburguesa();  // la creacion de hamburguesa ya no depende de la entrada d eorden los usuarios lo instancian en el main 
 
        hamburguesa_pedida.preparar();
        return hamburguesa_pedida;

    }

    public abstract Hamburguesa  crearHamburguesa();  // factory method sera implementado por las sub clases ... define qu ehacer ... no como 

    
    
}
