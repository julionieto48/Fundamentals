public class knifeFactory {

    private String knifetype ;

    public KnifeStore creatKnife(String knifetype){ // retorno un objeto 

        KnifeStore knife = null;  // instanciar en null

        if(knifetype.equals("Carnes")){
            knife = new SteakKnife();
        } else if("Pan"){
            knife = new BreadKnife();
        }


        return knife;

    }



    
    
}
