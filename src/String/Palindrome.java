package String;

public class Palindrome {
	static String line;
	static boolean flag = true;
	// static String name="";

	public static void main(String[] args) {
		SplitFullName.main(null);
		SplitFullName.getName();
		checkPalindrome();

	}

	/**
	 * @return 
	 * 
	 */
	private static boolean checkPalindrome() {
		int length= SplitFullName.nameSurname.length;
		System.out.println();
		line = SplitFullName.fullname;
		if(length > 0) {
			System.out.println("-------------length > 0--------------");
			// racecar
			StringBuilder s=new StringBuilder(line);
			System.out.println("Your String : " +s);
			
			StringBuilder rev = s.reverse();
			String test = rev.toString();
			System.out.println("Your String : " +line);
			System.out.println("Reversed String : " +test);
	
			boolean i = line.equals(test);
			
			
			
			System.out.println("Output of compare is : " + i);
			
			if(i != true) {
				System.out.println("Input String is not a Palindrome");
				flag=false;
			}else {
				flag=true;
				System.out.println("Input String is a Palindrome.Congrats !!!");
			}
			
		}
		else{
		System.out.println("Please rerun the program with valid words.");
		flag = false;
	}return flag;
}

}
