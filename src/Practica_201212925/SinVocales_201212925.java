package Practica_201212925;

public class SinVocales_201212925 {
	public String RemoverVocales(String Palabra){
		String SinVocales = "";//Memoria para la palabra sin vocales
		for(int posicion = 0 ; posicion < Palabra.length(); posicion++){
			if(!((Palabra.charAt(posicion) == 65) || (Palabra.charAt(posicion) == 69) || (Palabra.charAt(posicion) == 73) || (Palabra.charAt(posicion) == 79) || (Palabra.charAt(posicion) == 85) || (Palabra.charAt(posicion) == 97) || (Palabra.charAt(posicion) == 101) || (Palabra.charAt(posicion) == 105) || (Palabra.charAt(posicion) == 111) || (Palabra.charAt(posicion) == 117))){//Si no son ninguna de esos caracteres
				SinVocales = SinVocales + Palabra.charAt(posicion);//Agregar sin vocales
			}
		}
		return SinVocales;//retorna la palabra sin vocales
	}
}
