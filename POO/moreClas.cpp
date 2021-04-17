//  Created by Julian Esteban Nieto Diaz on.
//  Copyright © 2020 Julian Esteban Nieto Diaz. All rights reserved.
//

// Classes
// formas de agrupar datos 

#include <iostream>
#include <stdlib.h> 
#include "c++v knowledge.h"

using namespace std;

// CREATE/INSTANTIATE OBJECTS



class Jugador
{
public:
	void mover(int xa, int ya) {
		x += xa;
		y += ya;
	}
	
	int x, y, speed;
	
	
	
};
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://
// en una funcion externa paso por ref
void Mover(Jugador& jugador, int xa, int ya) {
	jugador.x += xa * jugador.speed;
	jugador.y += ya * jugador.speed;
}


//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://

int main()
{
	Jugador jugador; // variable hechas de tipos  clase.. son objetos ... un nuevo objeto es una instancia
	jugador.x = 5;
	
	jugador.mover(2,2);
	


	return 0;
}

