import java.io.File;
import java.io.IOException;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class XmlData {

    public XmlData() {
        
    }

   
        public NodeList getFoodList() {
            

             /* 1. document builder 2. get document 3.normalizar estructura xml  4. tomer todos los elementos por tag */

            //1
             DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            try {
                DocumentBuilder builder = factory.newDocumentBuilder();

                //2
                Document document = (Document) builder.parse(new File("food_menu.xml"));

                //3
                ((org.w3c.dom.Document) document).getDocumentElement().normalize();

                //4
                NodeList lista_comidas = ((org.w3c.dom.Document) document).getElementsByTagName("food");
                return lista_comidas;

                
                
            } catch (ParserConfigurationException e) {
                               
                e.printStackTrace();
            } catch (SAXException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            return null;
            
            
            
        }
       

        

    


    

   

}
