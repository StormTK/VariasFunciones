package Practica_201212925;

public class Mayusculas_201212925 {
	
	public int ContadorMayusculas(String Palabra) {
        int contadorM = 0;//El contador inicia en 0
        for (int i = 0; i < Palabra.length(); i++) {//for para leer todas las letras
            if((Palabra.charAt(i) >= 63) && (Palabra.charAt(i) <= 90)){//Si son mayusculas
            	contadorM++;//Aumenta por cada mayuscula
            }            	
        }
        return contadorM;//Regresa el numero de letras mayusculas
     }
	
}
