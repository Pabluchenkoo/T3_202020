package model.data_structures;

import java.util.ArrayList;

import model.data_structures.SequentialSearchST.Nodo1;
import model.logic.Nodo;

public class TablaHashSeparateChaining <K extends Comparable<K>, V extends Comparable <V>> implements TablaSimbolos <K, V>{
	
	private int M;
	private int numeroRehashes;
	private int N; // number of key-value pairs in the table
	
	private ArregloDinamico<K> keys; // the keys
	private ArregloDinamico<V> values; // the values
	
	private SequentialSearchST<K, V>[] st;
	
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
			numeroRehashes++;
			
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
}

	

