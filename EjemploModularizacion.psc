Algoritmo modularizacion_ejemplo
	
	//suma
	
	Funcion Suma(operandoUno, operandoDos)
		
		Definir  resultado Como Real
		Escribir "Ingrese el primer valor"
		Leer operandoUno
		Escribir  "Ingrese el segundo valor"
		Leer operandoDos
		
		resultado <- operandoUno + operandoDos
		
		Escribir  " La suma es: " ,resultado
		
FinFuncion
//fin suma

// resta
Funcion Resta(operandoUno, operandoDos)
	
	Definir  resultado Como Real
	Escribir "Ingrese el primer valor"
	Leer operandoUno
	Escribir  "Ingrese el segundo valor"
	Leer operandoDos
	
	resultado <- operandoUno - operandoDos
	
	Escribir  " La Resta es: " ,resultado
	
FinFuncion
//fin resta

//multiplicacion
Funcion Multiplicacion(operandoUno, operandoDos)
	
	Definir  resultado Como Real
	Escribir "Ingrese el primer valor"
	Leer operandoUno
	Escribir  "Ingrese el segundo valor"
	Leer operandoDos
	
	resultado <- operandoUno * operandoDos
	
	Escribir  " La Multiplicacion  es: " ,resultado
	
FinFuncion
//fin Multiplicacion

//Division
Funcion Division(operandoUno, operandoDos)
	
	Definir  resultado Como Real
	Escribir "Ingrese el primer valor"
	Leer operandoUno
	Escribir  "Ingrese el segundo valor"
	Leer operandoDos
	
	resultado <- operandoUno / operandoDos
	
	Escribir  " La Division es: " ,resultado
	
	
FinFuncion
// fin division

Algoritmo calculadora
	definir numero1, numero2 como real
	
	Definir operacion Como Entero
	Escribir "Calculadora"
	escribir "1. Suma"
	escribir "2. Resta"
	Escribir "3. Multiplicación"
	escribir "4. Division"
	Escribir "Seleccione una Opcion "
	
	
	Leer operacion
	
	Segun operacion Hacer
		1: Suma(numero1,numero2)
		2: Resta(numero1,numero2)
		3: Multiplicacion(numero1,numero2)
		4: Division(numero1,numero2)
	FinSegun

	

FinAlgoritmo
