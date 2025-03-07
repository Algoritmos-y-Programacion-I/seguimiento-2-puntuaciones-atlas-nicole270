// Análisis (completar)
// Descripción del programa:
// Entradas:
// Salidas:
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
		int numjugadores, numrondas;

		System.out.println("Ingrese el numero de jugadores.");
		numjugadores = escaner.nextInt();
		int[] puntaje = new int[numjugadores];

		System.out.println("Ingrese el numero de rondas.");
		numrondas = escaner.nextInt();

		for(int i=0; i<numjugadores; i++){
			for(int j=0; j<numrondas; j++){
				System.out.println("Puntaje jugador " + (i+1) + " en la ronda "+ (j+1));
				puntaje[i] = escaner.nextInt();
			}
			
		}

	
		// Notificación al usuario de los resultados
		int puntajetotal, calcularPromedio;

        
		System.out.println("El resultado del torneo es: ");

		
		
		 int suma = 0;

        for(int i=0; i<numjugadores; i++){
			for(int j=0; j<numrondas; j++){
					
					System.out.println(" Puntaje del jugador " + (i+1) + suma);
					System.out.print("> ");
			
			}
		
		}
	}

	public static void main(String[] args) {
		AtlasPuntuaciones mainApp = new AtlasPuntuaciones();
		mainApp.run();
	}

	/**
	 * Descripción: El método calcularSumaTotal permite ...
	 * @param int[] numeros
	 * @return 
	 */
    public int calcularSumaTotal(int[] numeros) {
        return 0;
    }

	/**
	 * Descripción: El método calcularPromedio permite ...
	 * @param int[] numeros
	 * @return 
	 */
    public double calcularPromedio(int[] numeros) {
        return 0;
    }

	/**
	 * Descripción: El método encontrarMayor permite ...
	 * @param double[] numeros
	 * @return 
	 */
    public double encontrarMayor(double[] numeros) {
        return 0;
    }

	

	
}