package mystaticpackage;

public class MyStaticClass {
	
	private static String staticInstanceVariable = "Static Variable";
	private String instanceVariable = "Normal Variable";
	
	static {
		System.out.println(staticInstanceVariable);
		System.out.println("In Static block");
	}

	
	public static void printHello() {
		System.out.println("In Static Method");
	}
	
	public  void printHelloNormal() {
		System.out.println("In Static Method");
	}

}
