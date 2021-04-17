//  Created by Julian Esteban Nieto Diaz on.
//  Copyright © 2020 Julian Esteban Nieto Diaz. All rights reserved.
//

// Herencia



#include <iostream>
#include <stdlib.h> 
#include "c++v knowledge.h"

using namespace std;

class Persona
{
private:
	string nombre;
	int edad;
public:
	Persona(string , int);
	void mostrarPersona();

};

//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://
//  La clase alumno va a ser hija de persona ... pq los alumnos son perosnas

class Alumno : public Persona {  // public pq puedo accedewr a lo publico d ela persona ...alumno tiene atributos extra

private:
	string codigoAlumno;
	float notaFinal;

public:
	Alumno(string,int,string,float); // cosntructor toma los atributos d ela super clase o clase padre
	void mostrarAlumno();
};

//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://

int main()
{
	Alumno estudianteA("Paco", 20, "45hg", 5.0);
	estudianteA.mostrarAlumno();
	
	return 0;
}

Persona::Persona(string _nombre, int _edad)
{
	nombre = _nombre;
	edad = _edad;
}

void Persona::mostrarPersona()
{
	cout << "Nombre: " << nombre << endl;
	cout << "Edad: " << edad << endl;
}

Alumno::Alumno(string _nombre, int _edad , string _codigoAlumno, float _notaFinal) : Persona(_nombre,_edad) // no voy a pedir nombre y edad ya los herede de Persona
{
	codigoAlumno = _codigoAlumno;
	notaFinal = _notaFinal;
}

void Alumno::mostrarAlumno()
{
	mostrarPersona();
	cout << "codigo: " << codigoAlumno << endl;
	cout << "nota:" << notaFinal << endl;

}
