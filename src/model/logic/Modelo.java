package model.logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

import model.data_structures.ArregloDinamico;
import model.data_structures.IArregloDinamico;
import model.data_structures.ListaEncadenada;
import model.data_structures.MergeSort;
import model.data_structures.ShellSort;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

/**
 * Definicion del modelo del mundo
 *
 */
public class Modelo {
	/**
	 * Atributos del modelo del mundo
	 */
	
	
	/**
	 * Arreglo dinamico a llenar de peliculas
	 */
	private ArregloDinamico<Pelicula> peliculas;
	
	private ListaEncadenada peliculasLE;
	
	/**
	 * Constructor del modelo del mundo con capacidad predefinida
	 */
	public Modelo()
	{
		
		peliculas = new ArregloDinamico<Pelicula>(329045);
	}
	
	/**
	 * Constructor del modelo del mundo con capacidad dada
	 * @param tamano
	 */
	
	
	/**
	 * Servicio de consulta de numero de elementos presentes en el modelo 
	 * @return numero de elementos presentes en el modelo
	 */


	/**
	 * @return capacidad actual del modelo
	 */

	/**
	 * Requerimiento de agregar dato
	 * @param dato
	 */

	
	/**
	 * Requerimiento buscar dato
	 * @param dato Dato a buscar
	 * @return dato encontrado
	 */

	
	/**
	 * Requerimiento eliminar dato
	 * @param dato Dato a eliminar
	 * @return dato eliminado
	 */


