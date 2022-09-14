package javas;


import java.util.Iterator;
import java.util.Scanner;

public class Naveen {

	public static void main(String[] args) {
		Naveen n = new Naveen();
		int a = 1;
		int b = 0;
		int c = 0;
		for (int i = 3; i <= 100; i++) {
			if (i == 3) {
				System.out.print(b +" "+ a+ " ");
			} else {

			}
			c = b+a;
			b=a;
			a=c;
			System.out.print(c+" ");
			
		}
		
	}
 
}