package model.data_structures;


public class SequentialSearchST<K,V> {
	
	private Nodo primero;
	
	public class Nodo 
	
	{
		
		K key;
		
		V value;
		
		Nodo siguiente;
		
		public Nodo (K key, V value, Nodo siguiente)
		{
			this.key = key;
			
			this.value = value;
			
			this.siguiente = siguiente;
		}
	}
		public V get( K key )
		{
			for( Nodo i = primero ; i != null ; i = i.siguiente )
			{
				if ( key.equals(i.key) )
				{
					return i.value;
				}
			}
			return null;
		}
		
		public void put (K key, V value)
		{
			for ( Nodo i = primero ; i!= null ; i = i.siguiente )
			{
				if ( key.equals(i.key) )
				{
					i.value = value;
					return;
				}
				
				primero = new Nodo ( key,value,primero );
			}
		}
	}

	
