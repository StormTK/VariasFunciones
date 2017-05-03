package Practica_201212925;

public class Factorial_201212925 {
	
	String stamFactorial;
	int numFactorial;
	int tamFactorial;

	
	public Factorial_201212925(){
		this.numFactorial = 1;
	}
	
	//-----------Forma Iterativa
	public int iterativo(){
		if(!(tamFactorial < 0)){//Si el factorial no es menor de cero
			for(int i = 1; i < tamFactorial + 1;i++){  
				numFactorial = numFactorial * i;  
		    }
		    return numFactorial;//Retorne el factorial
		}
			return 0;//Retorne 0
	}
	
	public void getIterativo(String stamFactorial){
		tamFactorial = Integer.parseInt(stamFactorial);
		int temp = iterativo();
		if(!(temp == 0)){// si no es 0
			String ProcesoFact = "1";
			for(int f = 2; f <= tamFactorial ; f++){
				ProcesoFact += "x"+ f;
			}
			System.out.println("\nEl Factorial de " + tamFactorial + "! es: " + ProcesoFact + " = " + temp);//que imprima el factorial
		}else{
			System.out.println("\nEl Factorial de " + tamFactorial + " no existe porque es un numero negativo");//sino entonces es negativo
		}
		
	}
	
	//-----------Forma Recursiva
	
	public int Recursivo(int tamFactorial){
		if(tamFactorial < 0){
			return 0;
		}
		if(tamFactorial <= 0){
			return 1;
		}else{
			return tamFactorial * Recursivo(tamFactorial - 1);
		}
	}
	
	public void getRecursivo(String stamFactorial){
		tamFactorial = Integer.parseInt(stamFactorial);
		int temp = Recursivo(tamFactorial);
		if(!(temp == 0)){//si no es 0 entonces
			String ProcesoFact = "1";
			for(int f = 2; f <= tamFactorial ; f++){
				ProcesoFact += "x"+ f;
			}
			System.out.println("\nEl Factorial de " + tamFactorial + "! es: " + ProcesoFact + " = " + temp);//Imprima el factorial
		}else{
			System.out.println("\nEl Factorial de " + tamFactorial + " no existe porque es un numero negativo");//Entonces es negativo
		}
	}
}
