public class AdaptadorServicio implements IntMultiRestApp{ // objetivo tomar xml y pasarlo a json

    // permite objetos con interfaces incompatibles ... a colaborar entre estas  usando herencia y composicion 
    private final ThirdPartyUIService thirdPartyUIService;

    
    public AdaptadorServicio() {  // constructor none this
        thirdPartyUIService = new ThirdPartyUIService();
    }
    //_______________________________________________

    @Override
    public void mostrarMenus(XmlData xmldata) {
        JsonData jsonData = convertXmlToJson(xmldata);
        thirdPartyUIService.mostrarMenus(jsonData);
        
    }

    

    @Override
    public void mostrarRecomendaciones(XmlData xmldata) {
        JsonData jsonData = convertXmlToJson(xmldata);
        thirdPartyUIService.mostrarRecomendaciones(jsonData);
        
        
    }



    private JsonData convertXmlToJson(XmlData xmldata) {  // metodo q convierte de xml a json 
        return null;
    }
    
}
