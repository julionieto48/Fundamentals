//  Created by Julian Esteban Nieto Diaz on.
//  Copyright © 2020 Julian Esteban Nieto Diaz. All rights reserved.
//

// Metodos constructores y modificadores (geters and seters)
// manipulan los atriburtos d ela clase, debido al encapsulamiento



#include <iostream>
#include <stdlib.h> 
#include "c++v knowledge.h"

using namespace std;

class Punto  // un punto en un plano
{
private:
	int x, y;
public:
	Punto();
	
	void setPunto(int,int); // establecer valores x y y
	int  getPuntoX();
};

//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://

int main()
{
	Punto punto1;

	//punto1.x = 15;  // no pueod acceder  pq esta encapsulado
	punto1.setPunto(2, 1);
	// tampoco se puede cout << punto1.x << endl;
	cout << punto1.getPuntoX() << endl;

	return 0;
}

Punto::Punto()
{
}

// establecer valores a los atributos  , 
void Punto::setPunto(int _x, int _y) {
	x = _x;
	y = _y;
}

int Punto::getPuntoX()
{
	return x;
}
