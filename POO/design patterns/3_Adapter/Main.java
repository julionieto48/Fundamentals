

public class Main{

    // aplicacion principal recopila multiples menus en formato xml y los presenta a usuarios, se hace laianza con compania de 3ros que nos entregan la info en json
    
    public static void main(String[] args) {
        

        IntMultiRestApp multiRestApp = new MultiRestApp(); 
        
        multiRestApp.mostrarMenus(new XmlData);
        
    }
}
