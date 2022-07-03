import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class MultiRestApp implements IntMultiRestApp{
    // esta es la aplicacion principal dond emuestro info a mi usuario por default y tiene su interface 
    @Override
    public void mostrarMenus(XmlData xmldata) {
        NodeList lista = xmldata.getFoodList();

        for(int i = 0; i < lista.getLength(); i++){
            Node comida = lista.item(i);
            System.out.println(comida);
        }

        
        
    }

    @Override
    public void mostrarRecomendaciones(XmlData xmldata) {
        // TODO Auto-generated method stub ... muestra menu usando datos xml
        
    }
    
}