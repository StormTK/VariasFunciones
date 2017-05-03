package Practica_201212925;

import java.util.StringTokenizer;

public class NumConsecutivos_201212925 {
	public String Comprobar(String CadenaNum){
		
		int numeros[] = new int[5];
		int posicionCadNum = 0;
		
		/*String TempNum = "0";
		for(int i = 0; i <= (CadenaNum.length() - 1); i++){//Ingrese el numero
			if(!(CadenaNum.charAt(i) == 45)){//si no es guion entonces
				TempNum += CadenaNum.charAt(i);//que almacene el numero en una variable temporal
			}else{//Si existe un guion
				numeros[posicionCadNum] = Integer.parseInt(TempNum);//Guarde el numero
				posicionCadNum++;//Aumente la posicion
				TempNum = "";//Vacie la variable temporal
			}
		}numeros[posicionCadNum] = Integer.parseInt(TempNum);//agrege el ultimo numero que falta a la ultima casilla
		
		 */
		
		StringTokenizer Quitarsigno = new StringTokenizer(CadenaNum,"-");//Busque en la palabra el signo
		while(Quitarsigno.hasMoreTokens()){//Que si aun hay elementos 
			numeros[posicionCadNum] = Integer.parseInt(Quitarsigno.nextToken());//Que guarde el numero
			posicionCadNum++;//Aumente la posicion
        }
		
		if( ((numeros[0] + 1) == numeros[1]) && ((numeros[0] + 2) == numeros[2]) && ((numeros[0] + 3) == numeros[3]) && ((numeros[0] + 4) == numeros[4])){//Compare el numero para saber si son consecutivos
			return "Si son numeros Enteros consecutivos";
		}else{
			return "No son numeros Enteros Consecutivos";
		}
	}
}
