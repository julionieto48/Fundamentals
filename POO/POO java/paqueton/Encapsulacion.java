package paqueton;

/*
getter methods: recuperan datos , empiezan con el nombre del atributo que van a retornar

setter cambia los datos, setean un atributo privado de forma segura 
*/

public class Encapsulacion {

    /* estudiante : solo la clase puede acceder a los privados(los oculta de fuera de la clase )
    la unica mnera d emodificalros es usando funciones publicas, que permiten el acceso a estos */ 

    private float id;
    private String programaEstudio;
    private float calif;
    private String nombre; 

    public float getId(){
        return id;
    }

    public void setId(float newId){
        id = newId;
    }

    // para cambiar de titulacion se debe modificar las claificaicones

    public void setTitulacion(String newTitulacion){
        if (calif > 2.7) {
            programaEstudio =newTitulacion;
        }

    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;  // this. el atributo
    }

    
}
