package model.data_structures;

import model.logic.Nodo;

public interface IArregloDinamico<T extends Comparable<T>> {

//	/**
//	 * Retornar el numero de elementos maximo en el arreglo
//	 * @return
//	 */
//	int darCapacidad( );
//
//	/**
//	 * Retornar el numero de elementos presentes en el arreglo
//	 * @return
//	 */
//	int darTamano( );
//	
//	/**
//	 * Retornar el elemento en la posicion i
//	 * @param i posicion de consulta
//	 * @return elemento de consulta. null si no hay elemento en posicion.
//	 */
//	Object darElemento( int i );
//
//	/**
//	 * Agregar un dato de forma compacta (en la primera casilla disponible) 
//	 * Caso Especial: Si el arreglo esta lleno debe aumentarse su capacidad, agregar el nuevo dato y deben quedar multiples casillas disponibles para futuros nuevos datos.
//	 * @param dato nuevo elemento
//	 */
//	public void agregar( Object dato );
//		
//	/**
//	 * Buscar un dato en el arreglo.
//	 * @param dato Objeto de busqueda en el arreglo
//	 * @return elemento encontrado en el arreglo (si existe). null si no se encontro el dato.
//	 */
//	Object buscar(Object dato);
//	
//	/**
//	 * Eliminar un dato del arreglo.
//	 * Los datos restantes deben quedar "compactos" desde la posicion 0.
//	 * @param dato Objeto de eliminacion en el arreglo
//	 * @return dato eliminado
//	 */
//	Object eliminar( Object dato );

/** Agrega un elemento al inicio de la lista */
	
	void agregarPrimero(T element);
	
	
	
	/** Agrega un elemento al final de la lista */
	
	void agregarAlFinal(T element);
	
	
	
	/** Agrega un elemento en la posición pos si la posición es una
	posición válida. Los elementos que estén a partir de la
	posición dada deben correrse una posición a la derecha. Las
	posiciones válidas son posiciones donde ya hay un
	elemento en la lista. La posición del primer elemento es 1,
	la del segundo es 2 y así sucesivamente. */
	
	void insertarElemento(T element, int pos);
	
	
	
	/** Elimina el primer elemento. Se retorna el elemento
	eliminado. */
	
	T removerPrimero( ) ;
	
	
	
	/** Elimina el último elemento. Se retorna el elemento
  	eliminado. */
	
	T RemoverUltimo( );
	
	
	/** Elimina el elemento de una posición válida. Se retorna el
	elemento eliminado */
	
	T borrarElemento( int pos);
	
	/** Retorna el primer elemento */
	
	T PrimerElemento( );
	
	
	/** Retorna el último elemento */
	
	T ultimoElemento() ;
	
	/** Retorna el elemento en una posición válida. La posición del
	primer elemento es 1, la del segundo es 2 y así
	sucesivamente. */
	
	T obtenerElementoPos( int pos);
	
	/** Retorna el número de datos en el arreglo **/
	
	int tamanio( );
	
	/** Retorna true si el arreglo No tiene datos. false en caso
	contrario. */
	
	boolean esVacio( );
	
	/** Retorna la posición válida de un elemento. Si no se
	encuentra el elemento, el valor retornado es -1. */
	
	int estaPresente (T element);
	
	
	/** Intercambia la información de los elementos en dos
	posiciones válidas. */
	
	void intercambiar (int pos1, int pos2);
	
	/** Actualiza el elemento en una posición válida. */
	
	void cambiarInformacion (int pos, T elem) ;



	T obtenerElementoElem(T elem);

}
