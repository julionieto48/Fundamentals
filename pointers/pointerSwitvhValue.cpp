//  Created by Julian Esteban Nieto Diaz on.
//  Copyright © 2020 Julian Esteban Nieto Diaz. All rights reserved.
//

// cambiar valores con punteros

#include <iostream>
#include <stdlib.h> //new y delete 
#include "c++v knowledge.h"

using namespace std;

// prototipo funcion 
void cambio(float *, float *);



//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://
int main()
{
	float a = 5.4, b = 2.0 ;
	cout << "primer valor es : " << a << endl;
	cout << "segundo valorb  : " << b << endl;
	cambio(&a,&b); 

	
	cout << "cambiando .... \n";
	cout << "primer valor es : " << a << endl;
	cout << "segundo valorb  : " << b << endl;
	
	return 0;
}
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://

void cambio(float *direccionA , float *direccionB) {
	float aux;
	aux = *direccionA;
	*direccionA = *direccionB;
	*direccionB = aux;
}

