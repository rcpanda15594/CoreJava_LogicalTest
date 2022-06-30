package com.test;

/**
 * Make Test.class file and convert it to .jar file and place/paste in to ext. folder (jdk\jre\lib\ext) to check 
 * Extension class loader
 * @author Ramesh
 *
 */
public class CheckClassLoader {

	public static void main(String[] args) {
		System.out.println(String.class.getClassLoader());/* O/P:null bcoz this class loader is not created by Java i.e is
		 																created by other native language like c/c++*/
		System.out.println(DuplicateCharactersFromString.class.getClassLoader());
		//System.out.println(Test.class.getClassLoader());
		
	}

}
