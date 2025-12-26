public class DecorarCajas {

    public String DecorarCajas(Object obj){
        String s = obj.toString(); 
        String linea = "*"; // el simbolo
          



        for(int i = 0; i < s.length();i++){ 
            linea += "*";
        }
        linea += "*"; 

        return linea + "\n*"+ s +"*\n" + linea;

    }
    
}
