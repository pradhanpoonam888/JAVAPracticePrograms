package String;

import java.util.Scanner;

public class ValidName {

	private static String name;

	public static void main(String[] args) {

		boolean ValidName = false;
		
		Scanner ip=new Scanner(System.in);
		/*
		 * System.out.println("Please enter your full Name : "); name=ip.nextLine();
		 */
		
		while(!ValidName ){
			System.out.println("Please enter your full Name : ");
			name=ip.nextLine();
			ValidName = checkValidName(name);
			System.out.println(ValidName);
		}
		
		System.out.print("Hello " +name+ " Hope you have a good day !!");
	}

	private static boolean checkValidName(String name2) {
		boolean flag = false;
		if(name2.isBlank() || name2.isEmpty() ) {
			System.out.println("Please enter your name .It is currently blank !!");
			return flag = false;
		  
		}else if(name2.length() <= 2) {
			System.out.println("Please enter your name .Currently its less than 2 charaters");
			return flag = false;
			
		}else if(name2.contains("#") ||name2.contains("@") || name2.contains("!") || name2.contains("$") || name2.contains("%")
				|| name2.contains("!") || name2.contains("^") || name2.contains("*")) {
			System.out.println("Please enter your name .Currently it has special charaters");
			return flag = false;
		}else if(!name2.contains(" ")) {
			System.out.println("Please enter your full name ");
			return flag = false;
		}else{
			System.out.println("Thank you forf entering your name. " + name2+" .");
			return flag = true;
		}
	}

}
