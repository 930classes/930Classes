package scopes;

public class FirstClass {
	
	static int number = 10;

	public static void main(String[] args) {
		System.out.println(printHelloWorld("Default Hello World!!"));
		System.out.println(publicPrintHelloWorld("Public Hello World!!"));
		System.out.println(privatePrintHelloWorld("Private Hello World!!"));
		System.out.println(protectedPrintHelloWorld("Protected Hello World!!"));
		System.out.println(number);

	}
	
	static String printHelloWorld(String s) {
		return s;
	}
	
	public static String publicPrintHelloWorld(String s) {
		return s;
	}
	
	private static String privatePrintHelloWorld(String s) {
		return s;
	}
	
	protected static String protectedPrintHelloWorld(String s) {
		return s;
	}
	
	

}
