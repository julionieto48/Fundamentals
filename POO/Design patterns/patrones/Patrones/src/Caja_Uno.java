public class Caja_Uno {
    protected Object obj ;

    public Caja_Uno(Object obj){
        this.obj = obj;
    }

    public Object getObjeto(){
        return this.obj;
    }




    public  String decorar(){
        String s = obj.toString(); 
        String linea = "*"; // el simbolo
        
          
        for(int i = 0; i < s.length();i++){ 
            linea += "*";
        }
        linea += "*"; 

        return linea + "\n*"+ s +"*\n" + linea;

    }
    
}












