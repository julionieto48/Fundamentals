public class MacNificaRestaurante extends Restaurante{

    

    public MacNificaRestaurante() {
    }


    @Override
    public Hamburguesa  crearHamburguesa(){
        return new MacNifica();
    }

    
}
