package br.com.blogger.superpestana.java8SeForTheReallyImpatient.chapter01;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise5 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			new Thread(() -> System.out.println(new SimpleDateFormat("HH:mm:ss.S").format(new Date()))).start();;
		}
	}

}
