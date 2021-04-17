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



class Log
{
public:
	const int LoglevelError = 0;
	const int LoglevelWarn = 1;
	const int LoglevelInfo = 2;
private:
	int mLogLevel;

public:
	void Setlevel(int nivel) {
		mLogLevel = nivel;
	}

	void error(const char* mensaje) {
		if (mLogLevel >= LoglevelError) {
			cout << "[Error]: " << mensaje << endl;
		}
		
	}
	void warn(const char* mensaje) {
		if (mLogLevel >= LoglevelWarn) {
			cout << "[Advertencia]: " << mensaje << endl;
		}
	}
	void info(const char* mensaje) {
		if (mLogLevel >= LoglevelInfo) {
			cout << "[info]: " << mensaje << endl;
		}
	}
			
};

//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://

int main()
{
	
	Log log;
	log.Setlevel(2);
	log.warn("hola");

	log.Setlevel(log.LoglevelInfo);
	log.info("hola");


	return 0;
}

