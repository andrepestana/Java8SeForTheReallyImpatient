package br.com.blogger.superpestana.java8SeForTheReallyImpatient.chapter01;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaTests {

	
	public static void main(String args[]){
		
		Comparator<String> comp
		 = (first, second) // Same as (String first, String second)
		 -> Integer.compare(first.length(), second.length());
		
		 List<String> strings = new ArrayList<>();
		 strings.add("abacate");
		 strings.add("caju");
		 strings.add("beterraba");
		 
		 
		 //strings.sort(Comparator.comparing(String::toString));
		 
		 
		 String[] arrayStrings = (String[]) strings.toArray(new String[strings.size()]);
		 
		 Arrays.sort(arrayStrings, String::compareToIgnoreCase);
		 
		 for (String string : arrayStrings) {
			System.out.println(string);
		}
		 
	}
	
	
}
