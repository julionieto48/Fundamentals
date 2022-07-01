
public class Main {
  public static void main(String[] args) {

        /*Logger log = new Logger(); /lo que usualmente se hace si el constructor es publico */
        Logger log1 = Logger.getLog();  // regresa un objeto de tipo logger
        log1.log("Hi"); 

        Logger log2 = Logger.getLog(); // lo1 y log2 hacen referencia a la mism ainstancia 

        log1.setValor(5, "ta tara ra ra ... ra");
        System.out.println(log1.getValor());
        System.out.println(log2.getValor());

    }
}
