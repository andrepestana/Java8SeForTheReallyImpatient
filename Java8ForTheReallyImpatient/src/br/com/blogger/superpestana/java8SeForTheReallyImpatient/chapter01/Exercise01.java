package br.com.blogger.superpestana.java8SeForTheReallyImpatient.chapter01;

import java.util.Arrays;
import java.util.Comparator;

public class Exercise01 {

	public static void main(String... args) {
		
		String[] strings = new String[] {"cake","ball", "apple"};
		
		System.out.println(Thread.currentThread().getName());
		
		new Thread(() -> { System.out.println("new Thread "+Thread.currentThread().getName());}).start();
		
		Comparator<String> comp = (String first, String second) -> {
			System.out.println("Comparator thread: "+Thread.currentThread().getName());
			return first.compareTo(second);};
		
		Arrays.sort(strings, comp);
		
		for (String string : strings) {
			System.out.println(string);
		}
		
	}
}
