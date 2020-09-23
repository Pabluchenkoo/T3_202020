package model.data_structures;





public interface TablaSimbolos<K extends Comparable<K> , V extends Comparable <V>>
{															//CarlosDios
	
	/*Agregar una dupla (K, V) a la tabla. Si la llave K existe, se reemplaza su valor V
	asociado. V no puede ser null. En este caso una llave K solo tiene asociado un
	valor V. */
	void put(K element , V element1);
	
	
	
	/*Obtener el valor V asociado a la llave K. Se obtiene null solo si la llave K no existe.
	Se usa el comparador sobre las llaves para saber si existe.*/
	V get( K element );
	
	
	
	/* Borrar la dupla asociada a la llave K. Se obtiene el valor V asociado a la llave K.
	Se obtiene null solo si la llave K no existe. */
	V remove( K element);
	
	
	/*Retorna true en el caso que la llave K se encuentre almacenada en la Tabla, o
 	false en el caso contrario*/
	boolean contains ( K element );
	
	
	/* Retorna true si la Tabla NO tiene datos, o false en caso contrario. */
	boolean isEmpty ( );
	
	
	/* Retorna el número de duplas en la Tabla de Símbolos */
	int size ( ); 
	
	
	/* Retorna todas las llaves almacenadas en la Tabla. */
	ArregloDinamico<K> keySet();
	
	
	/* Retorna todos los valores almacenados en la Tabla. */
	ArregloDinamico<V> valueSet();

//	class Map <K, V> {
//	class MapNode<K, V> { 
//		  
//        K key; 
//        V value; 
//        MapNode<K, V> next; 
//  
//        public MapNode(K key, V value) 
//        { 
//            this.key = key; 
//            this.value = value; 
//            next = null; 
//        } 
//    } 
//  
//    // The bucket array where 
//    // the nodes containing K-V pairs are stored 
//    ArrayList<MapNode<K, V> > buckets; 
//  
//    // No. of pairs stored - n 
//    int size; 
//  
//    // Size of the bucketArray - b 
//    int numBuckets; 
//  
//    // Default loadFactor 
//    final double DEFAULT_LOAD_FACTOR = 0.75; 
//  
//    public Map() 
//    { 
//        numBuckets = 5; 
//  
//        buckets = new ArrayList<>(numBuckets); 
//  
//        for (int i = 0; i < numBuckets; i++) { 
//            // Initialising to null 
//            buckets.add(null); 
//        } 
//        System.out.println("HashMap created"); 
//        System.out.println("Number of pairs in the Map: " + size); 
//        System.out.println("Size of Map: " + numBuckets); 
//        System.out.println("Default Load Factor : " + DEFAULT_LOAD_FACTOR + "\n"); 
//    } 
//  
//    private int getBucketInd(K key) 
//    { 
//  
//        // Using the inbuilt function from the object class 
//        int hashCode = key.hashCode(); 
//  
//        // array index = hashCode%numBuckets 
//        return (hashCode % numBuckets); 
//    } 
//  
//    public void insert(K key, V value) 
//    { 
//        // Getting the index at which it needs to be inserted 
//        int bucketInd = getBucketInd(key); 
//  
//        // The first node at that index 
//        MapNode<K, V> head = buckets.get(bucketInd); 
//  
//        // First, loop through all the nodes present at that index 
//        // to check if the key already exists 
//        while (head != null) { 
//  
//            // If already present the value is updated 
//            if (head.key.equals(key)) { 
//                head.value = value; 
//                return; 
//            } 
//            head = head.next; 
//        } 
//  
//        // new node with the K and V 
//        MapNode<K, V> newElementNode = new MapNode<K, V>(key, value); 
//  
//        // The head node at the index 
//        head = buckets.get(bucketInd); 
//  
//        // the new node is inserted 
//        // by making it the head 
//        // and it's next is the previous head 
//        newElementNode.next = head; 
//  
//        buckets.set(bucketInd, newElementNode); 
//  
//        System.out.println("Pair(" + key + ", " + value + ") inserted successfully.\n"); 
//  
//        // Incrementing size 
//        // as new K-V pair is added to the map 
//        size++; 
//  
//        // Load factor calculated 
//        double loadFactor = (1.0 * size) / numBuckets; 
//  
//        System.out.println("Current Load factor = " + loadFactor); 
//  
//        // If the load factor is > 0.75, rehashing is done 
//        if (loadFactor > DEFAULT_LOAD_FACTOR) { 
//            System.out.println(loadFactor + " is greater than " + DEFAULT_LOAD_FACTOR); 
//            System.out.println("Therefore Rehashing will be done.\n"); 
//  
//            // Rehash 
//            rehash(); 
//  
//            System.out.println("New Size of Map: " + numBuckets + "\n"); 
//        } 
//  
//        System.out.println("Number of pairs in the Map: " + size); 
//        System.out.println("Size of Map: " + numBuckets + "\n"); 
//    } 
//  
//    private void rehash() 
//    { 
//  
//        System.out.println("\n***Rehashing Started***\n"); 
//  
//        // The present bucket list is made temp 
//        ArrayList<MapNode<K, V> > temp = buckets; 
//  
//        // New bucketList of double the old size is created 
//        buckets = new ArrayList<MapNode<K, V> >(2 * numBuckets); 
//  
//        for (int i = 0; i < 2 * numBuckets; i++) { 
//            // Initialised to null 
//            buckets.add(null); 
//        } 
//        // Now size is made zero 
//        // and we loop through all the nodes in the original bucket list(temp) 
//        // and insert it into the new list 
//        size = 0; 
//        numBuckets *= 2; 
//  
//        for (int i = 0; i < temp.size(); i++) { 
//  
//            // head of the chain at that index 
//            MapNode<K, V> head = temp.get(i); 
//  
//            while (head != null) { 
//                K key = head.key; 
//                V val = head.value; 
//  
//                // calling the insert function for each node in temp 
//                // as the new list is now the bucketArray 
//                insert(key, val); 
//                head = head.next; 
//            } 
//        } 
//  
//        System.out.println("\n***Rehashing Ended***\n"); 
//    } 
//  
//    public void printMap() 
//    { 
//  
//        // The present bucket list is made temp 
//        ArrayList<MapNode<K, V> > temp = buckets; 
//  
//        System.out.println("Current HashMap:"); 
//        // loop through all the nodes and print them 
//        for (int i = 0; i < temp.size(); i++) { 
//  
//            // head of the chain at that index 
//            MapNode<K, V> head = temp.get(i); 
//  
//            while (head != null) { 
//                System.out.println("key = " + head.key + ", val = " + head.value); 
//  
//                head = head.next; 
//            } 
//        } 
//        System.out.println(); 
//    } 
//}
}

