 

public class Main{

    
    public static void main(String[] args) {
        
        Restaurante corralisima_rest = new CorralisimaRestaurante();
        Hamburguesa corralisima_hamburguesa = corralisima_rest.ordenarHamburguesa(); // los usuarios ordenan ... no crean 

        Restaurante macnifica_rest = new MacNificaRestaurante();
        Hamburguesa macnifica_hamburguesa = macnifica_rest.ordenarHamburguesa();
        
    }
}
