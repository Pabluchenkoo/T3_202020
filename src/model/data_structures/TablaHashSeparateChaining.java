package model.data_structures;



public class TablaHashSeparateChaining <K extends Comparable<K>, V extends Comparable <V>> implements TablaSimbolos <K, V>{
	
	private int M;
	
	private int N; // number of key-value pairs in the table
	
	private ArregloDinamico<K> keys; // the keys
	private ArregloDinamico<V> values; // the values
	
	private SequentialSearchST<K, V>[] st;
	
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
	
	public Iterable	<K> keys()
	{  
		return keys(min(), max());  
	}

	@Override
	public V remove(K element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(K element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArregloDinamico<K> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArregloDinamico<V> valueSet() {
		// TODO Auto-generated method stub
		return null;
	}

	}
