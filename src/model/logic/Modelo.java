package model.logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

import model.data_structures.ArregloDinamico;
import model.data_structures.IArregloDinamico;
import model.data_structures.ListaEncadenada;
import model.data_structures.QuickSort;
import model.data_structures.ShellSort;
import model.data_structures.TablaHashLinearProbing;
import model.data_structures.TablaHashSeparateChaining;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

/**
 * Definicion del modelo del mundo . . . . . . . . . . . . . . . . . . . . 
 *
 */
public class Modelo <K extends Comparable<K> , V extends Comparable <V>>
{
	/**
	 * Atributos del modelo del mundo
	 */
	
	
	/**
	 * Arreglo dinamico a llenar de peliculas
	 */
	private ArregloDinamico<Pelicula> peliculas;
	
	private ArregloDinamico<Casting> casting;
	private ListaEncadenada peliculasLE;
	private TablaHashSeparateChaining<K,V> separateChaining;
	private TablaHashLinearProbing<K,V> linearProbing;
	
	
	
	/**
	 * Constructor del modelo del mundo con capacidad predefinida
	 */
	public Modelo()
	{
		
		peliculas = new ArregloDinamico<Pelicula>(329045);
		casting = new ArregloDinamico<Casting>(329045);
		
	}
	
	

	//Requerimiento 3.1
	public ArregloDinamico<Pelicula> moviesByDirector(String pDirector)
	{
		ArregloDinamico<Pelicula> respuesta = null;
		
		try
		{
		
			
			FileReader archivo1 = new FileReader("./Autores1.csv");
			BufferedReader leer = new BufferedReader( archivo1 );
			String cadena = null;
			
			while((cadena=leer.readLine()) != null)
			{
				String [] palabras = cadena.split(";");
				if (palabras[1].equals(pDirector)) 
				{

					Pelicula nueva = new Pelicula(Integer.parseInt(palabras[0]), 0.0, palabras[4], "", "", palabras[2], "", "", "", "", "", "", "", "", "", "", "", "", palabras[3], 0, 0, 0, 0);

					

					respuesta.agregar(nueva);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Archivo no encontrado");
		}
		return respuesta;
	}
	//requerimiento 3.2
	public int numeroPeliculasDirigidas(String pDirector)
	{
		int respuesta = 0;
		
		ArregloDinamico<Pelicula> peliculas = moviesByDirector(pDirector);
		respuesta = peliculas.darTamano();
		
		
		return respuesta;
	}
	//requerimiento 3.3
	public double promedioPeliculasDirigidas(String pDirector)
	{
		double respuesta = 0.0;
		int cuenta=0;
		
		ArregloDinamico<Pelicula> peliculas = moviesByDirector(pDirector);
		for (int i =0; i<peliculas.darTamano();i++)
		{
			
			respuesta += Double.parseDouble(peliculas.darElemento(i).darPromedioVotos());
			cuenta+=1;
		}
		respuesta = respuesta /cuenta;
		
		return respuesta;
	}
	//requerimiento 4.1
	public ArregloDinamico<Pelicula> moviesByActor(String pActor)
	{
		ArregloDinamico<Pelicula> respuesta = null;
			
		try
		{
			
				
			FileReader archivo1 = new FileReader("./Autores1.csv");
			BufferedReader leer = new BufferedReader( archivo1 );
			String cadena = null;
				
			while((cadena=leer.readLine()) != null)
			{
				String [] palabras = cadena.split(";");
				if (palabras[8].equals(pActor)) 
				{
					Pelicula nueva = new Pelicula(Integer.parseInt(palabras[0]), 0.0, palabras[4], "", "", palabras[2], "", "", "", "", "", "", "", "", "", "", "", "", palabras[3], 0, 0, 0, 0);
					respuesta.agregar(nueva);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Archivo no encontrado");
		}
		return respuesta;
	}
	//requerimiento 4.2
	public int numeroPeliculasActuadas(String pActor)
	{
		int respuesta = 0;
		
		ArregloDinamico<Pelicula> peliculas = moviesByDirector(pActor);
		respuesta = peliculas.darTamano();
		
		
		return respuesta;
	}
	// requerimiento 4.3
	public double promedioPeliculasActor(String pActor)
	{
		double respuesta = 0.0;
		int cuenta=0;
		
		ArregloDinamico<Pelicula> peliculas = moviesByDirector(pActor);
		for (int i = 0 ; i < peliculas.darTamano() ; i++ )
		{
			
			respuesta += Double.parseDouble(peliculas.darElemento(i).darPromedioVotos());
			cuenta += 1 ;
		}
		respuesta = respuesta /cuenta ;
		
		return respuesta ;
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
public void leerCastingArregloDinamico() {
		
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
					
					String nombreActor1 = data[k];
					k++;
					
					String generoActor1 = data[k];
					k++;
					
					String nombreActor2 = data[k];
					k++;
					
					String generoActor2 = data[k];
					k++;
					
					String nombreActor3 = data[k];
					k++;
					
					String generoActor3 = data[k];
					k++;
					
					String nombreActor4 = data[k];
					k++;
					
					String generoActor4 = data[k];
					k++;
					
					String nombreActor5 = data[k];
					k++;
					
					String generoActor5 = data[k];
					k++;
					
					int numeroActor = Integer.parseInt(data[k]);
					k++;
					
					String NombreDirector =data[k];
					k++;
					
					int generoDirector = Integer.parseInt(data[k]);
					k++;
					
					int numeroDirector = Integer.parseInt(data[k]);
					k++;
					
					String NombreProductor =data[k];
					k++;
					
					int numeroProductor = Integer.parseInt(data[k]);
					k++;
					
					String NombreEditor =data[k];
					k++;
					
					
					Casting Casting1 = new Casting(iD, nombreActor1, generoActor1, nombreActor2, generoActor2, 
							nombreActor3, generoActor3, nombreActor4, generoActor4, nombreActor5, generoActor5,
							numeroActor, NombreDirector, generoDirector, numeroDirector, NombreProductor, numeroProductor,
							NombreEditor);
					
			        
					casting.agregarAlFinal( Casting1 );
		    	 
		    	 
		     }
		     
		
		}     
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}





	@SuppressWarnings("null")
	public void PeliculasBuenasDeDirector ( String nombreDirector )
	{
		@SuppressWarnings("unchecked")
		ArregloDinamico<Pelicula> peliculasBuenasDelDirector = new ArregloDinamico<Pelicula>(peliculas.size());
		
		Casting director = null;
		
		for ( int i = 0 ; i < peliculas.size() ; i++ )
		{
			Pelicula Pelicula = peliculas.darElemento( i );
			
			if(director.darNombreDirector().equals( nombreDirector ))
			{
				double promedio = Double.parseDouble(Pelicula.darPromedioVotos());
				
				if ( promedio >= 7 )
				{
					peliculasBuenasDelDirector.agregar( Pelicula );
				}
			}
		}
		
		for (int i = 1; i <= peliculasBuenasDelDirector.size(); i++) 
		{
			Pelicula PeliculaB = peliculas.darElemento(i);	
			System.out.println(PeliculaB.darTituloOriginal());
		}
		
	}
	public void peliculasConPeorPromedio () 
	{ 
		ArregloDinamico<Pelicula> peliculasConPeorPromedio = new ArregloDinamico<Pelicula>(20);
		
		for ( int i = 0 ; i < peliculas.size(); i++ )
		{
			Pelicula Pelicula = peliculas.darElemento( i );
			
			for ( int j = i ; j <peliculas.size() ; j++ )	
			{
				Pelicula Pelicula2 = peliculas.darElemento( j );
				if ( Pelicula.darCuentaVotos() > Pelicula2.darCuentaVotos() )
				{
					peliculasConPeorPromedio.agregar( Pelicula );
				}
			}	
		}
		
		Collections.reverse((List<?>) peliculasConPeorPromedio);
		
		for (int i = 1; i <= peliculasConPeorPromedio.size(); i++) 
		{
			Pelicula PeliculaB = peliculas.darElemento(i);	
			System.out.println(PeliculaB.darTituloOriginal());
		}
		
	}


	public void leerPeliculasTablaHashLP() {
		
		try

		{
			
			
			
			CSVParser parser = new CSVParserBuilder().withSeparator(';').build();
			
			FileReader filereader = new FileReader("./data/AllMoviesCastingRaw.csv");
		     
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
					
					int ganancia = Integer.parseInt(data[k]);
					
					k++;
				
					int  tiempoReproduccion =Integer.parseInt(data[k]);
					
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
					
					Pelicula Pelicula1 = new Pelicula(iD,presupuesto,generos,imdb_Id,idiomaOriginal,tituloOriginal,
							resumen, popularidad, productora,productCompanies,productCompanies, fechaEstreno
							,ganancia, tiempoReproduccion, idiomasHablados, Estado, tagline,titulo,
							promedioVotos,cuentaVotos
							,numeroCompaniaProductora, numeroCompaniaPaises,numeroIdiomasHablados);
					
					String key = productCompanies + fechaEstreno;
					
			        linearProbing.put((K)key , (V) );
					
		    	 
		    	 
		     }
		     
		     sortMoviesByGenre("Comedy");
		     

		
		}     
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	
public void leerPeliculasTablaHashSC() {
		
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
					
					int ganancia = Integer.parseInt(data[k]);
					
					k++;
				
					int  tiempoReproduccion =Integer.parseInt(data[k]);
					
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
					
					Pelicula Pelicula1 = new Pelicula(iD,presupuesto,generos,imdb_Id,idiomaOriginal,tituloOriginal,
							resumen, popularidad, productora,productCompanies,productCompanies, fechaEstreno
							,ganancia, tiempoReproduccion, idiomasHablados, Estado, tagline,titulo,
							promedioVotos,cuentaVotos
							,numeroCompaniaProductora, numeroCompaniaPaises,numeroIdiomasHablados);
					
			        peliculas.agregarAlFinal(Pelicula1);
					
		    	 
		    	 
		     }
		     
		     sortMoviesByGenre("Comedy");
		     

		
		}     
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	
	public void moviesByGenre(String genre){
		
		ArregloDinamico<Pelicula> peliculasDelGenero = new ArregloDinamico<Pelicula>(1);
		
		double voteAcum = 0;
		
		double promedio = 0;
		
		for (int i = 0; i < peliculas.size(); i++) {
		
			Pelicula PeliculaB = peliculas.darElemento(i);
			if(PeliculaB.darGenero().equals(genre)){
				peliculasDelGenero.agregarAlFinal(PeliculaB);
				
				voteAcum += PeliculaB.darCuentaVotos();
			}
			promedio = voteAcum / peliculasDelGenero.size();
		}
		
		System.out.println("Total de peliculas del genero: " + peliculasDelGenero.size());
		System.out.println("El promedio de votos es: " + promedio);
		System.err.println("Titulos de las peliculas");
		for (int i = 1; i <= peliculasDelGenero.size(); i++) {
			Pelicula PeliculaB = peliculas.darElemento(i);	
			System.out.println(PeliculaB.darTituloOriginal());
		}
		
	}
	
	
	
	
	public void sortMoviesByGenre(String genre){
		
		ArregloDinamico<Pelicula> peliculasDelGenero = new ArregloDinamico<Pelicula>(1);
		//System.err.println("Lista en desorden");
		for (int i = 1; i <= peliculas.size(); i++) {
			
			
			
			Pelicula PeliculaB = peliculas.darElemento(i);
			if(PeliculaB.darGenero().equals(genre)){
				peliculasDelGenero.agregarAlFinal(PeliculaB);
				//System.out.println(PeliculaB.darTituloOriginal());
			}
		}
	
		// ordernar peliculas del genero de manera ascendente y descendente usando merge Sort
	
		System.err.println("Lista Desordenada");
		
		for (int i = 1; i <= peliculasDelGenero.size(); i++) {
			Pelicula PeliculaB = peliculas.darElemento(i);
			System.out.println(PeliculaB.darTituloOriginal());
		}
		
		QuickSort s = new QuickSort();
		s.quickSort(peliculasDelGenero,0,peliculasDelGenero.size());
		
		System.err.println("Lista Ordenada");
		
		for (int i = 1; i <= peliculasDelGenero.size(); i++) {
			Pelicula PeliculaB = peliculas.darElemento(i);
			System.out.println(PeliculaB.darTituloOriginal());
			System.err.println(PeliculaB.darPromedioVotos());
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
				
				int ganancia = Integer.parseInt(data[k]);
				
				k++;
			
				int tiempoReproduccion =Integer.parseInt(data[k]);
				
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
