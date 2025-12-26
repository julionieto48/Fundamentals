package Singleton;

/*
Singleton es creacional .. dexvribe como se crea un objeto
El patrón Singleton se refiere a tener solo un objeto de una clase.

evitar conflictos o inconsistencias. Otro objetivo del patrón de diseño de Singleton es que el único objeto sea accesible globalmente dentro del programa.

de forma informal. Después de crear una instancia de una clase, te haces una nota mental a ti mismo, no para crear otra instancia, y el problema se resuelve, más o menos. Si olvida y crea otra instancia, entonces puede causarle dolores de cabeza. 
Esta tampoco es definitivamente una solución viable en proyectos más grandes, o proyectos con varios desarrolladores. Nos gustaría evitar errores que surjan de múltiples objetos 

Si tiene una clase con un constructor público, este constructor puede crear una instancia de un objeto de esta clase en cualquier momento. No hay nada que impida que una parte diferente del software cree otro objeto de esta clase. En su lugar, entonces, le da a la clase un constructor privado, de modo que no se puede llamar al constructor desde fuera de la clase. Esto crea una aparente contradicción. 
El constructor es privado, por lo que no se puede llamar fuera de su clase. Entonces, ¿cómo se crea un objeto de esta clase sin un constructor público?


*/

public class Single {
    private static Single unicaInstancia = null; // variable de clase se refiere a la instancia de su clase, solo s emodifica dentro de la clase
    
    private Single(){} 

    public static Single getInstance(){ // metodo publico crea una instancia de esta clase, solo puede habe runa instancia
        if (unicaInstancia == null){
            unicaInstancia = new Single();
        }
        return unicaInstancia;
    }


   

}
