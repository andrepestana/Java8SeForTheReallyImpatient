package br.com.blogger.superpestana.java8SeForTheReallyImpatient.chapter01;

public class Exercise7 {

	public static void main(String... args){
		
		andThen(()-> System.out.println(Thread.currentThread().getName()), ()-> System.out.println(Thread.currentThread().getName()));
				
	}
	
	public static void andThen(Runnable r1, Runnable r2){
		Thread t1 = new Thread(r1,"1");
		Thread t2 = new Thread(r2,"2");
		
		t1.start();
		t2.start();
	}
}
