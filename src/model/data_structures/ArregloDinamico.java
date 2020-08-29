package model.data_structures;

/**
 * 2019-01-23
 * Estructura de Datos Arreglo Dinamico de Strings.
 * El arreglo al llenarse (llegar a su maxima capacidad) debe aumentar su capacidad.
 * @author Fernando De la Rosa
 *
 */
public class ArregloDinamico <T extends Comparable<T>> implements ILista<T>{
		/**
		 * Capacidad maxima del arreglo
		 */
        private int tamanoMax;
		/**
		 * Numero de elementos presentes en el arreglo (de forma compacta desde la posicion 0)
		 */
        private int tamanoAct;
        /**
         * Arreglo de elementos de tamaNo maximo
         */
        private T elementos[ ];

        /**
         * Construir un arreglo con la capacidad maxima inicial.
         * @param max Capacidad maxima inicial
         */
		public ArregloDinamico( int max )
        {
               elementos = (T[]) new Object[max];
               tamanoMax = max;
               tamanoAct = 0;
        }
        
		public void agregar( T dato )
        {
               if ( tamanoAct == tamanoMax )
               {  // caso de arreglo lleno (aumentar tamaNo)
                    tamanoMax = 2 * tamanoMax;
                    T [ ] copia = elementos;
                    elementos = (T[]) new Object[tamanoMax];
                    for ( int i = 0; i < tamanoAct; i++)
                    {
                     	 elementos[i] = copia[i];
                    } 
            	    System.out.println("Arreglo lleno: " + tamanoAct + " - Arreglo duplicado: " + tamanoMax);
               }	
               elementos[tamanoAct] = dato;
               tamanoAct++;
       }

		public int darCapacidad() {
			return tamanoMax;
		}

		public int darTamano() {
			return tamanoAct;
		}

		public T darElemento(int i) {
			// TODO implementar
			if(i<0 || i>=tamanoAct){
				return null;
			}else{
				return elementos[i];
			}
			
		}

		public T buscar(Object dato) {
			// TODO implementar
			// Recomendacion: Usar el criterio de comparacion natural (metodo compareTo()) definido en Strings.
			
			boolean bandera = true;
			for (int i = 0; i < elementos.length && bandera; i++) {
					if(((Comparable<T>) elementos[i]).compareTo((T) dato)==0){
						bandera = false;
						return elementos[i];
					}
			}
			return null;
		}

		public Object eliminar(T dato) {
			// TODO implementar
			// Recomendacion: Usar el criterio de comparacion natural (metodo compareTo()) definido en Strings.
			boolean bandera = true;
			Object respuesta = null;
			for (int i = 0; i < elementos.length && bandera; i++) {
					if(((Comparable<T>) elementos[i]).compareTo((T) dato)==0){
						bandera = false;
						respuesta = elementos[i];
						elementos[i]=null;
						tamanoAct--;

					}
			}
			return respuesta;
		}
		
		
		////////
		public void addFirst(T element){
			
			tamanoAct++;
			T [] copia;
			
			copia =(T []) new  Object [tamanoAct];
			
			copia[0] = element;
			
			for(int i=0; i<elementos.length;i++){
				copia[i+1]=elementos[i];
			}
			
			elementos = copia;
		}

		@Override
		public void addLast(T element) {
			
			tamanoAct++;
			
			T [] copia;
			
			copia =(T []) new  Object [tamanoAct];
			
			
			
			for(int i=0; i<elementos.length;i++){
				copia[i]=elementos[i];
			}
			
			copia[tamanoAct] = element;
			
			elementos = copia;
			
		}

		@Override
		public void insertElement(T element, int pos) {
			
			tamanoAct++;
			
			T [] copia;
			
			copia =(T []) new  Object [tamanoAct];
			
			copia[pos] = element;
			
			for(int i=0; i<pos;i++){
				copia[i]=elementos[i];
			}
			
			for (int i = pos; i < elementos.length; i++) {
				copia[i]=elementos[i];
			}
			
			
			
			elementos = copia;
			
			
		}

		@Override
		public T removeFirst() {
			
			if(elementos.length == 0){
				
				return null;
			
			}else{
				
				tamanoAct--;
				
				T [] copia;
				
				copia =(T []) new  Object [tamanoAct];
				
				T buscado = elementos[0];
				
				for(int i=1; i<elementos.length;i++){
					copia[i-1]=elementos[i];
				}
				
				elementos = copia;
				
				return buscado;
			}
		}

		@Override
		public T removeLast() {
			
			if(elementos.length == 0){
				
				return null;
			
			}else{
				
				tamanoAct--;
				
				T [] copia;
				
				copia =(T []) new  Object [tamanoAct];
				
				T buscado = elementos[tamanoAct];
				
				for(int i=0; i<elementos.length-1 ;i++){
					copia[i]=elementos[i];
				}
				
				elementos = copia;
				
				return buscado;
			}
		
		}

		@Override
		public T deleteElement(int pos) {
			
			if(elementos.length == 0 || elementos.length < pos){
				
				return null;
			
			}else{
				
				tamanoAct--;
				
				T [] copia;
				
				copia =(T []) new  Object [tamanoAct];
				
				T buscado = elementos[pos];
				
				for(int i=0; i<pos ;i++){
					copia[i]=elementos[i];
				}
				
				for (int i = pos; i < elementos.length; i++) {
					copia[i]=elementos[i];
				}
				
				elementos = copia;
				
				return buscado;
			}
		}

		@Override
		public T firstElement() {
			
			if(elementos.length == 0){
				return null;
			}
			else{
				return elementos[0];
			}
		}

		@Override
		public T lastElement() {
			
			if(elementos.length == 0){
				return null;
			}
			else{
				return elementos[tamanoAct-1];
			}
		}

		@Override
		public T getElement(int pos) {
			
			if(elementos.length == 0){
				return null;
			}
			else{
				return elementos[pos];
			}
		}

		@Override
		public int size() {
			
			return tamanoAct;
		}

		@Override
		public boolean isEmpty() {
			
			if(tamanoAct > 0){
				return false;
			}
			else{
				return true;
			}
		}

		@Override
		public int isPresent(T element) {
			for (int i = 0; i < elementos.length; i++) {
				
				if(elementos[i] == element){
					return i;
				}
			}
			return -1;
		}

		@Override
		public void exchange(int pos1, int pos2) {
			
			T copia;
			
			copia = elementos[pos1];
			
			elementos[pos1] = elementos[pos2];
			
			elementos[pos2] = copia;
			
		}

		@Override
		public void changeInfo(int pos, T elem) {
			
			elementos[pos] = elem;
			
		}

		

}
