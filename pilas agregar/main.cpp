 // data structures.cpp : Este archivo contiene la función "main". La ejecución del programa comienza y termina ahí.
//

#include <iostream>
#include <stdlib.h> 
#include "main.h"

using namespace std;

int primerValor = 0;
int ultimoValor = 0;

int main()
{
    //std::cout << "Hello World!\n";
    ejecutar();
}


void agregarAlFrente(Nodo*& front, int valor) { 
    Nodo* casilla = new Nodo(); 
    casilla->dato = valor;        
    casilla->siguiente = front;  
    front = casilla;            
    
    // cout << "valor " << valor << " se inserto " << endl ;
    
}


void mostrar(Nodo* n){
    int cantidadNodos = 0; // para conta rlos nodos
    if (n == NULL) {
        cout << " Lista Esta Vacia";
    }

    struct Nodo *ptr = NULL;  // creo mi nodo artificial
    ptr = n ; // este va a tomar el valor de donde esta head
    
    while(ptr !=NULL){
      cantidadNodos++;
      ptr = ptr->siguiente; // el apuntador ptr tomara el valor del nodo siguiente hasta que se nulo
       

      if (ptr == NULL){
        primerValor = n->dato;
        
      }
    }


    // imprimendo ya todo
    
    
    while (n != NULL) {
      if (n->dato == primerValor){
        cout << n->dato ;
        n = n->siguiente;
      }else{
        cout <<  " -> " << n->dato;
        n = n->siguiente;
      }

      if(n == NULL){
        cout << "\n";
      }
     
    }

    cout <<  " Total Nodos: " << cantidadNodos << endl ;
    cout <<  " Primer Nodo (head): " << primerValor ;
}


//::::::::::::::::::::::::::::::::::::::::Metodo de ejecucion::::::::::::::::::::::::::::::::::::::://
void ejecutar() {
    Nodo* elemento = NULL;
    

    agregarAlFrente(elemento, 5);
    agregarAlFrente(elemento, 6);
    agregarAlFrente(elemento, 7);
    agregarAlFrente(elemento, 8);

    mostrar(elemento);
    
    
}