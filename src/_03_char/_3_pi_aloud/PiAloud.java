package _03_char._3_pi_aloud;

import java.io.IOException;
import java.util.Scanner;

public class PiAloud {
public static void main(String[] args) {
	

	// 1. Make a main method and make sure your program can run

	// 2. Make a String variable to hold 20 digits of Pi. You could use http://www.piday.org/million/ to get this.
String pi = "3.141592653589793238";
	// 3. Print out 3 digits of Pi. The first value is "pi.charAt(0)", the second is "pi.charAt(1)"
	// Check the console shows 3.1
pi.charAt(3);
System.out.println(pi.charAt(0));
System.out.println(pi.charAt(1));
System.out.println(pi.charAt(2));
	// 4. Print ALL the digits of of the Pi String (hint: use a loop)
for (int i = 0; i < pi.length(); i++) {
	System.out.println(pi.charAt(i));

}

}	
	
	/********************  Use these methods. DON'T CHANGE THE CODE BELOW  ******************/

	static void speak(char characterToSpeak) {
		try {
			Runtime.getRuntime().exec("say " + characterToSpeak).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static char getInputFromUser() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next().toCharArray()[0];
	}

}


