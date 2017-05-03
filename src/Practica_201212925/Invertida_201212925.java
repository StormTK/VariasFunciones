package Practica_201212925;

public class Invertida_201212925 {

	public String PalabraInvertida(String Palabra){
		String PalabraInv = "";//Variable para la palabra invertida
		for(int posicion = (Palabra.length()-1); posicion >= 0; posicion--){//Lee toda las letras desde la ultima posicion
			PalabraInv = PalabraInv + Palabra.charAt(posicion);//Agrega las letras a la nueva variable pero alrevez
		}
		return PalabraInv;//retorna la palabra
	}
	
}

