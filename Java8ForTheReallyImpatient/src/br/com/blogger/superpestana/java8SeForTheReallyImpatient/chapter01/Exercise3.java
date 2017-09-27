package br.com.blogger.superpestana.java8SeForTheReallyImpatient.chapter01;
import java.io.File;

public class Exercise3 {

	public static void main(String[] args){
		File dir = new File("/tmp");
		String extension = ".log";
		
		String[] filenames = dir.list( (file, name) -> name.toLowerCase().endsWith(extension) );
		
		for(String filename : filenames){
			System.out.println(filename);
		}
	}
}
