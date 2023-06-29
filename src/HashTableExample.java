import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashTable = new Hashtable<>();

        // Agregar valores a la HashTable
        hashTable.put(1, "Valor 1");
        hashTable.put(2, "Valor 2222222");
        hashTable.put(3, "Valor 3");
        hashTable.put(4, "Valor 4");
        hashTable.put(5, "Valor 5");
        hashTable.put(6, "Valor 6");
        hashTable.put(7, "Valor 7");
        hashTable.put(8, "Valor 8");

        // Imprimir la HashTable
        System.out.println("Contenido de HashTable: " + hashTable);

        // Obtener un valor usando una clave
        System.out.println("Valor para la clave 2: " + hashTable.get(2));

        // Verificar si la HashTable contiene una clave
        System.out.println("¿Contiene la clave 3?: " + hashTable.containsKey(3));

        // Eliminar un valor usando una clave
        hashTable.remove(3);
        System.out.println("Contenido de HashTable después de eliminar: " + hashTable);

        // Obtener el tamaño de la HashTable
        System.out.println("Tamaño de HashTable: " + hashTable.size());

        // Limpiar la HashTable
        hashTable.clear();
        System.out.println("Contenido de HashTable después de limpiar: " + hashTable);

        // Obtener el tamaño de la HashTable
        System.out.println("Tamaño de HashTable: " + hashTable.size());
    }
}
