package model.data_structures;

import model.data_structures.SequentialSearchST.Nodo1;

public class TablaHashLinearProbing<K extends Comparable<K>, V extends Comparable <V>> implements TablaSimbolos <K, V> 
{
	
	private static final double MAXIMUM_LOAD_FACTOR = 5.0;
	
	private double loadFactor = 0.0;
	
	
	//atributos
	
	private int N; // number of key-value pairs in the table
	
	private int M; // size of linear-probing table  
	private ArregloDinamico<K> keys; // the keys
	private ArregloDinamico<V> values; // the values
	private int numOfRehashes = 0;
	//constructor
	public TablaHashLinearProbing(int cap)
	{
		
		keys = new ArregloDinamico<K>(M);
		values = new ArregloDinamico<V>(M);	
	}
	
	//metodos
	
	
	@Override
	public void put(K key, V pValue) 
	{
		// TODO Auto-generated method stub
		if(N>=M/2)
		{
			resize(2*M);
		}
		for(int i = hash(key);keys.darElemento(i) != null; i =(i+1) / M)
		{
			if(keys.darElemento(i).equals(key))
			{
				
				values.cambiarInformacion(i, pValue); //CarlosDios¿?
				return;
			}
		keys.cambiarInformacion(i, key);
		values.cambiarInformacion(i, pValue);
			
		}
		N++;
		
		
	}

	@Override
	public V get(K key) {
		// TODO Auto-generated method stub
		for(int i = hash(key);keys.darElemento(i) != null; i = (i+1)/M)
		{
			if(keys.darElemento(i).equals(key))
			{
				return values.darElemento(i);
			}
		}
		
		return null;
	}

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
	public int 	size() {
		
		return N;
	}

	@Override
	public ArregloDinamico<K> keySet() 
	{
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
	public ArregloDinamico<V> valueSet() {
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

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		
		return size() == 0;
	}

//	private void resize (int cap)
//	{
//		TablaHashLinearProbing < K, V> t;
//		t = new TablaHashLinearProbing < K, V> (cap);
//		for (int i =0;i<M;i++)
//		{
//			if(keys.darElemento(i) != null)
//			{
//				t.put(keys.darElemento(i), values.darElemento(i));
//			}
//			
//		}
//		keys = t.keys;
//		values = t.values;
//	}
	private void resize(int capacity) {
        TablaHashLinearProbing<K, V> temp = new TablaHashLinearProbing<K, V>(capacity);
        for (int i = 0; i < M; i++) {
            if (keys.obtenerElementoPos(i) != null) 
            {
                temp.put(keys.obtenerElementoPos(i), values.obtenerElementoPos(i));
            }
        }
        keys = temp.keys;
        values = temp.values;
        M    = temp.M;
    }
	private int hash (K key)
	{
		
		if(N/M >= 0.75)
		{
			SequentialSearchST<K,V> x = new SequentialSearchST<K,V>();
			x.rehash();
			numOfRehashes++;
			
		}
	
		return (key.hashCode() & 0x7fffffff) % M;
	}
	public int darM()
	{
		return M;
	}
	public int darN()
	{
		return N;
	}
	public int darNumOfRehashes()
	{
		return numOfRehashes;
	}
	public double darLoadFactor()
	{
		return loadFactor;
	}
}




	

