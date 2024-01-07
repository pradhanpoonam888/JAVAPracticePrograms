package String;

public class FindLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SplitFullName.main(null);
		SplitFullName.getName();
		
		int length =  lenOfString();
		System.out.println("Length of the string is  : "+length);
	}

	/**
	 * @return
	 */
	private static int lenOfString() {
		System.out.println("How many words does this string has ? "+SplitFullName.nameSurname.length);
		int len = 0;
		for (String string : SplitFullName.nameSurname){
			len=string.length() + len;
		}
		return len;
	}
	
	public static int lenOfString(String[] Bigstring) {
		System.out.println("How many words does this string has ? "+SplitFullName.nameSurname.length);
		int len = 0;
		for (String string : Bigstring){
			len=string.length() + len;
		}
		return len;
	}

}
