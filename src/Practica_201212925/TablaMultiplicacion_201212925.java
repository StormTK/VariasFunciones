package Practica_201212925;

public class TablaMultiplicacion_201212925 {
	
	public void MatrizMult(String StLimite){
		int Limite = Integer.parseInt(StLimite);
		String Resultado = "";
		int MultTemp = 0;
		for(int y = 1; y <= Limite; y++){//Cordenada y
			for(int x = 1; x<= Limite; x++){//Cordenada x
				MultTemp = x*y;//Multiplica el valor de x con el de y
				Resultado = Resultado + "\t" + MultTemp;//Lo guarda en una cadena
			}
			System.out.println(Resultado);//Imprime la cadena
			Resultado = "";//Regresa la cadena vacio para la siguiente vuelta
		}
	}

}
