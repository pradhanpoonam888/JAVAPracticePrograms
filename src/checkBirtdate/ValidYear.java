package checkBirtdate;

public class ValidYear {
	
	 static int b_year;
	 static Boolean flag = false;
	
	public static Boolean validateValidYear(int b_year) {
		 int  min_yr= 2023-150;
		 int max = 2023;
		if(b_year >= min_yr && b_year <= 2023) {
			flag = true;
		//	System.out.println("Your have given a valid year : "+b_year+" .Thank you !!");		
		}
		return flag;
	}
	
	/*
	 *  Returns true if  
	 *   given year is valid. 
	 */
	public static Boolean isLeapYear(int b_year) {
		// Return true if year is  
        // a multiple of 4 and not  
        // multiple of 100. 
        // OR year is multiple of 400. 
       
		return( (b_year % 4 == 0) 
				&& ((b_year % 100 != 0) 
				|| (b_year % 400 == 0))
				);	
	}
	
}
