package Practica_201212925;
import java.util.Scanner;

public class Main_201212925 {
		
	public static void main(String [] args){
		
		Scanner EntradaTeclado = new Scanner(System.in);//Recibe la escritura en modo consola
		boolean EstadoAF = true; //si el programa Esta Activo = 1 o Finalizado = 0
		
		do{
			
			Bienvenida();
			boolean continuar = true;
			boolean error = false; 
			String Acciones = "";
			
			do{
				
				Acciones = EntradaTeclado.nextLine();
				
				switch(Acciones){
				
					case "1":{
						boolean Retornar = true; //Retorna de nuevo al programa;
						do{
							
							//Codigo del programa de Paridad
							System.out.println("\nIngresa un Numero Entero para conocer si es Par o Impar:");
							Paridad_201212925 ParImpar = new Paridad_201212925();
							System.out.println(ParImpar.Paridad(EntradaTeclado.nextLine()));
							
							//Retornar
							System.out.println("\n********************************************************");
							
							boolean errorConfirmacion = true;//error de confirmacion
							do{
								System.out.println("\nDesea volver a Ingresar otro numero?" + "\nY/N");
								String respuesta = EntradaTeclado.nextLine().toLowerCase();//guarda la respuesta
								switch(respuesta){
									case "y":{
										Retornar = true;//Regresa otra vez
										errorConfirmacion = false;
										break;
									}
									case "n":{
										Retornar = false;//se sale
										errorConfirmacion = false;
										break;
									}
									case "":{
										System.out.print("");//regresa y espera
										Retornar = true;
										errorConfirmacion = false;
										break;
									}
									default:{
										System.out.println("No es una accion valida");
										errorConfirmacion = true;//regresa
										break;
									}
								}
							}while(errorConfirmacion == true);
							
						}while(Retornar == true);
						error = false;//Si no hay algun error
						break;//Rompe el codigo
						
					}
					
					case "2":{
						
						boolean Retornar = true; //Retorna de nuevo al programa;
						do{
							
							//Codigo del programa de contador de mayusculas
							System.out.println("\nIngresa la Palabra para ver cuantas Mayusculas tiene:");
							Mayusculas_201212925 NumMayus = new Mayusculas_201212925();
							System.out.println("\nLa Palabra tiene " + NumMayus.ContadorMayusculas(EntradaTeclado.nextLine()) + " Mayusculas");
							
							//Retornar
							System.out.println("\n********************************************************");
							
							boolean errorConfirmacion = true;//error de confirmacion
							do{
								System.out.println("\nDesea volver ingresear otra palabra?" + "\nY/N");
								String respuesta = EntradaTeclado.nextLine().toLowerCase();//guarda la respuesta
								switch(respuesta){
									case "y":{
										Retornar = true;//Regresa otra vez
										errorConfirmacion = false;
										break;
									}
									case "n":{
										Retornar = false;//se sale
										errorConfirmacion = false;
										break;
									}
									case "":{
										System.out.print("");//regresa y espera
										Retornar = true;
										errorConfirmacion = false;
										break;
									}
									default:{
										System.out.println("No es una accion valida");
										errorConfirmacion = true;//regresa
										break;
									}
								}
							}while(errorConfirmacion == true);
								
						}while(Retornar == true);
						error = false;//Si no hay algun error
						break;//Rompe el codigo

					}
					
					case "3":{
						
						boolean Retornar = true; //Retorna de nuevo al programa;
						do{
							
							//Codigo del programa de contador de mayusculas
							System.out.println("\nIngresa los Numeros a Sumar y Para calcular el Promedio Presione la tecla \"0\":");
							Suma_201212925 Prom = new Suma_201212925();
							Prom.SumaProm();//Muestra el promedio de un numero
							
							//Retornar
							System.out.println("\n********************************************************");
							
							boolean errorConfirmacion = true;//error de confirmacion
							do{
								System.out.println("\nDesea calcular otro Promedio?" + "\nY/N");
								String respuesta = EntradaTeclado.nextLine().toLowerCase();//guarda la respuesta
								switch(respuesta){
									case "y":{
										Retornar = true;//Regresa otra vez
										errorConfirmacion = false;
										break;
									}
									case "n":{
										Retornar = false;//se sale
										errorConfirmacion = false;
										break;
									}
									case "":{
										System.out.print("");//regresa y espera
										Retornar = true;
										errorConfirmacion = false;
										break;
									}
									default:{
										System.out.println("No es una accion valida");
										errorConfirmacion = true;//regresa
										break;
									}
								}
							}while(errorConfirmacion == true);
							
						}while(Retornar == true);
						error = false;//Si no hay algun error
						break;//Rompe el codigo
						
					}
					
					case "4":{
						
						boolean Retornar = true; //Retorna de nuevo al programa;
						do{
							
							//Codigo del programa del la tabla de multiplicar
							System.out.println("\nIngresa un Numeros Entero para limitar la Matriz de la Tabla de Multiplicacion");
							TablaMultiplicacion_201212925 Tabla = new TablaMultiplicacion_201212925();
							Tabla.MatrizMult(EntradaTeclado.nextLine());
							
							//Retornar
							System.out.println("\n********************************************************");
							
							boolean errorConfirmacion = true;//error de confirmacion
							do{
								System.out.println("\nDesea ver otra tabla de multiplicar?" + "\nY/N");
								String respuesta = EntradaTeclado.nextLine().toLowerCase();//guarda la respuesta
								switch(respuesta){
									case "y":{
										Retornar = true;//Regresa otra vez
										errorConfirmacion = false;
										break;
									}
									case "n":{
										Retornar = false;//se sale
										errorConfirmacion = false;
										break;
									}
									case "":{
										System.out.print("");//regresa y espera
										Retornar = true;
										errorConfirmacion = false;
										break;
									}
									default:{
										System.out.println("No es una accion valida");
										errorConfirmacion = true;//regresa
										break;
									}
								}
							}while(errorConfirmacion == true);
							
						}while(Retornar == true);
						error = false;//Si no hay algun error
						break;//Rompe el codigo
						
					}
					
					case "5":{
						
						boolean Retornar = true; //Retorna de nuevo al programa;
						do{
							
							//Codigo del programa para poner invertirla
							System.out.println("\nIngresa la palabra para Invertirla");
							Invertida_201212925 Voltear = new Invertida_201212925();
							System.out.println(Voltear.PalabraInvertida(EntradaTeclado.nextLine()));
							
							//Retornar
							System.out.println("\n********************************************************");
							
							boolean errorConfirmacion = true;//error de confirmacion
							do{
								System.out.println("\nDesea invertir otra palabra?" + "\nY/N");
								String respuesta = EntradaTeclado.nextLine().toLowerCase();//guarda la respuesta
								switch(respuesta){
									case "y":{
										Retornar = true;//Regresa otra vez
										errorConfirmacion = false;
										break;
									}
									case "n":{
										Retornar = false;//se sale
										errorConfirmacion = false;
										break;
									}
									case "":{
										System.out.print("");//regresa y espera
										Retornar = true;
										errorConfirmacion = false;
										break;
									}
									default:{
										System.out.println("No es una accion valida");
										errorConfirmacion = true;//regresa
										break;
									}
								}
							}while(errorConfirmacion == true);
							
						}while(Retornar == true);
						error = false;//Si no hay algun error
						break;//Rompe el codigo

					}
					
					case "6":{
						
						boolean Retornar = true; //Retorna de nuevo al programa;
						do{
							
							//Codigo del programa para quitarle las vocales a una palabra
							System.out.println("\nIngresa la palabra para Remover las vocales");
							SinVocales_201212925 QuitarVocales = new SinVocales_201212925();
							System.out.println(QuitarVocales.RemoverVocales(EntradaTeclado.nextLine()));
							
							//Retornar
							System.out.println("\n********************************************************");
							
							boolean errorConfirmacion = true;//error de confirmacion
							do{
								System.out.println("\nDesea remover las vocales a otra Palabra?" + "\nY/N");
								String respuesta = EntradaTeclado.nextLine().toLowerCase();//guarda la respuesta
								switch(respuesta){
									case "y":{
										Retornar = true;//Regresa otra vez
										errorConfirmacion = false;
										break;
									}
									case "n":{
										Retornar = false;//se sale
										errorConfirmacion = false;
										break;
									}
									case "":{
										System.out.print("");//regresa y espera
										Retornar = true;
										errorConfirmacion = false;
										break;
									}
									default:{
										System.out.println("No es una accion valida");
										errorConfirmacion = true;//regresa
										break;
									}
								}
							}while(errorConfirmacion == true);
							
						}while(Retornar == true);
						error = false;//Si no hay algun error
						break;//Rompe el codigo

					}
					
					case "7":{
						
						boolean Retornar = true; //Retorna de nuevo al programa;
						do{
							
							//Codigo del programa para convertir binario a decimal						
							System.out.println("\nIngresa un numero Binario para convertirlo a Decimal");
							Bin2dec_201212925 bitode = new Bin2dec_201212925();
							System.out.println(bitode.Binadec(EntradaTeclado.nextLine()));//Imprime el Resultado
							
							//Retornar
							System.out.println("\n********************************************************");
							
							boolean errorConfirmacion = true;//error de confirmacion
							do{
								System.out.println("\nDesea convertir otro numero Binario a Decimal?" + "\nY/N");
								String respuesta = EntradaTeclado.nextLine().toLowerCase();//guarda la respuesta
								switch(respuesta){
									case "y":{
										Retornar = true;//Regresa otra vez
										errorConfirmacion = false;
										break;
									}
									case "n":{
										Retornar = false;//se sale
										errorConfirmacion = false;
										break;
									}
									case "":{
										System.out.print("");//regresa y espera
										Retornar = true;
										errorConfirmacion = false;
										break;
									}
									default:{
										System.out.println("No es una accion valida");
										errorConfirmacion = true;//regresa
										break;
									}
								}
							}while(errorConfirmacion == true);
							
						}while(Retornar == true);
						error = false;
						break;
					}

					case "8":{
						
						boolean Retornar = true; //Retorna de nuevo al programa;
						do{
							boolean errorPatron = true;
							do{
							//Codigo del programa para mostrar los patrones					
								System.out.println("\nIngresa un letra de a - f, para poder observar un patron");
								String Letra = EntradaTeclado.nextLine().toLowerCase();
								if(Letra.equals("")){
									System.out.print("");
									errorPatron = true;
								}
								if( Letra.equals("a") || Letra.equals("b") || Letra.equals("c") || Letra.equals("d") || Letra.equals("e") || Letra.equals("f")){
									Patron_201212925 figuras = new Patron_201212925();
									figuras.realizarPatron(Letra);
									errorPatron = false;
								}else{
									System.out.println("No se a encontrado este Patron, Intentelo nuevamente.");
								}
							}while(errorPatron == true);
							
							//Retornar
							System.out.println("\n********************************************************");
							
							boolean errorConfirmacion = true;//error de confirmacion
							do{
								System.out.println("\nDesea volver a ver otro Patron?" + "\nY/N");
								String respuesta = EntradaTeclado.nextLine().toLowerCase();//guarda la respuesta
								switch(respuesta){
									case "y":{
										Retornar = true;//Regresa otra vez
										errorConfirmacion = false;
										break;
									}
									case "n":{
										Retornar = false;//se sale
										errorConfirmacion = false;
										break;
									}
									case "":{
										System.out.print("");//regresa y espera
										Retornar = true;
										errorConfirmacion = false;
										break;
									}
									default:{
										System.out.println("No es una accion valida");
										errorConfirmacion = true;//regresa
										break;
									}
								}
							}while(errorConfirmacion == true);
							
						}while(Retornar == true);
						error = false;
						break;

					}
					
					case "9":{
						
						boolean Retornar = true; //Retorna de nuevo al programa;
						do{
							
							//Codigo del programa para Adivinar un numero						
							AdivinaNumero_201212925 PlayNum = new AdivinaNumero_201212925();
							PlayNum.Adivina();
							
							//Retornar
							System.out.println("\n********************************************************");
							
							boolean errorConfirmacion = true;//error de confirmacion
							do{
								System.out.println("\nDesea volver a Jugar?" + "\nY/N");
								String respuesta = EntradaTeclado.nextLine().toLowerCase();//guarda la respuesta
								switch(respuesta){
									case "y":{
										Retornar = true;//Regresa otra vez
										errorConfirmacion = false;
										break;
									}
									case "n":{
										Retornar = false;//se sale
										errorConfirmacion = false;
										break;
									}
									case "":{
										System.out.print("");//regresa y espera
										Retornar = true;
										errorConfirmacion = false;
										break;
									}
									default:{
										System.out.println("No es una accion valida");
										errorConfirmacion = true;//regresa
										break;
									}
								}
							}while(errorConfirmacion == true);
							
						}while(Retornar == true);
					
						error = false;
						break;
					}
					
					case "10":{
						
						boolean Retornar = true; //Retorna de nuevo al programa;
						do{
							
							//Codigo del programa para saber si los numeros son repetitivos					
							System.out.println("\nIngresa numeros separados por guion para saber si son consecutivos ascendentes. \nEjemplo: \"1-2-3-4-5\" ");
							NumConsecutivos_201212925 CadNum = new NumConsecutivos_201212925();
							System.out.println(CadNum.Comprobar(EntradaTeclado.nextLine()));
							
							//Retornar
							System.out.println("\n********************************************************");
							
							boolean errorConfirmacion = true;//error de confirmacion
							do{
								System.out.println("\nDesea volver a comparar otros numeros?" + "\nY/N");
								String respuesta = EntradaTeclado.nextLine().toLowerCase();//guarda la respuesta
								switch(respuesta){
									case "y":{
										Retornar = true;//Regresa otra vez
										errorConfirmacion = false;
										break;
									}
									case "n":{
										Retornar = false;//se sale
										errorConfirmacion = false;
										break;
									}
									case "":{
										System.out.print("");//regresa y espera
										Retornar = true;
										errorConfirmacion = false;
										break;
									}
									default:{
										System.out.println("No es una accion valida");
										errorConfirmacion = true;//regresa
										break;
									}
								}
							}while(errorConfirmacion == true);
							
						}while(Retornar == true);
						error = false;
						break;
					}
					
					case "11":{
						
						boolean Retornar = true; //Retorna de nuevo al programa;
						do{
							
							///Codigo del programa para calcular un factorial iterativamente					
							System.out.println("\nIngresa un numero para Calcular su Factorial de forma iterativa");
							Factorial_201212925 FactNum = new Factorial_201212925();
							FactNum.getIterativo(EntradaTeclado.nextLine());
							
							//Retornar
							System.out.println("\n********************************************************");
							
							boolean errorConfirmacion = true;//error de confirmacion
							do{
								System.out.println("\nDesea encontrar otro factorial?" + "\nY/N");
								String respuesta = EntradaTeclado.nextLine().toLowerCase();//guarda la respuesta
								switch(respuesta){
									case "y":{
										Retornar = true;//Regresa otra vez
										errorConfirmacion = false;
										break;
									}
									case "n":{
										Retornar = false;//se sale
										errorConfirmacion = false;
										break;
									}
									case "":{
										System.out.print("");//regresa y espera
										Retornar = true;
										errorConfirmacion = false;
										break;
									}
									default:{
										System.out.println("No es una accion valida");
										errorConfirmacion = true;//regresa
										break;
									}
								}
							}while(errorConfirmacion == true);
							
						}while(Retornar == true);
						error = false;
						break;
					}
					
					case "12":{
						
						boolean Retornar = true; //Retorna de nuevo al programa;
						do{
							
							//Codigo del programa para calcular un factorial recursivamente				
							System.out.println("\nIngresa un numero para Calcular su Factorial de forma Recursiva");
							Factorial_201212925 FactNum2 = new Factorial_201212925();
							FactNum2.getRecursivo(EntradaTeclado.nextLine());
							
							//Retornar
							System.out.println("\n********************************************************");
							
							boolean errorConfirmacion = true;//error de confirmacion
							do{
								System.out.println("\nDesea encontrar otro factorial?" + "\nY/N");
								String respuesta = EntradaTeclado.nextLine().toLowerCase();//guarda la respuesta
								switch(respuesta){
									case "y":{
										Retornar = true;//Regresa otra vez
										errorConfirmacion = false;
										break;
									}
									case "n":{
										Retornar = false;//se sale
										errorConfirmacion = false;
										break;
									}
									case "":{
										System.out.print("");//regresa y espera
										Retornar = true;
										errorConfirmacion = false;
										break;
									}
									default:{
										System.out.println("No es una accion valida");
										errorConfirmacion = true;//regresa
										break;
									}
								}
							}while(errorConfirmacion == true);
							
						}while(Retornar == true);
						
						error = false;
						break;
					}
					
					case "13":{
						
						boolean Retornar = true; //Retorna de nuevo al programa;
						do{
							
							//Codigo del programa para calcular la potencia de un numero iterativamente por medio de multiplicaciones					
							System.out.println("\nIngresa dos numeros para calcular la Potencia del Numero con Multiplicaciones. \nEjemplo: base,exponente = 2,3 = 2^3");
							Potencia_201212925 Potenciaforma1 = new Potencia_201212925();
							Potenciaforma1.getMult(EntradaTeclado.nextLine());
							
							//Retornar
							System.out.println("\n********************************************************");
							
							boolean errorConfirmacion = true;//error de confirmacion
							do{
								System.out.println("\nDesea calcular otra Potencia?" + "\nY/N");
								String respuesta = EntradaTeclado.nextLine().toLowerCase();//guarda la respuesta
								switch(respuesta){
									case "y":{
										Retornar = true;//Regresa otra vez
										errorConfirmacion = false;
										break;
									}
									case "n":{
										Retornar = false;//se sale
										errorConfirmacion = false;
										break;
									}
									case "":{
										System.out.print("");//regresa y espera
										Retornar = true;
										errorConfirmacion = false;
										break;
									}
									default:{
										System.out.println("No es una accion valida");
										errorConfirmacion = true;//regresa
										break;
									}
								}
							}while(errorConfirmacion == true);
							
						}while(Retornar == true);

						error = false;
						break;
					}
					
					case "14":{
						
						boolean Retornar = true; //Retorna de nuevo al programa;
						do{
							
							//Codigo del programa para calcular la potencia de un numero por medio de sumas					
							System.out.println("\nIngresa dos numeros para calcular la Potencia del Numero con Sumatorias. \nEjemplo: base,exponente = 2,3 = 2^3");
							Potencia_201212925 Potenciaforma2 = new Potencia_201212925();
							Potenciaforma2.getMult(EntradaTeclado.nextLine());
							
							//Retornar
							System.out.println("\n********************************************************");
							
							boolean errorConfirmacion = true;//error de confirmacion
							do{
								System.out.println("\nDesea calcular otra Potencia?" + "\nY/N");
								String respuesta = EntradaTeclado.nextLine().toLowerCase();//guarda la respuesta
								switch(respuesta){
									case "y":{
										Retornar = true;//Regresa otra vez
										errorConfirmacion = false;
										break;
									}
									case "n":{
										Retornar = false;//se sale
										errorConfirmacion = false;
										break;
									}
									case "":{
										System.out.print("");//regresa y espera
										Retornar = true;
										errorConfirmacion = false;
										break;
									}
									default:{
										System.out.println("No es una accion valida");
										errorConfirmacion = true;//regresa
										break;
									}
								}
							}while(errorConfirmacion == true);
							
						}while(Retornar == true);
						error = false;
						break;
					}
					
					case "15":{
						boolean Retornar = true; //Retorna de nuevo al programa;
						do{
							
							//Codigo del programa para calcular la potencia de un numero por medio de recursividad				
							System.out.println("\nIngresa dos numeros para calcular la Potencia del Numero con forma Recursiva. \nEjemplo: base,exponente = 2,3 = 2^3");
							Potencia_201212925 Potenciaforma3 = new Potencia_201212925();
							Potenciaforma3.getRecursivo(EntradaTeclado.nextLine());
							
							//Retornar
							System.out.println("\n********************************************************");
							
							boolean errorConfirmacion = true;//error de confirmacion
							do{
								System.out.println("\nDesea calcular otra Potencia?" + "\nY/N");
								String respuesta = EntradaTeclado.nextLine().toLowerCase();//guarda la respuesta
								switch(respuesta){
									case "y":{
										Retornar = true;//Regresa otra vez
										errorConfirmacion = false;
										break;
									}
									case "n":{
										Retornar = false;//se sale
										errorConfirmacion = false;
										break;
									}
									case "":{
										System.out.print("");//regresa y espera
										Retornar = true;
										errorConfirmacion = false;
										break;
									}
									default:{
										System.out.println("No es una accion valida");
										errorConfirmacion = true;//regresa
										break;
									}
								}
							}while(errorConfirmacion == true);
							
						}while(Retornar == true);
						error = false;
						break;
					}
					
					case "16":{//Cerrar el Programa
						error = false;
						System.out.println("\nCerrando el Programa...");
						EstadoAF = false;
						continuar = false;
						System.out.println("\n\n*********** Fin del Programa ************");
						break;
					}
					
					case "":{
						System.out.print("");
						error = true;
						break;
					}
					
					default:{
						System.out.println("\nEsta no es una accion valida. Vuelva a Ingresar un Numero Valido:");
						error = true;
						break;
					}
				
				}
			}while(error == true);
			
			while(continuar == true){//	
				
				System.out.println("\nDesea salir del Programa?" + "\nY/N");
				String respuesta = EntradaTeclado.nextLine().toLowerCase();//guarda la respuesta
				
				switch(respuesta){
					case "y":{//Salir
						System.out.println("\nCerrando el Programa...");
						EstadoAF = false;
						continuar = false;
						System.out.println("\n\n*********** Fin del Programa ************");
						break;
					}
					case "n":{//Continuar
						for(int i = 0 ; i < 30 ; i++ ){ //Para limpiar la pantalla despues
							System.out.println();}
							continuar = false;
						break;
					}
					case "":{
						System.out.print("");//regresa y espera
						continuar = true;
						break;
					}
					default:{
						System.out.println("Esta Accion es Invalida");
						continuar = true;
					}
				}
				
			}
			
		}while(EstadoAF == true);
		
	}
		
	public static void Bienvenida(){
		System.out.println("************************************************");
		System.out.println("***                  by Kebyn                ***");
		System.out.println("************************************************");
		System.out.println();
		System.out.println("Presione el Numero de Accion que desea Realizar");
		System.out.println("1 - Paridad de un Numero");
		System.out.println("2 - Mayusculas");
		System.out.println("3 - Suma");
		System.out.println("4 - Tabla de Multiplicar");
		System.out.println("5 - Una Palabra Invertida");
		System.out.println("6 - Remover Vocales");
		System.out.println("7 - Bin2dec");
		System.out.println("8 - Patrones");
		System.out.println("9 - Adivinar numero");
		System.out.println("10 - Consecutivos");
		System.out.println("11 - Factorial iterativo");
		System.out.println("12 - Factorial Recusivo");
		System.out.println("13 - Potencia iterativa Multiplicativa");
		System.out.println("14 - Potencia iterativa Sumativa");
		System.out.println("15 - Potencia Recursiva");
		System.out.println("16 - Salir del Programa");
		System.out.println("\nQue accion deseas realizar?");
	}
	
}

