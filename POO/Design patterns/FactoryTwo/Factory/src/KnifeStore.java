public class KnifeStore {

  /* se evita la instnaciaicon concreta en un metodo: knife store y su metodo "order knife" pude no ser el unico cliente d eknife factory: pueden haber mas clientes
  
  beneficio de objeto favtory : si hay varios clientes queriendo usar el mismo conjunto de clases , se quita codigo redundant ey s ehace faicl d emodificar

  factory method :
  */
  


  public String afilando(){
    return " afilando ";
  }

  
  public String pulir(){
    return " puliendo ";
  }

  public String empacar(){
    return " empacando ";
  }

  public KnifeStore(knifeFactory factory) { // knife store es un cliente de la fabrica 
    this.factory = factory;
  }

  knifeFactory factory;
  

  

    
    
}
