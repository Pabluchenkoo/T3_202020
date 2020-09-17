package model.logic;

import java.io.Serializable;

public class Nodo <T extends Comparable<T>> implements Serializable
{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;




	private Nodo<T> siguiente;
	
	
	
	 	
	private Nodo<T> anterior;
	
	public Nodo()
	{
		siguiente = null;
		anterior=null;
	}
	
	
	
	
	
	
	
	public  Nodo<T> darSiguiente()
	{
		return siguiente;
	}
	public Nodo<T> darAnterior()
	{
		return anterior;
	}
	public void cambiarAnterior(Nodo<T> elemento)
	{
		anterior = elemento;
	}
	
	public void cambiarSiguiente(Nodo<T> elemento)
	{
		siguiente = elemento;
	}
	public void desconectarSiguiente()
	{
		siguiente = siguiente.siguiente;
	}

	public void insertarDespues(Nodo<T> element) 
	{
		element.siguiente = siguiente;
        if( siguiente != null )
            siguiente.anterior = element;
        element.anterior = this;
        siguiente = element;

	}

	
	
	
	
	
	
	
	

}
