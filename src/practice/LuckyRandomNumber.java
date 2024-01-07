package practice;

import java.util.Random;
import java.util.Scanner;

public class LuckyRandomNumber {
	static int luckynum ;
	static Random randnum=new Random();
	static Scanner input=new Scanner(System.in);
	static int limit;

	public static void main(String[] args) {
		
		generateLuckyNum();
		System.out.println("Your Lucky Number is : " + luckynum);

	}

	/**
	 * 
	 */
	private static void generateLuckyNum() {
		System.out.println("Please give the number limit : ");
		limit=input.nextInt();
		
		luckynum=randnum.nextInt(limit);
	}

}
