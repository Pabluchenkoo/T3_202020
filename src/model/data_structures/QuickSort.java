package model.data_structures;

import model.logic.Pelicula;

public class QuickSort {
		
	
	
	
	
	
	//* low  --> Starting index,  high  --> Ending index */
	public void quickSort(ArregloDinamico<Pelicula> peliculas, int low, int high)
	{
	    if (low < high)
	    {
	        /* pi is partitioning index, arr[pi] is now
	           at right place */
	       int pi = partition(peliculas, low, high);

	        quickSort(peliculas, low, pi - 1);  // Before pi
	        quickSort(peliculas, pi + 1, high); // After pi
	    }
	    
	    for (int i = 0; i < peliculas.size(); i++) {
	    	Pelicula PeliculaB = peliculas.obtenerElemento(i+1);
			System.out.println(PeliculaB.darTituloOriginal());
			System.err.println(PeliculaB.darPromedioVotos());
		}
	}
	
		
		/* This function takes last element as pivot, places
		   the pivot element at its correct position in sorted
		    array, and places all smaller (smaller than pivot)
		   to left of pivot and all greater elements to right
		   of pivot */
		public int partition (ArregloDinamico<Pelicula> peliculas, int low, int high)
		{
		    // pivot (Element to be placed at right position)
		      
		    Pelicula pivot = peliculas.obtenerElemento(high);
		 
		    int i = (low - 1);  // Index of smaller element

		    for (int j = low; j <= high- 1; j++)
		    {
		        // If current element is smaller than the pivot
		        
		    	Pelicula comparar = peliculas.obtenerElemento(j+1);
		    			
		    	if ( comparar.compareTo(pivot)==-1)
		        {
		            i++;    // increment index of smaller element
		           // swap arr[i] and arr[j]
		            Pelicula temporal = peliculas.obtenerElemento(i+1);
		            peliculas.insertarElemento(comparar, i+1);
		            peliculas.insertarElemento(temporal, j+1);
		        }
		    }
		    
		   // swap arr[i + 1] and arr[high])
		    Pelicula temporal2 = peliculas.obtenerElemento((i+1)+1);
		    peliculas.insertarElemento(pivot,(i+1)+1);
		    peliculas.insertarElemento(temporal2,high+1);
		    return (i + 1);
		}
		
		
	
		
}	

	

