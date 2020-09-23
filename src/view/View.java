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
			System.out.println("1. Cargar datos a tabla hash");
			System.out.println("2. REQ1 Reto 2 Linear Probing");
		    System.out.println("3. REQ1 Reto 2 Separate Chaining");
		    System.out.println("4. Pruebas de desempeño");
		    
		    System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");
		}

		public void printMessage(String mensaje) {

			System.out.println(mensaje);
		}		
		
		public void printModelo(Modelo modelo)
		{
			
		}
}
