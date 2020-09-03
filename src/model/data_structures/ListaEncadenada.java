package model.data_structures;

import model.logic.Pelicula;

public class ListaEncadenada <T extends Comparable<T>> implements ILista<T> 


{

	
	private T primero;
	
	private int numElementos;
	
	public ListaEncadenada() 
	{
		
		primero = null;
		numElementos = 0;
	}

	@Override
	public void agregarPrimero(T element) 
	{
		// TODO Auto-generated method stub
		if( primero ==null)
		{
			primero = element;
		}
		else
		{
			((Pelicula) element).cambiarSiguiente(primero);
			primero = element;
		}
		numElementos++;
		
	}

	@Override
	public void agregarAlFinal(T element) 
	{
		// TODO Auto-generated method stub
		if(primero==null)
		{
			primero=element;
		}
		else
		{
			T p = ultimoElemento();
			
			((Pelicula) p).insertarDespues((Pelicula) element);
		}
		numElementos++;
		
	}

	@Override
	public void insertarElemento(T element, int pos) 
	{
		// TODO Auto-generated method stub
		
		int contador=0;
		if(primero==null)
		{
			primero= element;
		}
		else 
		{
			//while ()
		}
		
		
	}

	@Override
	public T removerPrimero() 
	{
		// TODO Auto-generated method stub
		primero = (T) ((Pelicula) primero).darSiguiente();
		
		return primero;
	}

	@Override
	public T RemoverUltimo() {
		// TODO Auto-generated method stub
		((Pelicula) ultimoElemento()).cambiarSiguiente(null);
		return ultimoElemento();
	}

	@Override
	public T borrarElemento(int pos) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public T PrimerElemento() 
	{
		// TODO Auto-generated method stub
		
		
		return primero;
	}

	@Override
	public T ultimoElemento() {
		// TODO Auto-generated method stub
		T actual = primero;
		if(actual != null)
		{
			while(((Pelicula) actual).darSiguiente() != null)
			{
				actual=(T) ((Pelicula) actual).darSiguiente();
			}
		}
		return actual;
	}

	@Override
	public T obtenerElemento(T elem) 
	{
		// TODO Auto-generated method stub
		
		
		return null;
	}

	@Override
	public int tamanio() {
		// TODO Auto-generated method stub
		
		return numElementos;
	}

	@Override
	public boolean esVacio() {
		// TODO Auto-generated method stub
		boolean respuesta = false;
		if(primero==null)
		{
			respuesta = true;
		}
		else
			
		{
			respuesta = false;
		}
		
		
		return respuesta;
	}

	@Override
	public int estaPresente(T element) 
	{
		// TODO Auto-generated method stub
		int respuesta = 0;
		T actual = primero;
		if( actual == null )
		{
			respuesta = 0;
		}
		else
		{
			while(  actual != null )
			{
				if(actual == element)
				{
					respuesta = 1;
				}
				else
				{
					((Pelicula) actual).darSiguiente();
				}
				
				
			}
		}
		
		
		return 0;
	}

	@Override
	public void intercambiar(int pos1, int pos2) 
	{
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void cambiarInformacion(int pos, T elem) 
	{
		// TODO Auto-generated method stub
		obtenerElemento(elem);
		
	}

	@Override
	public T obtenerElemento(int pos) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	




}
