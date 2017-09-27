package br.com.blogger.superpestana.java8SeForTheReallyImpatient.chapter01;
import java.io.File;
import java.util.Arrays;

public class Exercise4 {

	
	public static void main(String[] args){
		
		File dir = new File("/tmp");
		
		File[] fileList = dir.listFiles();
		
		Arrays.sort(fileList, (File first, File second) -> first.getName().compareTo(second.getName()) );
	
		
		Arrays.sort(fileList, (File first, File second) -> {
			if(first.isDirectory() && second.isDirectory()) return 0;
			if(first.isDirectory() && second.isFile()) return -1;
			if(first.isFile() && second.isDirectory()) return 1;
			if(first.isFile() && second.isFile()){
				return first.getName().compareTo(second.getName());
			}
			return 0;
		});
		
		
		for (File file : fileList) {
			System.out.println(file);
		}
	}
	
}
