
package com.joysistvi.arraylist.day30;



import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapFriday {
    // key value pairs
    
    // key: databaseurl
    // value: jdbc:mysql://localhost:3306/pos_db
    
    // key: maxConnections
    // value: 50
    public static void main(String[] args) {
        HashMap<Integer, String> numberMapping = new HashMap<>();
        numberMapping.put(1, "One");
        numberMapping.put(2, "Two");
        numberMapping.put(3, "Three");
        System.out.println(numberMapping.containsKey(4));
        System.out.println(numberMapping.containsValue("Three"));
        
        
        System.out.println(numberMapping.get(1));
        
        Set<Integer> keys = numberMapping.keySet();
        System.out.println(keys);
        
        Collection<String> values = numberMapping.values();
        System.out.println(values);   
    }
    
    
}

