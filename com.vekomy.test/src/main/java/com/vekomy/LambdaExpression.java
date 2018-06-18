/**
 * 
 */
package com.vekomy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thirupal
 *
 */
@FunctionalInterface
interface myinterface{
	
	public String hello();
}



public class LambdaExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myinterface msg = () -> {System.out.println("hai"); return "hello";};
		
		System.out.println(msg.hello());
		
		List<String> list=new ArrayList<String>();  
	       list.add("Rick");         
	       list.add("Negan");       
	       list.add("Daryl");         
	       list.add("Glenn");         
	       list.add("Carl");                
	       list.forEach(          
	           // lambda expression        
	           (names)->System.out.println(names)         
	       );     

	}

}
