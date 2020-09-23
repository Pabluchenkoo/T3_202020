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
					System.out.println("Carga de fuentes de datos");
					System.out.println("Linear Probing");
					modelo.leerPeliculasTablaHashLP();
					System.out.println("Separate Chaining");
					modelo.leerPeliculasTablaHashSC();
					break;
				case 2:
					System.out.println("Req1 Reto 2 Linear Probing");
					
					break;
				case 3:
					System.out.println("Req1 Reto 2 Separate Chaining");
					Scanner lector4 = new Scanner(System.in);
					String director1 = lector4.next();
					modelo.moviesByDirector(director1);
					break;
				case 4:
					System.out.println("Pruebas de desempeño");
					modelo.moviesByActor(null);
					
					break;
					
				default: 
					view.printMessage("--------- \n Opcion Invalida !! \n---------");
					break;
					
					
			}
		}
	}	
	public void imprimirLP()
	{
		modelo.leerPeliculasTablaHashLP();
		
		
	}
}
