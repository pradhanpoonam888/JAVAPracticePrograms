package practice;

import java.util.Scanner;

public class EvenOdd {
	static int i;
	static Scanner input=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please give the number :");
		i=input.nextInt();
		
		if(i % 2 == 0) {
			System.out.println(i +" is an Even Number");
		}else {
			System.out.println(i +" is an Odd Number");
		}
		
	}

}
