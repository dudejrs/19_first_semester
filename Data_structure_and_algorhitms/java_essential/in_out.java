package java_essential;

import java.util.Scanner;

public class in_out {
	public static void main(String[] args) {
		System.out.println("name age score");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("Your name is "+name+"!");
		int age = scanner.nextInt();
		System.out.println("You are "+age+" years old!");
		double score = scanner.nextDouble();
		if(score >= 3.5){
			System.out.println("You doing good job");
		}
		else {
			System.out.println("You'd better do effort");
		}
		scanner.close();
		
	}
}
