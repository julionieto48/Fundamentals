package OnlineStore;

public class KnifeStore {

    class Cuchillo{
        class CuchilloCarne{
            void CuchilloCarne(){}
        }
    
        class CuchilloMantequilla{
            void CuchilloMantequilla(){}
        }

        void afilar(){}
        void empacar(){}
    }

 

    void ordenarCuchillo(String tipoCuchillo){
        // instanciacion concreta
        Cuchillo producto = new Cuchillo(); // mi producto

        if(tipoCuchillo.equals("Carne")){
            //CuchilloCarne cuchillo = new CuchilloCarne;
            Cuchillo.CuchilloCarne cuchillo = producto.new CuchilloCarne();
        } else if(tipoCuchillo.equals("matequilla")) {
            //CuchilloMantequilla cuchillo = new CuchilloMantequilla();
            Cuchillo.CuchilloMantequilla cuchillo = producto.new CuchilloMantequilla();
        }
        // servicios    
        producto.afilar();
        producto.empacar();
    }

    
}
