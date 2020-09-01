package model.logic;

import java.io.BufferedReader;
import java.io.FileReader;

import model.data_structures.ArregloDinamico;
import model.data_structures.IArregloDinamico;

/**
 * Definicion del modelo del mundo
 *
 */
public class Modelo {
	/**
	 * Atributos del modelo del mundo
	 */
	private ArregloDinamico datos;
	
	/**
	 * Arreglo dinamico a llenar de peliculas
	 */
	private ArregloDinamico peliculas;
	
	/**
	 * Constructor del modelo del mundo con capacidad predefinida
	 */
	public Modelo()
	{
		datos = new ArregloDinamico(7);
		peliculas = new ArregloDinamico(329044);
	}
	
	/**
	 * Constructor del modelo del mundo con capacidad dada
	 * @param tamano
	 */
	public Modelo(Integer capacidad)
	{
		datos = new ArregloDinamico(capacidad);
	}
	
	/**
	 * Servicio de consulta de numero de elementos presentes en el modelo 
	 * @return numero de elementos presentes en el modelo
	 */
	public int darTamano()
	{
		return datos.darTamano();
	}

	/**
	 * @return capacidad actual del modelo
	 */
	public int darCapacidad()
	{
		return datos.darCapacidad();
	}
	/**
	 * Requerimiento de agregar dato
	 * @param dato
	 */
	public void agregar(Object dato)
	{	
		datos.agregar(dato);
	}
	
	/**
	 * Requerimiento buscar dato
	 * @param dato Dato a buscar
	 * @return dato encontrado
	 */
	public Object buscar(Object dato)
	{
		return datos.buscar(dato);
	}
	
	/**
	 * Requerimiento eliminar dato
	 * @param dato Dato a eliminar
	 * @return dato eliminado
	 */
	public Object eliminar(Object dato)
	{
		return datos.eliminar(dato);
	}

	public String PeliculasDeDirectores(String palabra)
	{
		try
		{
			FileReader archivo = new FileReader("./Autores1.csv");
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
	
	public void leerArchivo (){
		try
		{
			FileReader archivo = new FileReader("./Autores1.csv");
			BufferedReader leer = new BufferedReader( archivo );
			String cadena = null;
			
			while((cadena=leer.readLine()) != null)
			{
				String [] Palabras = cadena.split(";");
				System.out.println( " " + Palabras[2] + " \n ");
			}
		}
			catch(Exception e)
			{
				System.out.println("Archivo no encontrado");
			}
	}
	
	
}
