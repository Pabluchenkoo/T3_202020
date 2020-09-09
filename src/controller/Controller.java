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
		Modelo actores=null;

		while( !fin ){
			view.printMenu();

			int option = lector.nextInt();
			switch(option){
				case 1:
					System.out.println("Ingrese el director");
					Scanner lector3 = new Scanner(System.in);
					String director = lector3.next();
					modelo.PeliculasBuenasDeDirector(director);
					break;
				case 2:
					modelo.peliculasConPeorPromedio();
					break;
				case 3:
					System.out.println("Ingrese el director");
					Scanner lector4 = new Scanner(System.in);
					String director1 = lector4.next();
					modelo.moviesByDirector(director1);
					break;
				case 4:
					modelo.moviesByActor(null);
					
					break;
					
				case 5:
					System.out.println("Ingrese el g�nero seleccionado");
					Scanner lector1 =  new Scanner(System.in); 
					String genre = lector1.next();
					modelo.moviesByGenre(genre);
					break;
					
				case 6:
					System.out.println("Ingrese el g�nero seleccionado");
					Scanner lector2 =  new Scanner(System.in); 
					String genre2 = lector2.next();
					modelo.sortMoviesByGenre(genre2);
					break;
					
				default: 
					view.printMessage("--------- \n Opcion Invalida !! \n---------");
					break;
					
					
			}
		}
		
	}	
	
}
