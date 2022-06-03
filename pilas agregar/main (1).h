#pragma once
#include <iostream>


struct Nodo {
    int dato; // va a ser un valor
    Nodo* siguiente;
};

void agregarAlFrente(Nodo*& front, int valor);
void ejecutar();
void mostrar(Nodo* n);
