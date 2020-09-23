package model.data_structures;


import java.util.Iterator;

import java.util.ArrayList;


import model.data_structures.SequentialSearchST.Nodo;

public class TablaHashSeparateChaining <K extends Comparable<K>, V extends Comparable <V>> implements TablaSimbolos <K, V>{
	
	private int M;
	
	private int N; // number of key-value pairs in the table
	
	private ArregloDinamico<K> keys; // the keys
	private ArregloDinamico<V> values; // the values
	
	private SequentialSearchST<K, V>[] st;
	
	/**
	 * Factor de carga (size/capacity) m?ximo.
	 */
	private static final double MAXIMUM_LOAD_FACTOR = 5.0;



	/**
	 * N?mero de posiciones ocupadas en el arreglo por al menos una llave, capacidad
	 * real del arreglo, tama?o, n?mero de rehashes hechos y factor de carga actual.
	 */
	private int height, capacity, size, numOfRehashes = 0;
	private double loadFactor = 0.0;
	@SuppressWarnings("unchecked")
	public void SeparateChainingHashST( int M )
	{
		this.M = M;
		
		st = (SequentialSearchST<K, V>[]) new SequentialSearchST[M];
		for( int i = 0 ; i < M ; i++)
		{
			st[i] = new SequentialSearchST<>();
		}
	}
	
	private int hash (K key)
	{
		
		if(N/M >= 5.0)
		{
			SequentialSearchST<K,V> x = new SequentialSearchST<K,V>();
			x.rehash();
			
		}
	
		return (key.hashCode() & 0x7fffffff) % M;
	}
	
	public V get ( K key )
	{
		return  (V) st[hash(key)].get(key) ;
	}
	
	public void put (K key , V value)
	{
		st[hash(key)].put(key,value);
	}

	public K min()
	{
		return keys.PrimerElemento();
	}
	
	public K max()
	{  
		return keys.darElemento(N-1); 
	}
	

	/**
	 * @return Iterador sobre todas las llaves de la tabla de hash.
	 */
	public Iterator<K> keys( )
	{
		return new Iterator<K>( )
		{
			int iActual = 0;
			int hActual = 0;
			private SequentialSearchST<K, V> actual = null;

			@Override
			public boolean hasNext( )
			{
				return iActual < capacity && hActual < height;
			}

			@Override
			public K next( )
			{
				if( actual != null && actual != null )
					actual = actual;
				else
					while( hActual < height )
					{
						if( st[iActual] != null )
						{
							actual = st[iActual];
							iActual++;
							hActual++;
							break;
						}
						iActual++;
					}

				return actual.key;
			}
		};
	}



//	public Iterable	<K> keys()
//	{  
//		return keys(min(), max());  
//	public Iterable	<K> keys(K lo, K hi)
//	{  
//		ArregloDinamico<K> q = new ArregloDinamico<K>(M);
//		for (int i = )
//		

//	}


	@Override
	public V remove(K key) {

		// TODO Auto-generated method stub
		V respuesta = null;
		if (key != null)
		{
			respuesta = get(key);
			put(key,null);
		}
		
		return respuesta;

	}

	@Override
	public boolean contains(K key) {
		// TODO Auto-generated method stub
		return get(key) != null;

		
	}


	@Override

	public boolean isEmpty() {

		// TODO Auto-generated method stub
		return size() == 0;
		

	}

	@Override


	public int size() {

		// TODO Auto-generated method stub
		return N;
	}

	@Override

	public ArregloDinamico<K> keySet() {

		// TODO Auto-generated method stub
	

        // TODO Auto-generated method stub
		ArregloDinamico<K> respuesta = new ArregloDinamico<K>(M);
		if(keys.esVacio())
		{
			respuesta = null;
		}
		else 
		{
		for (int i = 0; i<keys.darTamano();i++)
		{
			K dato = keys.darElemento(i);
			respuesta.agregar(dato);            
		}
		}
		return respuesta;
    }


	@Override

	public ArregloDinamico<V> valueSet() 
	{

		// TODO Auto-generated method stub
		ArregloDinamico<V> respuesta = new ArregloDinamico<V>(M);
		if(values.esVacio())
		{
			respuesta = null;
		}
		else 
		{
		for (int i = 0; i<values.darTamano();i++)
		{
			V dato = values.darElemento(i);
			respuesta.agregar(dato);            
		}
		}
		return respuesta;
		
	}
	/**
	 * Hace el rehash a la tabla. <b>post:</b> La tabla queda poblada nuevamente con
	 * sus pares llave-valor y el atributo numOfRehashes aumenta en 1.
	 */
	private void rehash( )
	{
		numOfRehashes++;
		capacity *= 2;				// Se duplica la capacidad de la tabla.
		SequentialSearchST<K, V>[] pares = st; // Guarda los pares llave-valor.
							// Reinicializa la tabla.

		for( int i = 0; i < pares.length; i++ )
			for( SequentialSearchST<K,V> x = pares[i]; x != null; x = x.siguiente )
			{
				// Se inserta el nodo.
				put( x.key, x.value );

				// Se insertan los nodos dentro de la lista enlazada secundaria del nodo.
				for( V y : x.getSecondaryLinkedList( ) )
					insert( x.key, y );
			}
	}


}

	

