package String;

public class FindVowels {

	static char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

	public static void main(String[] args) {

		SplitFullName.main(null);
		SplitFullName.getName();
		int count = 0;
		for (String string : SplitFullName.nameSurname) {
			System.out.println("----------"+string+"-----------------");
			for (char v : vowels) {
				int cchar =0;
				for (int i =0; i< string.length();i++) {
					
					if (string.charAt(i)== v) {
						count++;
						cchar++;
					}
					

				}
				System.out.println(v + " occurred in the " + string+" for "+cchar+" times");

			}
		}
		System.out.println("Vowels occured " + count + " time(s)");

	}

}
