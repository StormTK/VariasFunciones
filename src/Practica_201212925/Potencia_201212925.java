package Practica_201212925;

import java.util.StringTokenizer;

public class Potencia_201212925 {
	
	public Potencia_201212925(){
		
	}
	
	//---------------Potencia Multiplicaciones
	public int Mult(int base, int exp){
		int resultado = 1;
		for(int x = 0; x < exp; x++){
			resultado *= base;
		}
		return resultado;
	}
	
	public void getMult(String CadNumero){
		StringTokenizer Quitarsigno = new StringTokenizer(CadNumero,",");
		int Numero[] = new int[2];
		int x = 0;
		while(Quitarsigno.hasMoreTokens()){
			Numero[x] = Integer.parseInt(Quitarsigno.nextToken());
			x++;
        }
		System.out.println("La Potencia de " + Numero[0] + "^" + Numero[1] + " = " + Mult(Numero[0], Numero[1]));
	}
	
	//---------------Potencia Sumatorias
	public int Sum(int base, int exp){
		int resultado = 0;
		for(int x = 0; x <= exp; x++){
			for(int y = 1; y <= base; y++){
				resultado += base;
			}
		}
		return resultado;
	}
	
	public void getSum(String CadNumero){
		StringTokenizer Quitarsigno = new StringTokenizer(CadNumero,",");
		int Numero[] = new int[2];
		int x = 0;
		while(Quitarsigno.hasMoreTokens()){
			Numero[x] = Integer.parseInt(Quitarsigno.nextToken());
			x++;
        }
		System.out.println("La Potencia de " + Numero[0] + "^" + Numero[1] + " = " + Sum(Numero[0], Numero[1]));
	}
	
	//---------------------Recursividad
	public int Recursivo(int base, int exp){
		if(exp == 0){
			return 1;
		}
		if(exp == 1){
			return base;
		}else{
			return base * Recursivo(base, (exp-1));
		}
	}
	

	public void getRecursivo(String CadNumero){
		StringTokenizer Quitarsigno = new StringTokenizer(CadNumero,",");
		int Numero[] = new int[2];
		int x = 0;
		while(Quitarsigno.hasMoreTokens()){
			Numero[x] = Integer.parseInt(Quitarsigno.nextToken());
			x++;
        }
		System.out.println("La Potencia de " + Numero[0] + "^" + Numero[1] + " = " + Recursivo(Numero[0], Numero[1]));
	}
	
}
