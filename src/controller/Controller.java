package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sun.xml.internal.ws.api.message.Message;

import model.logic.Modelo;
import view.View;

public class Controller {

	/* Instancia del Modelo*/
	private Modelo modelo;
	
	/* Instancia de la Vista*/
	private View view;
	
	/**
	 * Crear la vista y el modelo del proyecto
	 * @param capacidad tamaNo inicial del arreglo
	 */
	public Controller ()
	{
		view = new View();
		modelo = new Modelo();
	}
		
	public void run() 
	{
		Scanner lector = new Scanner(System.in);
		
		Comparable respuesta;
		boolean fin = false;

		while( !fin ){
			view.printMenu();

			int option = lector.nextInt();
			switch(option){
				case 1:
					view.printMessage("--------- \n Encontrar peliculas buenas de un director ");
					view.printMessage("--------- \n Nombre del director: ");
					String nombreDelDirector = lector.next();
				    respuesta = leerTexto(nombreDelDirector);
				    if ( respuesta != null )
				    {
				    	view.printMessage("--------- \n Lista de peliculas: " + "\n" + respuesta);
				    }
				    else view.printMessage("--------- \n No se encuentra el director. ");

				default: 
					view.printMessage("--------- \n Opcion Invalida !! \n---------");
					break;
			}
		}
		
	}	
	
	public String leerTexto(String palabra)
	{
		try
		{
			FileReader archivo = new FileReader("Autores1.csv");
			BufferedReader leer = new BufferedReader( archivo );
			String cadena = null;
			
			while((cadena=leer.readLine()) != null)
			{
				String [] Palabras = cadena.split(";");
				if (Palabras[1].equals(palabra))
				{
					int calificacion = Integer.parseInt( Palabras[3] );
					
					if(calificacion>=7)
					{
					System.out.println( " " + Palabras[0] + " \n " + Palabras[2] + " \n " + Palabras[4] + " \n " + Palabras[5] + " \n " + Palabras[6] + " \n " + Palabras[7] + " \n " + Palabras[8] + " \n " + Palabras[9] );
					}
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Archivo no encontrado");
		}
		return "";
	}
}
