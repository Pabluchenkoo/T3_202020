package model.data_structures;

import java.util.Comparator;

public class ShellSort {
	
	public static void sort( Comparable[]array )
	{
		int N = array.length;
		
		for ( int i = 0 ; i < N ; i++ )
			
		{
			int minimo = i;
			
			for ( int j = i + 1 ; j < N ; j++ )
			{
				if ( less( array[ j ] , array [ minimo ] )) minimo = j;
				
				exch( array , i , minimo );
				
			}
		}
		
	}
	
	public static  boolean less (Comparable c, Object v )
	{
		return c.compareTo(v) < 0;
	}
	
	public static void exch ( Object [] a, int i, int j )
	{
		Object t = a[ i ]; 
		a[ i ] = a [ j ];
		a[ j ] = t;
	}
}
