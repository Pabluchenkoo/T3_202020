package model.logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

import model.data_structures.ArregloDinamico;
import model.data_structures.IArregloDinamico;
import model.data_structures.ShellSort;

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
	
	public void peliculasConPeorPromedio (  )
	{ 
		
		try
		{
			FileReader archivo = new FileReader("./Autores1.csv");
			BufferedReader leer = new BufferedReader( archivo );
			String cadena = null;
			
			ArrayList datos = new ArrayList();
			
			while((cadena=leer.readLine()) != null)
			{
				
			String [] Palabras = cadena.split(";");
			
			int calificacion = Integer.parseInt( Palabras[3] );
			
			if (calificacion < 4)
				{
				datos.add(Palabras[3]);
						
				datos.sort( (Comparator) datos);
	
				System.out.println( " " + Palabras[0] + " \n " + Palabras[3] + " \n " + Palabras[2] + " \n " + Palabras[4] + " \n " + Palabras[5] + " \n " + Palabras[6] + " \n " + Palabras[7] + " \n " + Palabras[8] + " \n " + Palabras[9] );
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(" No se puede reportar una respuesta al requerimiento ");
		}
		
	}
	
	
	public void leerPeliculasArregloDinamico() {
		
		try
		{
			File f = new File ("./AllMoviesDetails.csv");
			
			FileReader archiv = new FileReader(f);
			BufferedReader leer = new BufferedReader( archiv );
			String cadena = null;
			
			for(int i=0; i<329045;i++)
			{   
			    try{
			    	cadena=leer.readLine();
			    }
			    catch(Exception e){
			    	System.out.println("Archivo no encontrado");
			    }
				
				String [] data = cadena.split(";");
				Date d = new Date(data[8]);
				Pelicula Pelicula1 = new Pelicula(Integer.parseInt(data[0]),Integer.parseInt(data[1]),data[2],data[3],data[4],data[5],data[6],
						data[7],(java.sql.Date) d,Integer.parseInt(data[9]),Integer.parseInt(data[10]),data[11],data[12],data[13],Double.parseDouble(data[14]),
							Integer.parseInt(data[15]),Integer.parseInt(data[16]),Integer.parseInt(data[17]),Integer.parseInt(data[18]));
				
		        peliculas.agregarAlFinal(Pelicula1);
				System.out.println(peliculas.size());
		    }
				
		}
			catch(Exception e)
			{
				System.out.println("Archivo no encontrado..");
			}
	}
	
	public void leerPeliculasListaEncadenada() {
		
		try
		{
			File f = new File ("./AllMoviesDetails.csv");
			
			FileReader archiv = new FileReader(f);
			BufferedReader leer = new BufferedReader( archiv );
			String cadena = null;
			
			for(int i=0; i<329045;i++)
			{   
			    try{
			    	cadena=leer.readLine();
			    }
			    catch(Exception e){
			    	System.out.println("Archivo no encontrado");
			    }
				
				String [] data = cadena.split(";");
				Date d = new Date(data[8]);
				Pelicula Pelicula1 = new Pelicula(Integer.parseInt(data[0]),Integer.parseInt(data[1]),data[2],data[3],data[4],data[5],data[6],
						data[7],(java.sql.Date) d,Integer.parseInt(data[9]),Integer.parseInt(data[10]),data[11],data[12],data[13],Double.parseDouble(data[14]),
							Integer.parseInt(data[15]),Integer.parseInt(data[16]),Integer.parseInt(data[17]),Integer.parseInt(data[18]));
				
		        peliculas.agregarAlFinal(Pelicula1);
				System.out.println(peliculas.size());
		    }
				
		}
			catch(Exception e)
			{
				System.out.println("Archivo no encontrado..");
			}
	}
	
	
	
}
