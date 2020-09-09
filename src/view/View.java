package view;

import model.logic.Modelo;

public class View 
{
	    /**
	     * Metodo constructor
	     */
	    public View()
	    {
	    	
	    }
	    
		public void printMenu()
		{
			System.out.println("Opci�n 1: Realizar la carga de las fuentes de datos de las pel�culas a una lista encadenada");
			System.out.println("Opci�n 2: Realizar la carga de las fuentes de datos de las pel�culas a un arreglo din�mico.");
		    System.out.println("Opci�n 3: Resolver parciamente el requerimiento 2 del Reto 1 usando el algoritmo ShellSort");
		    System.out.println("Opci�n 5: Entender un g�nero de peliculas");	
		    System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");
		}

		public void printMessage(String mensaje) {

			System.out.println(mensaje);
		}		
		
		public void printModelo(Modelo modelo)
		{
			// TODO implementar
		}
}
