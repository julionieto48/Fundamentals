package paqueton;

public class Dog extends Herencia {

    public Dog(String nombreMascota, int piernas, int colas) {
        super(nombreMascota, piernas, colas);
    }
    public void jugarFrisbee(){}; 

    /* instancia d euna subclase
    Crear instancias de objetos de una clase mediante el uso de constructores. 
    Con herencia, si desea una instancia de una subclase, necesita darle a la superclase la oportunidad de preparar los atributos para el objeto apropiadamente. 
    Las clases pueden tener constructores implícitos o constructores explícitos. 
    En esta implementación de la clase Animal, tenemos un constructor implícito, ya que no hemos escrito nuestro propio constructor. A todos los atributos se les asigna cero o nulo, cuando se usa el constructor predeterminado
    */ 
    
    
}
