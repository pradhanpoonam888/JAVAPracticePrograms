package checkBirtdate;

import java.time.YearMonth;
import java.util.Date;

public class CalculateAge {
	public static int age;
	
	public static int calculateAge(String month, int day, int year) {
		
		if(ValidMonth.flag == true && ValidYear.flag == true && Validday.flag == true) {
			
			age =YearMonth.now().getYear()-year;
			
		}
		
		return age;
		 
	}
}
