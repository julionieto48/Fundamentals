package paqueton;

public class InnerClasses {
    int x = 5, suma;

    class InnerInnerClass{
        int y = 10;
    }

    void firstLayer(int z){
        InnerInnerClass interna = new InnerInnerClass();
        suma = interna.y + x;
        System.out.println(suma);
        suma = suma + z;
        System.out.println(suma);
    }
}
