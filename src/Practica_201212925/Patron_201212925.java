package Practica_201212925;

public class Patron_201212925 {
	public void realizarPatron(String letra){
		
		switch(letra){
			case "a":{//Patron * en descenso
				String cantAsterisco = "";
				System.out.println(cantAsterisco);
				for(int x = 1; x <= 5; x++){
					cantAsterisco += "*";
					System.out.println(cantAsterisco);
				}
				break;
			}
			
			case "b":{//Patron * en ascenso
				System.out.println();
				for(int y = 5; y >= 1 ; y--){
					for(int x = 1; x < y; x++){
						System.out.print("*");
					}
					System.out.println("*");
				}
				break;
			}
			
			case "c":{//Patron * en ascenso volteado verticalmente
				System.out.println();
				int Limite = 0;
				for(int y = 5; y >= 1 ; y--){
					
					for(int espacio = 0; espacio < Limite; espacio++){
						System.out.print(" ");
					}
					
					for(int x = 1; x < y; x++){
						System.out.print("*");
					}
					
					System.out.println("*");
					Limite++;
				}
				break;
			}
			
			case "d":{//Patron * de cuadro
				System.out.println();
				for(int y = 5; y >= 1 ; y--){
					if (y == 5 || y == 1){
						for(int x = 1; x <= 5; x++){
							System.out.print("*");
						}
						System.out.println("*");
					}else{
						System.out.print("*");
						for(int x = 1; x <= 4; x++){
							System.out.print(" ");
						}
						System.out.println("*");
					}
				}
				break;
			}
			
			case "e":{//Patron * de triangulo
				System.out.println();
				int Limite = 1;
				int EspLimite = 1;
				for(int y = 5; y >= 1 ; y--){
					for(int i = 4; i >= EspLimite; i--){
						System.out.print(" ");
					}
					for(int x = 1; x <= Limite; x++){
						System.out.print("*");
					}
					System.out.println("*");
					Limite += 2;
					EspLimite += 1;
				}
				break;
			}
			
			case "f":{//Patron * de Z
				System.out.println();
				int Limite = 1;
				for(int y = 5; y >= 1 ; y--){
					if (y == 5 || y == 1){
						for(int x = 1; x <= 5; x++){
							System.out.print("*");
						}
						System.out.println("*");
					}else{
						for(int x = 1; x <= Limite; x++){
							System.out.print(" ");
						}
						System.out.println("*");
						Limite += 1;
					}
				}
				break;
			}
			
		}
	}
}
