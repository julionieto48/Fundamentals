import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



class Hielocos {
  
  static void ColorDeHieloco(){
    String[] lista = { "amarillo","verde","azul","azul","azul","amarillo","verde","gris","azul","gris"};
   
    ArrayList<String> listaColores  = new ArrayList<String>();
    ArrayList<String> aux = new ArrayList<String>(); 
    listaColores.addAll(Arrays.asList(lista));
    System.out.println(listaColores);


    for (int i = 0;i < listaColores.size()-1; i++){

      if (i + 1 < listaColores.size()  ){
        //System.out.println(listaColores.get(i) + listaColores.get(i+1) );
        if(listaColores.get(i) != listaColores.get(i+1)){
          aux.add(listaColores.get(i));
        }
      }
      
      if(i + 1 == listaColores.size() - 1){ // acceder a la ultima posicion
        if(listaColores.get(i+1) != listaColores.get(i) ){ // si la ultima posicion e sigual a la penultima no se añade al auxiliar
          //System.out.println(listaColores.get(i+1) + listaColores.get(i) );
          aux.add(listaColores.get(i+1));
        }
      }
    }
    listaColores = aux;
    System.out.println(listaColores); 
  }

  


  public static void main(String[] args) {
    ColorDeHieloco();
    
  }
}