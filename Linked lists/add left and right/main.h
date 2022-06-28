 #pragma once
#include <iostream>


struct Nodo {
    int dato; // va a ser un valor
    Nodo* siguiente;
};

void agregarlistaRight(Nodo *&frente ,Nodo *&fin , int valor);
void agregarlistaLeft(Nodo *&frente ,Nodo *&fin , int valor);
bool no_tail(Nodo *frente);
