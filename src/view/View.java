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
			System.out.println("2. Cargar datos a arreglo dinamico");
		    System.out.println("3. REQ1");
		    System.out.println("4. REQ2");
		    System.out.println("5. REQ3");
		    System.out.println("6. REQ4");
		    System.out.println("7. REQ5");
		    System.out.println("8. REQ6");
		    System.out.println("9. Exit");
		    
		    System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");
		}

		public void printMessage(String mensaje) {

			System.out.println(mensaje);
		}		
		
		public void printModelo(Modelo modelo)
		{
			
		}
}
