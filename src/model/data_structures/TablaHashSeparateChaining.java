package model.data_structures;

<<<<<<< HEAD
public class TablaHashSeparateChaining<K extends Comparable<K>, V extends Comparable <V>> implements TablaSimbolos <K, V>
{

	@Override
	public void put(K element, V element1) 
	{
		
		
	}

	@Override
	public V get(K element) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V remove(K element) 
	{
=======


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
>>>>>>> dec6c1b83c982c60c733ca8e980825d5b8e0e473
		// TODO Auto-generated method stub
		return null;
	}

	@Override
<<<<<<< HEAD
	public boolean contains(K element) 
	{
=======
	public boolean contains(K element) {
>>>>>>> dec6c1b83c982c60c733ca8e980825d5b8e0e473
		// TODO Auto-generated method stub
		return false;
	}

	@Override
<<<<<<< HEAD
	public boolean isEmpty() 
	{
=======
	public boolean isEmpty() {
>>>>>>> dec6c1b83c982c60c733ca8e980825d5b8e0e473
		// TODO Auto-generated method stub
		return false;
	}

	@Override
<<<<<<< HEAD
	public int size() 
	{
=======
	public int size() {
>>>>>>> dec6c1b83c982c60c733ca8e980825d5b8e0e473
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
<<<<<<< HEAD
	public ArregloDinamico<K> keySet() 
	{
=======
	public ArregloDinamico<K> keySet() {
>>>>>>> dec6c1b83c982c60c733ca8e980825d5b8e0e473
		// TODO Auto-generated method stub
		return null;
	}

	@Override
<<<<<<< HEAD
	public ArregloDinamico<V> valueSet() 
	{
=======
	public ArregloDinamico<V> valueSet() {
>>>>>>> dec6c1b83c982c60c733ca8e980825d5b8e0e473
		// TODO Auto-generated method stub
		return null;
	}

<<<<<<< HEAD
}
=======
	}
>>>>>>> dec6c1b83c982c60c733ca8e980825d5b8e0e473
