public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Caja unaCaja = new Caja();
        String s = unaCaja.decorar(15.01);
        System.out.println(s);

        DecorarCajas caja = new DecorarCajas();
        String a = caja.DecorarCajas(15.01);
        System.out.println(a);

        String b = caja.DecorarCajas("menguano");
        System.out.println(b);


        Caja_Uno cj = new Caja_Uno("Hola mundo");
        System.out.println( cj.decorar() );
        System.out.println( cj.getObjeto() ); // en el setter pueod hacer amoldamiento
    }
}
