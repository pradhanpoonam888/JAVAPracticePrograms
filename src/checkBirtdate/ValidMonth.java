package checkBirtdate;

public class ValidMonth {

	static int b_month =0 ;
	static String[] month_names = { "January", "February", "March", "April", "May", "June", "July", "August",
			"September", "October", "November", "December" };
	static Boolean flag = false;

	public static Boolean validateMonth(String birthmonth) {

		for (String name : month_names) {
			if (birthmonth.equalsIgnoreCase(name)) {
				/*
				 * System.out.println( "Your birth month " + birthmonth +
				 * " is a valid month.Thank you for your correct entry.");
				 */
				flag = true;
			}

		}
		if (flag == false) {
			flag=false;
		//	System.out.println("Please give correct month name.");

		}

		return flag;
	}
	
	public static int getMonthNumber(String month) {
		int count =0;
		for(String i :  month_names) {
			if(i.equalsIgnoreCase(month)) {
				b_month= count + 1 ;
				break;
			}
			count++;
		}
		return b_month;
		
	}
}
