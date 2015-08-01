package hashmap;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by tylerfolkman on 8/1/15.
 */
public class HashMapTF<K, V> {

    private static final int SIZE = 16;
    private LinkedList<Entry> [] table = new LinkedList[SIZE];

    class Entry{
        K key;
        V value;
    }

    public V get(K key){
        int hash = key.hashCode() % SIZE;
        LinkedList<Entry> linkedList = table[hash];
        for (int i = 0; i < linkedList.size(); i++){
            if (linkedList.get(i).key == key){
                return linkedList.get(i).value;
            }
        }
        return null;
    }

    public void put(K key, V value){
        int hash = key.hashCode() % SIZE;
        boolean foundKey = false;
        Entry entry = new Entry();
        entry.key = key;
        entry.value = value;

        LinkedList<Entry> linkedList = table[hash];
        if (linkedList == null){
            linkedList = new LinkedList<>();
        }

        for (int i = 0; i < linkedList.size(); i++){
            if (linkedList.get(i).key == key){
                linkedList.set(i, entry);
                table[hash] = linkedList;
                foundKey = true;
                break;
            }
        }

        if (foundKey == false){
            linkedList.add(entry);
            table[hash] = linkedList;
        }
    }
}
