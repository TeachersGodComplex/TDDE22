
/** 
 * This class represents a symbol table, or hash table, with a very
 * simple hash function. Observe that you are not supposed to change
 * hash function. Ensure that you use linear probing as your method of
 * collision handling.
 *
 * @author Magnus Nielsen, Tommy Färnqvist ...
 */
public class SymbolTable {
    private static final int INIT_CAPACITY = 7;

    /* Number of key-value pairs in the symbol table */
    private int size;
    /* Size of linear probing table */
    private int maxSize;
    /* The keys */
    private String[] keys;
    /* The values */
    private Character[] vals;

    /**
     * Create an empty hash table - use 7 as default size
     */
    public SymbolTable() {
	this(INIT_CAPACITY);
    }

    /**
     * Create linear probing hash table of given capacity
     */
    public SymbolTable(int capacity) {
	size = 0;
	maxSize = capacity;
	keys = new String[maxSize];
	vals = new Character[maxSize];
    }

    /**
     * Return the number of key-value pairs in the symbol table
     */
    public int size() {
	return size;
    }

    /**
     * Is the symbol table empty?
     */
    public boolean isEmpty() {
	return size() == 0;
    }

    /**
     * Does a key-value pair with the given key exist in the symbol table?
     */
    public boolean contains(String key) {
	return get(key) != null;
    }

    /**
     * Hash function for keys - returns value between 0 and maxSize-1
     */
    public int hash(String key) {
	int i;
	int v = 0;

	for (i = 0; i < key.length(); i++) {
	    v += key.charAt(i);
	}
	return v % maxSize;
    }

    /**
     * Insert the key-value pair into the symbol table.
     * TODO: implement the put method.
     * 
     * Placera key på dess hashade index. 
     * Placera val på motsvarandde index 
     * 
     */
    public void put(String key, Character val) {
        index = v;
        while keys[index] != null {
            if keys[index].equals(key) {
            vals[index] = val; // Uppdaterar värdet 
            break
            
            else (index+1) % maxSize;  
                return; 
            }
        }
    keys[index] = key;
    vals[index] = val;
    size++;       
    }
	

    /**
     * Return the value associated with the given key, null if no such
     * value.
     * TODO: implement the get method.
     * 
     * Hämta val som är kopplat till key
     * 
     */
    public Character get(String key) {
        index = v; 
        if key[index] == null
            return null;
            for (int i = 0; i < Size; i++) {   // Loopar igenom alla index för listan 
                if keys[index].equal(key)
                return vals[index]; // Om key matchar key på index returnera val på index 
                // break???
                else (index+1) % maxSize;        // I think I'll do a wraparound
            }
        return null;    // Nyckeln finns inte idiot 
    } 

    /**
     * Delete the key (and associated value) from the symbol table.
     * TODO: implement the delete method.
     * 
     * Ta bort key och tillhörande val
     * Om key/val är i en indexkedja ska alla värden efter key/val i indexkedjan flyttas ett steg till vänster
     * 
     */
    public void delete(String key) {
	return;
    } 

    /**
     * Print the contents of the symbol table.
     */
    public void dump() {
	String str = "";

	for (int i = 0; i < maxSize; i++) {
	    str = str + i + ". " + vals[i];
	    if (keys[i] != null) {
		str = str + " " + keys[i] + " (";
		str = str + hash(keys[i]) + ")";
	    } else {
		str = str + " -";
	    }
	    System.out.println(str);
	    str = "";
	}
    }
}
