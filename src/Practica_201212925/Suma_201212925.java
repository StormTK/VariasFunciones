package Practica_201212925;

import java.util.Scanner;

public class Suma_201212925 {
	
	boolean seguirSum;
	int result, veces;
	
	public Suma_201212925(){
		seguirSum = true;
		result = 0;
		veces = 0;
	}
	
	public void SumaProm(){
		Scanner SumaNum = new Scanner(System.in);//Detecta los numeros
		while(seguirSum == true){
			int numTemp = SumaNum.nextInt();//El numero se almacena en una variable temporal
			if(!(numTemp == 0)){//Si el numero no es 0 entonces
				result += numTemp;//Sume los numeros
				veces++;//aumente la cantidad de numeros ingresados
			}else{
				result /= veces;//divida para sacar el promedio
				System.out.println("\nEl Promedio es: " + result );//Imprima el Promedio
				seguirSum = false;//Cierre el Programa
			}
		}
		
	}
	
}
