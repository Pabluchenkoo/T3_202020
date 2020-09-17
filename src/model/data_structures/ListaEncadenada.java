package model.data_structures;

import model.logic.Nodo;
import model.logic.Pelicula;

public class ListaEncadenada <T extends Comparable<T>> implements ILista<T> 


{

	
	private Nodo<T> primero;
	
	private int numElementos;
	
	public ListaEncadenada() 
	{
		
		primero = null;
		numElementos = 0;
	}

	@Override
	public void agregarPrimero (Nodo<T> element) 
	{
		// TODO Auto-generated method stub
		if( primero ==null)
		{
			primero = element;
		}
		else
		{
			element.cambiarSiguiente(primero);
			primero =  element;
		}
		numElementos++;
		
	}

	@Override
	public void agregarAlFinal(Nodo<T> element) 
	{
		// TODO Auto-generated method stub
		if(primero==null)
		{
			primero=element;
		}
		else
		{
			Nodo<T> p = ultimoElemento();
			
			p.insertarDespues(element);
		}
		numElementos++;
		
	}

	@Override
	public void insertarElemento(Nodo<T> element, int pos) 
	{
		// TODO Auto-generated method stub
		
		int contador=0;
		Nodo<T> actual = primero;
		if(primero==null)
		{
			primero= element;
		}
		else 
		{
			while(actual != null)
			{
				
				if(contador == pos)
				{
					element.cambiarSiguiente(actual.darSiguiente());
					element.cambiarAnterior(actual);
					actual.darSiguiente().cambiarAnterior(element);
					actual.cambiarSiguiente(element);
					
				}
				else
				{
					actual.darSiguiente();
				}
				contador++;
				
			}
		}
		
		
	}

	@Override
	public Nodo<T> removerPrimero() 
	{
		
		primero =  primero.darSiguiente();
		
		return primero;
	}

	@Override
	public Nodo<T> RemoverUltimo() {
		
		ultimoElemento().cambiarSiguiente(null);
		return ultimoElemento();
	}

	@Override
	public Nodo<T> borrarElemento(int pos) 
	{
		
		Nodo<T> elemento = obtenerElemento(pos);
		elemento.darAnterior().cambiarSiguiente(elemento.darSiguiente());
		elemento.darSiguiente().cambiarAnterior(elemento.darAnterior());
		
		
		return elemento;
	}

	@Override
	public Nodo<T> PrimerElemento() 
	{
		
		
		return primero;
	}

	@Override
	public Nodo<T> ultimoElemento() {
		
		Nodo<T> actual = primero;
		if(actual != null)
		{
			while ( actual.darSiguiente() != null)
			{
				actual= actual.darSiguiente();
			}
		}
		return actual;
	}

	@Override
	public Nodo<T> obtenerElemento( int pos) 
	{
		
		Nodo<T> actual = primero;
		Nodo<T> respuesta = null;
		int contador = 0;
		
		while(actual != null)
		{
			if(contador == pos)
			{
				respuesta = actual;
			}
			else
			{
				actual = actual.darSiguiente();
			}
			contador ++;
			
		}
		
		
		return respuesta;
	}

	@Override
	public int tamanio() {
		
		
		return numElementos;
	}

	@Override
	public boolean esVacio() {
		
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
	public int estaPresente(Nodo<T> element) 
	{
		
		int respuesta = 0;
		Nodo<T> actual = primero;
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
					actual.darSiguiente();
				}
				
				
			}
		}
		
		
		return respuesta;
	}

	@Override
	public void intercambiar(int pos1, int pos2) 
	{
		// TODO Auto-generated method stub
		Nodo<T> elementoPos1 = obtenerElemento(pos1);
		Nodo<T> elementoPos2 = obtenerElemento(pos2);
		
		cambiarInformacion(pos1, elementoPos2);
		cambiarInformacion(pos2, elementoPos1);
		
		
	}

	@Override
	public void cambiarInformacion(int pos, Nodo<T> elem) 
	{
		
		@SuppressWarnings("unused")
		Nodo<T> elementoPos = obtenerElemento(pos);
		elementoPos = elem;

	}

	
	
	
	
	




}
