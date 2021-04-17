//  Created by Julian Esteban Nieto Diaz on.
//  Copyright © 2020 Julian Esteban Nieto Diaz. All rights reserved.
//

// transmision de arrelgos

#include <iostream>
#include <stdlib.h> 
#include "c++v knowledge.h"

using namespace std;

// matriz dinamica 
// rellenar matriz nxm mostrando ocntenido 

void pedirData();
void mostrarData(int **, int , int );

int **punteroMatriz; // puntero de punteros ,  senala a una matriz 
int numFilas = 5, numCol = 3;
/*
    **punteroMatriz -> *punteroFila -> [] [] []
	                   *punteroFila -> [] [] []
	                   *punteroFila -> [] [] []
					   * 
					   *1 2 3 -> 1 -> 2 3
					   *4 5 6 -> 4 -> 5 6
					   *7 8 9 -> 7 -> 8 9
*/

//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://
int main()
{
	pedirData();
	mostrarData(punteroMatriz, numFilas, numCol);
	
	// delete columns
	for (int i = 0; i < numFilas; i++){
		delete[] punteroMatriz[i];
	}

	delete[] punteroMatriz;

	
	return 0;
}
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://

void pedirData()
{
	// Reservar memoria
	punteroMatriz = new int *[numFilas] ; // reservar memoria de las filaa y sus filas iniciales

	// .. pero debo asignar tbn las columnas 
	for (int i = 0; i < numFilas; i++){
		punteroMatriz[i] = new int [numCol];
	}

	// ingresar valores 
	for (int i = 0; i < numFilas; i++){
		for (int j = 0; j < numCol; j++) {
			cout<<"ingrese valor: ["<< i <<"] [" << j << "] ";
			cin >> *(*(punteroMatriz + i)+ j);

		}
	}
}

void mostrarData(int** punteroMatriz, int numFilas, int numCol) {
	for (int i = 0; i < numFilas; i++) {
		for (int j = 0; j < numCol; j++) {

			cout << *(*(punteroMatriz + i) + j);
		}
		cout << "\n";
	}
}
