package br.com.blogger.superpestana.java8SeForTheReallyImpatient.chapter01;

public class Exercise6 {

	public static void main(String[] args){
		
		new Thread(RunnableEx.uncheck(
				 () -> { System.out.println("Zzz"); Thread.sleep(10000); })).start();
		
	}
}
 
