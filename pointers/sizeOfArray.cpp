//  Created by Julian Esteban Nieto Diaz on.
//  Copyright © 2020 Julian Esteban Nieto Diaz. All rights reserved.
//

// longitud arreglos 

#include <iostream>
#include <stdlib.h> 
#include "c++v knowledge.h"

using namespace std;

// prototipo funcion 


//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://
int main()
{
	int a[12] = { 1,2,3,4,5,6,7,8,9,10,11,12 };

	int el1 = sizeof(a); // 48 bytes
	int el2 = sizeof(a[0]); // 4 bytes
	int entero = sizeof(int); // 42

	printf(" tamano a =%d , tamano a[0]=%d y tamano de entero es %d", el1, el2, entero);


	int b []= { 1,2,3,4,5,6,7,8,9,10,11,12 };
	int s1 = sizeof(b); // 48 bytes
	int s2 = sizeof(b[0]); // 4 bytes
	int len = s1 / s2 ;  // como se asume que todos tiene el mismo tipo

	printf(" tamano b =%d , tamano b[0]=%d y tamano : %d", s1, s2, len);
	return 0;
}
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://



