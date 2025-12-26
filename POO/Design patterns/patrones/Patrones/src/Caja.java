public class Caja{

    public String decorar(int n){
        String s = "" + n; // el numero ahora va ser string
        String linea = "*"; // el simbolo

        for(int i = 0; i < s.length();i++){ // asteriscos correpsondientews al long del numero
            linea += "*";
        }
        linea += "*"; // pongale un asterisco mas 

        return linea + "\n*"+ s +"*\n" + linea;

    }

    public String decorar(double n){
        String s = "" + n; // el numero ahora va ser string
        String linea = "*"; // el simbolo

        for(int i = 0; i < s.length();i++){ 
            linea += "*";
        }
        linea += "*"; 

        return linea + "\n*"+ s +"*\n" + linea;

    }

    // vale la pena sobrecargar todo esto .. integer y double son objetos que heredan de object
}




