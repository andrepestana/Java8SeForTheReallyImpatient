package br.com.blogger.superpestana.java8SeForTheReallyImpatient.chapter01;

public interface RunnableEx {

	void run() throws Exception;
	
	public static Runnable uncheck(RunnableEx r) {
	    return () -> {
	        try {
	            r.run();
	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }
	    };
	}
	 
	 
	
	
}
