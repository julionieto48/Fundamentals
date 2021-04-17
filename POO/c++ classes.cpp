//  Created by Julian Esteban Nieto Diaz on.
//  Copyright © 2020 Julian Esteban Nieto Diaz. All rights reserved.
//

// Matriz dinamica

#include <iostream>
#include <stdlib.h> 
#include "c++v knowledge.h"

using namespace std;

// CREATE/INSTANTIATE OBJECTS

class Entidad
{
public:
	Entidad(int,string); // metodo constructor
	void leer();
	void correr();

private:
	int edad;
	string nombre;
	
};


//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://

// constructor ... inicializa los atributos
Entidad::Entidad(int _edad, string _nombre) 
{
	edad = _edad;
	nombre = _nombre;
}

void Entidad::correr()
{
	cout << "tengo" << edad << " años, y ya se correr" << endl;
}

void Entidad::leer()
{
	cout << "Soy" << nombre << " y ya aprendi a leer" << endl;
}

//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://
int main()
{
	Entidad a = Entidad(20, "Jose");
	a.correr();
	Entidad b(45, "Maria");
	b.leer();


	return 0;
}