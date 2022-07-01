public class Restaurante {

    public Restaurante() {
    }

    public Hamburguesa ordenarHamburguesa(String pedido){

        SimpleBurguerFactory factory = new SimpleBurguerFactory();
        Hamburguesa hamburguesa_pedida = factory.crearHamburguesa(pedido);
       
        
        hamburguesa_pedida.preparar();
        return hamburguesa_pedida;

    }

    
    
}
