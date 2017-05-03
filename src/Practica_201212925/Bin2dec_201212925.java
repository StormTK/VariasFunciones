package Practica_201212925;

public class Bin2dec_201212925 {
	public int Binadec(String stBinario){
		int Binario = Integer.parseInt(stBinario);
		int numDecimal = 0, exponente = 0;//variables para el numero decimal, y para el exponente 
		do{ 
			if(Binario % 10 == 1){//La division Modular si es 1    
				numDecimal +=(int)Math.pow(2,exponente); //entonces que de un Int del numero 2^exponente y lo sume en el numero Decimal
			} 
			Binario /= 10; //y luego que divida el Binario en 10 y lo guarde otra vez en la misma variable
			exponente++; //Que aumente otra vez el exponente
		}while(Binario!=1);//Si el cociente no es 0 que vuelva a repetir el ciclo
		
		numDecimal+=(int)Math.pow(2,exponente);//al final que sume en la variable el resul 2^exponete que queda 
		
		return numDecimal;//retorne el numero
	}
}
