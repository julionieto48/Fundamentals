public class CorralisimaRestaurante extends Restaurante {

    public CorralisimaRestaurante() {
    }

    @Override
    public Hamburguesa  crearHamburguesa(){
        return new Corralisima();
    }
    
}
