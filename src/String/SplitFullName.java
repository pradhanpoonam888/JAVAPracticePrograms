package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SplitFullName {
	static String fullname;
	static String name;
	static String surname;
	static String[] wholename = new String[2]; // we have declared a string having only two elements .
	static String[] nameSurname = null;

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		setName(ip);
		// wholename = splitName(fullname);

		splitName(fullname.trim());
		getName();

	}

	/**
	 * 
	 */
	public static void getName() {
		System.out.println(Arrays.toString(nameSurname));
	}

	/**
	 * 
	 */
	private static void setName(Scanner ip) {

		System.out.println("Please Enter your full Name :");
		fullname = ip.nextLine();
		// System.out.println(fullname);
	}

	/**
	 * 
	 */
	@SuppressWarnings("null")
	private static String[] splitName(String fullname2) {

		// System.out.println(fullname2);
		// wert ui ui iuiuiui uiiu
		if (fullname2.indexOf(" ") == -1) {
			nameSurname = new String[1];
			nameSurname[0] = fullname2;

		} else {

			nameSurname = fullname2.split(" ");

		}
		Object o = trimSpacesNList(nameSurname);
//		System.out.println(Arrays.toString(nameSurname));
//		nameSurname;
		return nameSurname;
	}

	/**
	 * @param nameSurname
	 */
	private static Object trimSpacesNList(String[] nameSurname) {
		//// wert ui ui iuiuiui uiiu

		List<String> str = Arrays.asList(nameSurname);

		/*
		 * If we convert an array to List then its elements cannot be deleted as it is a
		 * Fixed sized List. ( which has been received from Arrays.asList)
		 */
		/*
		 * getClass().getTypeName() will give the data type of the variable
		 */
//			System.out.println(nameSurname.getClass().getTypeName());
//			System.out.println(str.getClass().getTypeName());
		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<String> str2 = new ArrayList(Arrays.asList(nameSurname)); // sulotion for delete
		while (str2.contains("")) {
			str2.remove("");
		}
		SplitFullName.nameSurname = Arrays.copyOf(str2.toArray(), str2.size(), String[].class); // to copy the data into
																								// string[] from Object.
		// nameSurname = str2.toArray();
		/*
		 * Iterator it = str.iterator(); while(it.hasNext()) { //pick up the value
		 * String value= (String)it.next(); System.out.println(value); //if it's empty
		 * string if (value.equals("")) { //call remove on the iterator, it will indeed
		 * remove it it.remove(); }else if (value.equals(null)) { it.remove(); } }
		 */

		int count = 0;
		for (String i : str) {
			str.set(count, i.trim());
			if (i.isBlank()) {
				// System.out.println(str.get(count)+" this element is blank ");
			} else if (i.isEmpty()) {
				// System.out.println(str.get(count)+" this element is Empty ");
			}
			count++;
		}

		// System.out.println(str2);

		return str2;

	}

}
