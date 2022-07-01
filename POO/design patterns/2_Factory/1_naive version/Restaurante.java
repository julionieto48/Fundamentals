public class Restaurante {

    public Restaurante() {
    }

    public Hamburguesa ordenarHamburguesa(String pedido){

        Hamburguesa hamburguesa_pedida = null;

        if("macNifica".equals(pedido)){
            hamburguesa_pedida = new MacNifica();
            hamburguesa_pedida.preparar();
            
        } else if( "corralisima".equals(pedido) ){
            hamburguesa_pedida = new Corralisima();
            hamburguesa_pedida.preparar();
            
        }
        
        
        return hamburguesa_pedida;

    }

    
    
}
