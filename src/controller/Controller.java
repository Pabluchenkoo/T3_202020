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
					
				case 2:
					modelo.leerPeliculasArregloDinamico();
				case 3:
					modelo.peliculasConPeorPromedio();
					
				
				default: 
					view.printMessage("--------- \n Opcion Invalida !! \n---------");
					break;
					
					
			}
		}
		
	}	
	
}
