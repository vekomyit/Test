/**
 * 
 */
package com.vekomy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author thirupal
 *
 */
public class ExampleTest {

	/**
	 * @param <T>
	 * @param args
	 */
	public static <T> void main(String[] args) {
		
		
   // HashSet<String> hs = new HashSet<String>();
    
    List<T> hs = new ArrayList<T>();
    
    //String s = new String("Thiru");
    Integer i = new Integer(42);
    hs.add((T) "thiru");
    hs.add((T) i);
    
   /* for(String h:hs){
    	System.out.println(" before reference is === "+h.hashCode());
    }*/
    
   /* hs.add("thirupal");
    hs.add("thirupal1");
    hs.add("thirupal2");
    hs.add("thirupal3");
    hs.add("thirupal4");*/
    
    for(T h:hs){
    	System.out.println(" after reference is === "+h);
    }
    
	}

}
