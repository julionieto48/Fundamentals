#include <iostream>
#include <stdlib.h>
#include "main.h"

using namespace std;

// crear LIFO  
int main() {
  
  Nodo *frente, *fin = NULL;

  agregarlistaRight(frente, fin , 1);
  agregarlistaRight(frente, fin , 3);
  agregarlistaRight(frente, fin , 2);

  cout << "\n";
    
  agregarlistaLeft(frente, fin , 1);
  agregarlistaLeft(frente, fin , 3);
  agregarlistaLeft(frente, fin , 2);
  

  return 0;
}

void agregarlistaRight(Nodo *&frente , Nodo *&fin , int valor){

  
  Nodo *new_nodo = new Nodo();
  new_nodo->dato = valor ; 

  new_nodo-> siguiente = NULL;
  
   
  // vacia
  if(no_tail(frente)){
    
    frente = new_nodo;
    
    
  }else{ // uno o mas nodos
    fin->siguiente = new_nodo;
    
  }
  fin = new_nodo;

  cout<< valor << "-> ";

 
}


void agregarlistaLeft(Nodo *&frente , Nodo *&fin , int valor){

  
  Nodo *new_nodo = new Nodo();
  new_nodo->dato = valor ; 
  
  
  // vacia
  if(no_tail(frente)){
    cout << "hola ";
    new_nodo-> siguiente = NULL;
    frente = new_nodo;
    fin = new_nodo;
    
    
  }else{ // uno o mas nodos
    frente->siguiente = new_nodo;
    
  }
  

  //cout << " <- " << valor  ;

 
}

// funcion 
bool no_tail(Nodo *frente){
  return(frente == NULL)? true : false;
}