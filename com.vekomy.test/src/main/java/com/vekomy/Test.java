/**
 * 
 */
package com.vekomy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author thirupal
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//vekomy v = new vekomy();
		
		/*System.out.println();
		String s1 = "Cat";
        String s2 = "Cat";
        String s3 = new String("Cat");
        
        
        
        System.out.println("s1 == s2 :"+(s1==s2));
        System.out.println("s1 == s3 :"+(s1==s3));
		
		Animal a = new Dog();
		a.eat();*/

		
		/*String[] names ={"thiru","sai","thiru"};
		
		for(String name:names){
			
			int count = 0;
			
			for (int i=0;i<names.length;i++ ){
				
				if(name.equalsIgnoreCase(names[i])){
					
					count++;
				}
				
			}
			System.out.println(name+" count is "+count);
			
		}*/
		
		List<String> names = new ArrayList<String>();
		names.add("Ajeet");
		names.add("Negan");
		names.add("Aditya");
		names.add("Steve");
			
		//Using Stream and Lambda expression
		long count = ((Stream<String>) names.stream().spliterator()).filter(str->str.length()<6).count();
		System.out.println("There are "+count+" strings with length less than 6");
		
		names.forEach(System.out::println);

		
				
	}

}
