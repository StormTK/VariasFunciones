package Practica_201212925;

public class Paridad_201212925 {
	
	public String Paridad(String num){
		int numero = Integer.parseInt(num);
		if((numero % 2) == 0){//Si el numero dividido por 2 no es exacto
			return "El numero " + numero + " es Par";//Imprimir que es par
		}else{
			return "El numero " + numero + " es Impar";//Imprimir que es impar
		}
		
	}
	
}
