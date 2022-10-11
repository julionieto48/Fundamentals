import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Main {

  static int longitud(String texto){
    //System.out.println( texto.toCharArray() ); // convierte en array de caracteres y recorrerlo implementando un for each
    int totalCaracteres = 0;
    for (char letra : texto.toCharArray()){
        totalCaracteres++;
    }
    
    // System.out.println(totalCaracteres);
    return totalCaracteres;

  }
  private static boolean isSpecial(char c) {

    String str = String.valueOf(c) ; 
    Pattern patron = Pattern.compile("[a-zA-Z0-9]*");
    Matcher match = patron.matcher(str); // matchea el patron con un string especifico

    if(!match.matches()){ // si hay caracter especial
        return true;
    }
    return false;
    
  }

  static boolean verificacion_caracteres(String texto){
    // debe contener una letra abecedario
    // debe contener al menos un caracter en mayuscula
    char CaracteresMayuscula[] = new char[50];
    char CaracteresMinuscula[] = new char[50];
    char CaracteresNumero[] = new char[50];
    char CaracteresEspeciales[] = new char[50];
    
    int k = 0;
    int n = 0;
    int m = 0;
    int o = 0;
    
    boolean mayus = false , minus = false , dig = false, spec = false;

    char[] texto_array = texto.toCharArray();
    for (int i = 0; i < texto_array.length; i++) {

        if( Character.isLowerCase(texto_array [i])){
            CaracteresMinuscula[k] = texto_array [i];
            k++;
            minus = true; 
        } 


        if ( Character.isUpperCase(texto_array [i])){
            CaracteresMayuscula[n] = texto_array [i];
            n++;
            mayus = true;  
        } 

        if ( Character.isDigit(texto_array [i])){
            CaracteresNumero[m] = texto_array [i];
            m++;
            dig = true;  
        }  

        if ( isSpecial(texto_array [i]) == true){
            CaracteresEspeciales[o] = texto_array [i];
            o++;
            spec = true;  
        } 

        /* // mostrar pq no cumple condicion
        if( !Character.isLowerCase(texto_array [i]) ||!Character.isUpperCase(texto_array [i]) ||!Character.isDigit(texto_array [i])|| !isSpecial(texto_array [i]) == true){
            if(!Character.isLowerCase(texto_array [i])) System.out.println("Contraseña no tiene caracter en minuscula");

            if(!Character.isUpperCase(texto_array [i])) System.out.println("Contraseña no tiene caracter en mayuscula");

            if(!Character.isDigit(texto_array [i])) System.out.println("Contraseña no tiene caracter numerico ");

            if( isSpecial(texto_array [i]) == true) System.out.println("Contraseña no tiene caracter especial");

        } */

        //System.out.println(CaracteresEspeciales); // ver las __ que tiene el arreglo
    }
    if (mayus == true & minus == true & dig == true & spec == true){
        return true;
    }
    return false;
  }



static boolean verifier(String contrasenia){
    boolean pasa = false;
    int totalCaracteres = longitud(contrasenia); // crear metodo propio length 
    boolean stringValid = verificacion_caracteres(contrasenia);

    if (totalCaracteres < 10){
        System.out.println("Su contraseña no tiene los 10 caracteres requeridos");
    } else{
        if(stringValid == true){
            pasa = true;
        }
    }

    if (!pasa == true){
        System.out.println("contraseña no valida");
    }
    if (pasa == true){
        System.out.println("contraseña  valida");
        return true;
    }

    return false;

  }


  public static void main(String[] args) {
   
    /* 
    String prueba1 = "123456789";  // verificar longitud 
    String prueba2 = "AbcdEFghiJKlM!@n13a2587abg";
    String prueba3 = "AbcdEFghiJKlMn13a2587abg";
    String prueba4 = "abcdefg123";
    verifier(prueba4);*/

    String input;  // guarda input
    Scanner keyboard = new Scanner(System.in); // crear el objeto scanner
    System.out.println("Recuerde que la contraseña debe tener al menos 10 caracteres, al menos uno debe ser especial, mayuscula y numero ");
    boolean correct = false;
    do{
        
        System.out.print("Enter a password: ");
        input = keyboard.nextLine();
    
        boolean aprovado = verifier(input);
        correct = aprovado;

    }while(correct == false);

    String doubleverify;
    System.out.println("Digite de nuevo su contraseña aprobada y no olvide aprenderse la contraseña ");
    do{
        doubleverify = keyboard.nextLine();

    }while( !input.equals(doubleverify));
    System.out.println("Bienvenido!!! ");


  }
}