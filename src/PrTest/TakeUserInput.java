package PrTest;

import java.util.Scanner;

public class TakeUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter your age");
		Scanner scanner = new Scanner(System.in);
		
		int age= scanner.nextInt();	
		if(age>18)
		{
			System.out.println("You are an Adult");
		}
        System.out.println("What is your name?");
        Scanner stringscanner = new Scanner(System.in);
        String name = stringscanner.nextLine();
        System.out.println(name + " is a nice name!");
	}

}
