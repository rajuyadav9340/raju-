package app_java_1;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Paranthesis");
	String x = scan.nextLine();
	int a = 0;
	int b = 0;
	for (int i = 0; i < x.length(); i++) {
		if(x.charAt(i)=='(') {
			a++;
		}else if(x.charAt(i)==')') {
			b++;
			
		}
	}
	if(a==b) {
		System.out.println("Not Error");
	}else {
		System.out.println("Error");
	}
	}
}