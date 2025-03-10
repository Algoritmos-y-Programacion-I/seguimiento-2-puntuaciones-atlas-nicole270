// Análisis (completar)
// Descripción del programa: Este programa registra los puntajes de varios jugadores y calcula sus puntakes totales y promedio para asi hallar al ganador
// Entradas: Num de jugadores, num de rondas y puntajes de cada jugador en cada ronda
// Salidas: Puntaje total y su promedio.  el ganador
		
// Ejemplo:


package ui; // No olvidar especificar el paquete / carpeta de nuestro programa

import java.util.Scanner; // Para poder usar Scanner, debemos importarlo

public class AtlasPuntuaciones {

	// Declaración del Escaner que nos ayudará en todo el programa
	private Scanner escaner;

	// Declaración de nuestras constantes a utilizar


	private AtlasPuntuaciones() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run()
	{
		// Declaracion de todas las variables a usar en el programa
		int numJugadores, numRondas;

		System.out.println("Ingrese el numero de jugadores.");
		int numJugadores = escaner.nextInt();
		System.out.println("Ingrese el numero de rondas.");
		int numRondas = escaner.nextInt();
		
		int[] puntaje = new int[numjugadores];

		

		for(int i=0; i<numjugadores; i++){
			for(int j=0; j<numrondas; j++){
				System.out.println("Puntaje jugador " + (i+1) + " en la ronda "+ (j+1));
				puntaje[i] = escaner.nextInt();
			}
			
		}

	
		// Notificación al usuario de los resultados
		int puntajeTotal = 0;
		int calcularPromedio = 0;
		int Ganador = 0

        System.out.println("El resultado del torneo es: ");

		 int suma = 0;

        for(int i=0; i<numjugadores; i++){
			double promedio= (double) puntajeTotal[i] / numRondas;
		for(int j=0; j<numrondas; j++){
					
			System.out.println(" Puntaje del jugador " + (i+1) + " - Puntaje total:" + puntajeTotal[i] + " Promedio:" + promedio);
			System.out.print("> ");

				if (puntajeTotal[i] > puntajeTotal) 
					puntajeTotal = puntajeTotal[i];
					Ganador = i + 1;
		
			}
		
		}
	}

			// Ganador
			System.out.println("El Ganador del torneo es: Jugador " + Ganador);

			scanner.close();

		

	public static void main(String[] args) {
		AtlasPuntuaciones mainApp = new AtlasPuntuaciones();
		mainApp.run();
	}

	


	

	
}