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
			System.out.println("Opción 1: Realizar la carga de las fuentes de datos de las películas a una lista encadenada");
			System.out.println("Opción 2: Realizar la carga de las fuentes de datos de las películas a un arreglo dinámico.");
		    System.out.println("Opción 3: Resolver parciamente el requerimiento 2 del Reto 1 usando el algoritmo ShellSort");
		    System.out.println("Opción 5: Entender un género de peliculas");	
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
