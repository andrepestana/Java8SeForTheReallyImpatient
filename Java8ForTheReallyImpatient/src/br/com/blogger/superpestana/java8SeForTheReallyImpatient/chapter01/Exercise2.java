package br.com.blogger.superpestana.java8SeForTheReallyImpatient.chapter01;
import java.io.File;
import java.io.FileFilter;

public class Exercise2 {

	
	public static void main(String[] args){
		
		
		File dir = new File("/tmp");
		
//		File[] files = dir.listFiles(new FileFilter(){
//
//			@Override
//			public boolean accept(File pathname) {
//				if (pathname.isDirectory())
//					return true;
//				
//				return false;
//			}
//			
//		});
//		
//		for (File file : files) {
//			System.out.println(file);
//		}
		
		for(File file : dir.listFiles(File::isDirectory)){
			System.out.println(file);
		}
		
		System.out.println("--------------");
		
		for(File file : dir.listFiles(File::isFile)){
			System.out.println(file);
		}
		
		
		
		
		
		
	}
}
