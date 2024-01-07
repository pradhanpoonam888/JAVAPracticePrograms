package practice;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;


/**
 * @author Poonam
 *
 */
public class variables {
	 public static int i ,j;
	public static String s;
	public char x;
	 float f;
	double d;
	

	public static void main( String [] args ) {
		int test=0;
		
		System.out.println(" GetFields will give the list of public class variables ");
		 
		Field[] fields = variables.class.getFields();
		System.out.println(fields.length);
		System.out.println(Arrays.toString(fields));
		System.out.println("\n "+" " +"\n");
		
		System.out.println(" GetFields will give the list of all class variables ");
		
		Field[] fields2 =variables.class.getDeclaredFields();
		System.out.println(fields2.length);
		System.out.println(Arrays.toString(fields2));
		System.out.println("\n "+" " +"\n");
		
		System.out.println(" GetFields will give the list of methods ");
		
		Method[] methods =variables.class.getDeclaredMethods();
		System.out.println(methods.length);
		System.out.println(Arrays.toString(methods));
		 
	}

	public static void getVars() {
		
	}
	/*
	 * public static void getAllVariables(VariableDeclarator n, Void arg){
	 * 
	 * System.out.println("VariableDeclarator: " + (extended ? n :
	 * n.getNameAsString() + " of type " + n.getType() + " init " +
	 * n.getInitializer().orElse(null))); super.visit(n, arg);
	 * 
	 * }
	 */
}
