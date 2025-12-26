
import java.util.Scanner;

import paqueton.ClickCounter;
import paqueton.*;


/*

object orinted design - principles 
 - abstraction : simplificar un concepto al dividirlo - respecto a un concept  // regla del menor asombro : abstraccion captura un concepto sin ir mas alla dle alcance
 - encampsulacion:  ...modificadores de acceso d evariables miembro y metodos
 - decomposicion : descompone rlospedazos en piezas mas ocmpactas y sencillas d eentender - como las partes interactuan con el todo
 ej: statico un refrigerador tiene un congelador  dinamico: todo el objeto puede tener nuevas instancias en un carro cambian lospasajeros
  vida util estrechamente relacionada ... hay parttes que seocmparten al mismo tiempo 
  - generalizacion : como cuando uno reduce ocdigo en un solo metodo ... en las clases la generalizacion se da por medio de la herencia 
  clase padre e hija... la hija hereda comportaminetos y atributos de su padre ... a su vez las hijas puden tener propios metodos qu elas haran unicas ..superclass vs sub class


*/

class Carro extends Vehiculo{
  String modelo = "Mustang";
}

class Principal {

 
  public static void main(String[] args) {
    //Scanner sc= new Scanner(System.in);  
    //int entrada = sc.nextInt();
    
    ClickCounter ck = new ClickCounter();
    ck.prueba();

    Constructor c = new Constructor();
    

    Encapsulacion enc = new Encapsulacion();
    enc.setNombre("Juan");
    System.out.println(enc.getNombre());
    

    Ejemplo e = new Ejemplo();
    e.metodo();
    e.metodo();

    /* probando clases internas 
    InnerClasses inner =new InnerClasses();
    inner.firstLayer(5);

    InnerClasses externa = new InnerClasses();
    InnerClasses.InnerInnerClass interna = externa.new InnerInnerClass();
    System.out.println(myInner.y + myOuter.x);
    */
    Carro car = new Carro();
    car.pitar();
    System.out.println(car.marca + " " + car.modelo);

    
  


  }
} 