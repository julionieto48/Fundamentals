package paqueton;
/*
un atributo o metodo protejido puede ser accedido por medio de 
* la clase qu elo encapsula
* las subclases
* las clases dle mismo packete (medio en el que se organizan las clases bajo un mismo namespace)

*/


public abstract class Herencia {
    // digamos que super clase es animal ... no voy a crear un objeto animal como tal ya que es una generalizacion 
    protected int numeroDePiernas;
    protected int numeroDeColas;
    protected String nombre;
    public Herencia(String nombreMascota, int piernas , int colas){
        this.numeroDePiernas = piernas;
        this.nombre = nombreMascota;
        this.numeroDeColas = colas;
    }
    public void comer(){};

}