	public String PeliculasDeDirectores(String palabra)
	{
		try
		{
		
			
			FileReader archivo1 = new FileReader("./Autores1.csv");
			BufferedReader leer = new BufferedReader( archivo1 );
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
			System.out.println(" No se puede reportar una respuesta al requerimiento... ");
		}
		
	}
	
	
	public void leerPeliculasArregloDinamico() {
		
		try
		{
			CSVParser parser = new CSVParserBuilder().withSeparator(';').build();
			
			FileReader filereader = new FileReader("./data/SmallMoviesDetailsCleaned.csv");
		     
			 CSVReader csvReader = ( new CSVReaderBuilder(filereader))
                     .withCSVParser(parser) 
                     .build();
			 
			 csvReader.readNext();         
			 String [] data;
		     while ((data = csvReader.readNext()) != null) {
		       
			
	
					
					int k = 0; 
					
					int iD= Integer.parseInt(data[k]);
					k++;
					
					double presupuesto = Double.parseDouble(data[k]);
					k++;
				
					String generos =data[k];
					k++;
					
					String imdb_Id = data[k];
				
					k++;
					
					String idiomaOriginal = data[k];
				
					k++;
					
					String tituloOriginal = data[k];
				
					k++;
					
					String resumen =data[k];
	
					k++;
					
					String popularidad =data[k];
				
					k++;
					
					String productora = data[k];
				
					k++;
					
					String productCompanies =data[k];
					
					k++;
					
					String productionCountries = data[k];
					
					k++;
					
					String fechaEstreno = data[k];
				
					k++;
					
					String ganancia = (data[k]);
					
					k++;
				
					String tiempoReproduccion =(data[k]);
					
					k++;
				
					String idiomasHablados = data[k];
					
					k++;
					
					String Estado = data[k];
					
					k++;
					
					String tagline = data[k];
					
					k++;
					
					String titulo =data[k];
					k++;
					
					String promedioVotos = (data[k]);
					
					k++;
					
					int cuentaVotos = Integer.parseInt(data[k]);
					
					k++;
					
					int numeroCompaniaProductora = Integer.parseInt(data[k]);
					
					
					
					int numeroCompaniaPaises = Integer.parseInt(data[k]);
					
					
					
					int numeroIdiomasHablados = Integer.parseInt(data[k]);
					
					Pelicula Pelicula1 = new Pelicula(iD,presupuesto,generos,imdb_Id,idiomaOriginal,tituloOriginal, resumen, popularidad, productora,productCompanies,productCompanies, fechaEstreno
							,ganancia, tiempoReproduccion, idiomasHablados, Estado, tagline,titulo,promedioVotos,cuentaVotos
							,numeroCompaniaProductora, numeroCompaniaPaises,numeroIdiomasHablados);
					
			        peliculas.agregarAlFinal(Pelicula1);
					
		    	 
		    	 
		     }
		     
		     sortMoviesByGenre("Comedy");
		     
		     
		     
		     
		     
//			 Reader reader = Files.newBufferedReader(Paths.get("./data/AllMoviesDetailsCleaned.csv"));
//			 
//			 CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).withSeparator(';').build();
			
			
		
		}     
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	
	
	
	public void moviesByGenre(String genre){
		
		ArregloDinamico<Pelicula> peliculasDelGenero = new ArregloDinamico(1);
		
		double voteAcum = 0;
		
		double promedio = 0;
		
		for (int i = 0; i < peliculas.size(); i++) {
		
			Pelicula PeliculaB = peliculas.obtenerElemento(i);
			if(PeliculaB.darGenero().equals(genre)){
				peliculasDelGenero.agregarAlFinal(PeliculaB);
				
				voteAcum += PeliculaB.darCuentaVotos();
			}
			promedio = voteAcum / peliculasDelGenero.size();
		}
		
		System.out.println("Total de películas del género: " + peliculasDelGenero.size());
		System.out.println("El promedio de votos es: " + promedio);
		System.err.println("Titulos de las peliculas");
		for (int i = 1; i <= peliculasDelGenero.size(); i++) {
			Pelicula PeliculaB = peliculas.obtenerElemento(i);	
			System.out.println(PeliculaB.darTituloOriginal());
		}
		
	}
	
	
	
	
	public void sortMoviesByGenre(String genre){
		
		ArregloDinamico<Pelicula> peliculasDelGenero = new ArregloDinamico(1);
		//System.err.println("Lista en desorden");
		for (int i = 1; i <= peliculas.size(); i++) {
			
			
			
			Pelicula PeliculaB = peliculas.obtenerElemento(i);
			if(PeliculaB.darGenero().equals(genre)){
				peliculasDelGenero.agregarAlFinal(PeliculaB);
				//System.out.println(PeliculaB.darTituloOriginal());
			}
		}
	
		// ordernar peliculas del genero de manera ascendente y descendente usando merge Sort
	
		System.err.println(peliculasDelGenero.size()-1);
		MergeSort merge = new MergeSort();
		merge.MergeSortPart2(peliculasDelGenero, 0, peliculasDelGenero.size()-1);
		
		System.err.println("Lista en orden");
		for (int i = 1; i <= peliculasDelGenero.size(); i++) {
			Pelicula PeliculaB = peliculas.obtenerElemento(i);
			System.out.println(PeliculaB.darTituloOriginal());
		}
	
	}
	
	
	
	
	public void leerPeliculasListaEncadenada() {
		
	try{
		CSVParser parser = new CSVParserBuilder().withSeparator(';').build();
		
		FileReader filereader = new FileReader("./data/AllMoviesDetailsCleaned.csv");
	     
		 CSVReader csvReader = ( new CSVReaderBuilder(filereader))
                 .withCSVParser(parser) 
                 .build();
		 
		 csvReader.readNext();         
		 String [] data;
	     while ((data = csvReader.readNext()) != null) {
	       
		

				
				int k = 0; 
				
				int iD= Integer.parseInt(data[k]);
				k++;
				
				double presupuesto = Double.parseDouble(data[k]);
				k++;
			
				String generos =data[k];
				k++;
				
				String imdb_Id = data[k];
			
				k++;
				
				String idiomaOriginal = data[k];
			
				k++;
				
				String tituloOriginal = data[k];
			
				k++;
				
				String resumen =data[k];

				k++;
				
				String popularidad =data[k];
			
				k++;
				
				String productora = data[k];
			
				k++;
				
				String productCompanies =data[k];
				
				k++;
				
				String productionCountries = data[k];
				
				k++;
				
				String fechaEstreno = data[k];
			
				k++;
				
				String ganancia = (data[k]);
				
				k++;
			
				String tiempoReproduccion =(data[k]);
				
				k++;
			
				String idiomasHablados = data[k];
				
				k++;
				
				String Estado = data[k];
				
				k++;
				
				String tagline = data[k];
				
				k++;
				
				String titulo =data[k];
				k++;
				
				String promedioVotos = (data[k]);
				
				k++;
				
				int cuentaVotos = Integer.parseInt(data[k]);
				
				k++;
				
				int numeroCompaniaProductora = Integer.parseInt(data[k]);
				
				
				
				int numeroCompaniaPaises = Integer.parseInt(data[k]);
				
				
				
				int numeroIdiomasHablados = Integer.parseInt(data[k]);
			
				
				
				Pelicula Pelicula1 = new Pelicula(iD,presupuesto,generos,imdb_Id,idiomaOriginal,tituloOriginal, resumen, popularidad, productora,productCompanies,productCompanies, fechaEstreno
						,ganancia, tiempoReproduccion, idiomasHablados, Estado, tagline,titulo,promedioVotos,cuentaVotos
						,numeroCompaniaProductora, numeroCompaniaPaises,numeroIdiomasHablados);
						
						
						
				
		        peliculasLE.agregarAlFinal(Pelicula1);
				
		    }
				
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	
}
	
	
	
}
