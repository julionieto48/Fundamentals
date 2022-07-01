public class SimpleBurguerFactory {

    public SimpleBurguerFactory() {
    }

    public Hamburguesa crearHamburguesa(String pedido){

        Hamburguesa hamburguesa_pedida = null;

        if("macNifica".equals(pedido)){
            hamburguesa_pedida = new MacNifica();
            
            
        } else if( "corralisima".equals(pedido) ){
            hamburguesa_pedida = new Corralisima();
                        
        }
        return hamburguesa_pedida;    

    }

    
    
}
