package String;

import String.SplitFullName;

public class CapitaliseName {
	public static SplitFullName ss=new SplitFullName();

	

	public static void main(String[] args) {
		SplitFullName.main(null);
		SplitFullName.getName();
		capitalizeName();
		SplitFullName.getName();
	}



	/**
	 * 
	 */
	private static void capitalizeName() {
		int count=0;
		for (String string : SplitFullName.nameSurname) {
			
			System.out.println(string.substring(0, 1));
			
			string = string.substring(0, 1).toUpperCase()+ string.substring(1);
			System.out.println(string);
			SplitFullName.nameSurname[count]=string;
			count++;
		}
	}

}