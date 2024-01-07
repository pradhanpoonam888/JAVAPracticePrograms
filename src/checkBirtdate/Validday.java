package checkBirtdate;

public class Validday {
	static Boolean flag = false;
	static int mth;

	public static Boolean validatedate(String month, int day, int year) {

		mth = ValidMonth.getMonthNumber(month);
		// Months of April, June,
		// Sept and Nov must have
		// number of days less than
		// or equal to 30.
		switch (mth) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if(day <= 31 ) {
				System.out.println("Your Input- date for "+ month + " is valid : " + day);
				 flag = true;

			} else {
				System.out.println("Your Input-date for this " + month + " is incorrect !!! : " + day);
				 flag = false;

			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if(day <= 30 ) {
				System.out.println("Your Input- date for "+ month + " is valid : " + day);
				 flag = true;

			} else {
				System.out.println("Your Input-date for this " + month + " is incorrect !!! : " + day);
				 flag = false;

			}
			break;
		case 2:
			boolean leap = ValidYear.isLeapYear(year);
			// Handle February month
			// with leap year
			if (leap == true) {
				System.out.println("It is a Leap Year .");
				if (day <= 29) {
					System.out.println("Your Input for the Leap year " + year + " is true : " + day);
					 flag = true;

				} else {
					System.out.println("Your Input for this year " + year + " is incorrect !!! : " + day);
					 flag = false;

				}

			} else {
				if (day <= 28) {
					System.out.println("Your Input for this year " + year + " is true : " + day);
					 flag = true;

				} else {
					System.out.println("Your Input for this year " + year + " is incorrect !!! : " + day);
					 flag = false;

				}

			}
			break;

		default:
			break;
		}
		return flag;

	}
}
