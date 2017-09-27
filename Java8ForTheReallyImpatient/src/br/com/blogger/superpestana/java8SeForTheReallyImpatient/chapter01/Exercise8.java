package br.com.blogger.superpestana.java8SeForTheReallyImpatient.chapter01;
import java.util.ArrayList;
import java.util.List;

public class Exercise8 {

	public static void main(String... args){
		
		System.out.println("Enhanced loop variable");
		
		String[] names = { "Peter", "Paul", "Mary" };
		List<Runnable> runners = new ArrayList<>();
		
		for (String name : names)
			runners.add(() -> System.out.println(name));
		
		for (Runnable runner : runners) {
			new Thread(runner).start();
		}
		
		runners.clear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
		System.out.println("\nTraditional loop variable");
		
		for (int i = 0; i < names.length; i++) {
            // runners.add(() -> System.out.println(names[i])); 
        	// i variable is modified so it can't be used in a lambda expression
        	
        	String name = names[i]; // name is not modified
        	runners.add(() -> System.out.println(name));
        }
        
		for (Runnable runner : runners) {
            new Thread(runner).start();
        }
	}
}
