package Practica_201212925;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero_201212925 {
	
	public void Adivina(){
		Random NumRandom = new Random();//Crea un numero Random
		int NumAdivinador = 0;//Es la variable donde guardara el dato que ingresaremos
		int LimiteFinal = 99;
		int LimiteInicial = 1;
		Scanner IngresarNum = new Scanner(System.in);//Ingresar numero
		boolean AdivinaNumero = true;
		int valor = NumRandom.nextInt(LimiteFinal+LimiteInicial);
		do{
			System.out.println("\n********************************");
			System.out.println("Adivina el numero: ");
			NumAdivinador = IngresarNum.nextInt();
			if(NumAdivinador == valor){//Si adivan el numero que lo felicite
				AdivinaNumero = false;
				System.out.println("Felicidades! Adivinastes el numero");
			}
			if(NumAdivinador > valor){//Si no adivina el numero que le de una pista
				System.out.println("Fallastes! Tu numero es mayor");
			}
			if(NumAdivinador < valor){
				System.out.println("Fallastes! Tu numero es menor");
			}
		}while(AdivinaNumero == true);
	}
	
}
