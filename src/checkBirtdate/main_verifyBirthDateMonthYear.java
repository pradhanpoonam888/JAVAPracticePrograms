package checkBirtdate;

import java.util.Scanner;

public class main_verifyBirthDateMonthYear {
	Scanner input = new Scanner(System.in);
	Scanner inputString = new Scanner(System.in);
	static int year;
	static String month;
	static int day;
	static boolean flag_month = false;
	static boolean flag_year = false;
	static boolean flag_day = false;

	public main_verifyBirthDateMonthYear() {
		setYear();
		setMonth();
		setDate();
	}

	public main_verifyBirthDateMonthYear(int yr, String mth, int dy) {
		setYear(yr);
		setMonth(mth);
		setDate(dy);
	}

	private void setDate() {
		System.out.println("Please enter your birth day : ");
		day = input.nextInt();
	}

	private void setMonth() {
		System.out.println("Please enter your birth month : ");
		month = inputString.nextLine();

	}

	private void setYear() {
		System.out.println("Please enter your birth year : ");
		year = input.nextInt();

	}

	private void setDate(int day2) {
		day = day2;
	}

	private void setMonth(String month2) {
		month = month2;

	}

	private void setYear(int year2) {
		year = year2;

	}

	public static void main(String[] args) {
		System.out.println("--------------- Your details --------------------");

		main_verifyBirthDateMonthYear bd = new main_verifyBirthDateMonthYear();
		System.out.println("Your birth month : " + month);
		System.out.println("Your birth day : " + day);
		System.out.println("Your birth year : " + year);
		System.out.println("--------------- Verify the Month--------------------");
		flag_month = ValidMonth.validateMonth(month);
		if (flag_month == true) {
			System.out.println("Month entered by you is valid : " + month);
		} else {
			System.out.println("Month entered by you is invalid : " + month);
		}
		System.out.println("--------------- Verify the Year--------------------");
		flag_year = ValidYear.validateValidYear(year);
		if (flag_year == true) {
			System.out.println("Year entered by you is valid : " + year);
		} else {
			System.out.println("Year entered by you is invalid : " + year);
		}

		System.out.println("Which month no. is this ?"+ValidMonth.getMonthNumber(month));
		System.out.println("--------------- Verify the date( day) of the month--------------------");
		
		flag_day=Validday.validatedate(month, day, year);
		
		if(flag_day == true) {
			System.out.println("date entered by you is valid : " + day);
		} else {
			System.out.println("date entered by you is invalid : " + day);
		}

		System.out.println("---------------Age Calculations--------------------");
		
		int age = CalculateAge.calculateAge(month, day, year);
		if(age > 0) {
			System.out.println("Calculated Age : " + age);
		}else {
			System.out.println("There is some issue with the Inputs .");
		}
		
		/*
		 * main_verifyBirthDateMonthYear bd1= new main_verifyBirthDateMonthYear(1999 ,
		 * "DEC", 31); System.out.println("Your birth month : " + month);
		 * System.out.println("Your birth day : " + day);
		 * System.out.println("Your birth year : " + year);
		 */

	}

}
