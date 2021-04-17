//  Created by Julian Esteban Nieto Diaz on.
//  Copyright © 2020 Julian Esteban Nieto Diaz. All rights reserved.
//

// transmision de arrelgos

#include <iostream>
#include <stdlib.h> 
#include "c++v knowledge.h"

using namespace std;

// asignasion dinamica de arreglos

void encontrarMaximo(int * ,int);

//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://
int main()
{
	


	int b []= { 1,2,3,4,5,6,7,8,9,10,11,12 };
	int s1 = sizeof(b); // 48 bytes
	int s2 = sizeof(b[0]); // 4 bytes
	int len = s1 / s2 ;  // como se asume que todos tiene el mismo tipo

	encontrarMaximo(b, len);
	
	return 0;
}
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://

void encontrarMaximo(int *direccionVector ,int longitudArreglo)
{
	int maximo = 0;

	for (int i = 0; i < longitudArreglo; i++) {
		if ( *(direccionVector + i) > maximo ) {   // direccionVector + i direccion por direccion se v aincrementando  , operador * muestra el vlaor
			maximo = *(direccionVector + i);
		}

	}

	cout << maximo;
}
