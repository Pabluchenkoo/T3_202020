package model.data_structures;

import model.logic.Nodo;

public interface ILista <T extends Comparable<T>> 
{
	
	
	
	/** Agrega un elemento al inicio de la lista */
	
	void agregarPrimero(Nodo<T> element);
	
	
	
	/** Agrega un elemento al final de la lista */
	
	void agregarAlFinal(Nodo<T> element);
	
	
	
	/** Agrega un elemento en la posición pos si la posición es una
	posición válida. Los elementos que estén a partir de la
	posición dada deben correrse una posición a la derecha. Las
	posiciones válidas son posiciones donde ya hay un
	elemento en la lista. La posición del primer elemento es 1,
	la del segundo es 2 y así sucesivamente. */
	
	void insertarElemento(Nodo<T> element, int pos);
	
	
	
	/** Elimina el primer elemento. Se retorna el elemento
	eliminado. */
	
	Nodo<T> removerPrimero( ) ;
	
	
	
	/** Elimina el último elemento. Se retorna el elemento
  	eliminado. */
	
	Nodo<T> RemoverUltimo( );
	
	
	/** Elimina el elemento de una posición válida. Se retorna el
	elemento eliminado */
	
	Nodo<T> borrarElemento( int pos);
	
	/** Retorna el primer elemento */
	
	Nodo<T> PrimerElemento( );
	
	
	/** Retorna el último elemento */
	
	Nodo<T> ultimoElemento() ;
	
	/** Retorna el elemento en una posición válida. La posición del
	primer elemento es 1, la del segundo es 2 y así
	sucesivamente. */
	
	Nodo<T> obtenerElemento( int pos);
	
	/** Retorna el número de datos en el arreglo **/
	
	int tamanio( );
	
	/** Retorna true si el arreglo No tiene datos. false en caso
	contrario. */
	
	boolean esVacio( );
	
	/** Retorna la posición válida de un elemento. Si no se
	encuentra el elemento, el valor retornado es -1. */
	
	int estaPresente (Nodo<T> element);
	
	
	/** Intercambia la información de los elementos en dos
	posiciones válidas. */
	
	void intercambiar (int pos1, int pos2);
	
	/** Actualiza el elemento en una posición válida. */
	
	void cambiarInformacion (int pos, Nodo<T> elem) ;



	
	
	
}
