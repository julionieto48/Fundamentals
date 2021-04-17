//  Created by Julian Esteban Nieto Diaz on.
//  Copyright © 2020 Julian Esteban Nieto Diaz. All rights reserved.
//

// ASIGNACION dinamica de arreglos

#include <iostream>
#include <stdlib.h> //new y delete 
#include "c++v knowledge.h"

using namespace std;

// prototipo funcion 
void pedirIngreso();
void mostrarArreglo();
int tamano, *valores;

//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://
int main()
{
	void pedirIngreso(); 
	void mostrarArreglo();
	delete[] valores;
	
	return 0;
}
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://

void pedirIngreso() {
	cout << "que tan grande es el array? : ";
	cin >> tamano ;

	valores = new int[tamano]; // reseva bytes 

	for (int i = 0; i < tamano; i++) {
		cout << "ingresa valor : ";
		cin >> valores[i];
	}
}

void mostrarArreglo() {
	cout << "imprimiendo el arreglo: \n ";
	for (int i = 0; i < tamano; i++) {
		cout << valores[i]<< endl ;
	}
}