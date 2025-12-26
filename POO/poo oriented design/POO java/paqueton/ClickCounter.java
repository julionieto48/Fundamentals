package paqueton;
public class ClickCounter {
    private int conteo;
  
    public ClickCounter(){
      conteo = 0;
    }
  
    public  void click(){
      conteo++;
    }
  
    public void setClickCount(int clickCount){
      conteo = clickCount;
    }
  
    public int getClickCount(){
      return conteo;
    }

    public void prueba(){
      System.out.println("Estamos en Click Counter class");
    }
  
  }
  