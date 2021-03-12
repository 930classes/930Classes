package mystaticpackage;

public class MyClass {
	static {
		System.out.println("In static block Main Class");
	}

	public static void main(String[] args) {
		MyStaticClass.printHello();

	}

}
