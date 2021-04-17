//  Created by Julian Esteban Nieto Diaz on.
//  Copyright © 2020 Julian Esteban Nieto Diaz. All rights reserved.
//

// Herencia



#include <iostream>
#include <stdlib.h> 
#include "c++v knowledge.h"

using namespace std;

// patron strategy :
/*
patorn d eopcmportamiento, encapsula logicas y permite cambiar entre ellas
crear objetos ... que representen estrategias, siguen un patron o heredan de una clase abstracta... conseguir polimorfismo


*/

struct Robot {

	// declarar structuras estrategia
	struct Buscar {
		virtual void aplicar(Robot& r) = 0;
		virtual ~Buscar() = default;
	};
	struct Atacar{
		virtual void aplicar(Robot& r) = 0;
		virtual ~Atacar() = default;
	};
	struct Defender {
		virtual void aplicar(Robot& r) = 0;
		virtual ~Defender() = default;
	};

	//Constructor:  inicializa las estrategias
	Robot(Buscar* buscar, Atacar* atacar, Defender* defender) :
		mBuscar(buscar), mAtacar(atacar), mDefender(defender) {}

	void buscar() { mBuscar->aplicar(*this); }
	void atacar() { mAtacar->aplicar(*this); }
	void defender() { mDefender->aplicar(*this); }

private:

	// apuntadores a las estrategias
	Buscar* mBuscar;  // son elegidos por el usuario el cual especifica el tipo de robot que desea
	Atacar* mAtacar; 
	Defender* mDefender; 

};



//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://
// anadir las estrategias  Busqueda: linear , espiral     Ataque: mordida , golpe de ala  Defensa: bloqueo

struct Lineal : Robot::Buscar
{
	void aplicar(Robot& r) { cout << "busco linelamente" << endl; }
};
struct Espiral : Robot::Buscar
{
	void aplicar(Robot& r) { cout << "busco espiralmente" << endl; }
};


struct Mordida: Robot::Atacar
{
	void aplicar(Robot& r) { cout << "mordida" << endl; }
};
struct GolpeDeAla : Robot::Atacar
{
	void aplicar(Robot& r) { cout << "toma tu chucha" << endl; }
};

struct Bloqueo : Robot::Defender
{
	void aplicar(Robot& r) { cout << "solo se defenderme asi" << endl; }
};
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://



int main()
{
	Lineal lineal; Espiral espiral;
	Mordida mordida; GolpeDeAla punch;
	Bloqueo block;

	Robot bender(&lineal,&punch,&block);
	
	return 0;
}
