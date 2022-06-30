package test.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Print_Random_5Nos {

	public static void main(String[] args) {

		Random r =new Random();
		r.ints().limit(5).forEach(System.out::println);
		
		List<String> s = Arrays.asList("RAM","SAM");
		
		for(String s1:s){
			if(s1.equals("SAM")){
				System.out.println("Yes avaliable");
			}
		}
		
		
	}

}
