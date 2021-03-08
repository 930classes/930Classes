package scopes;

public class SecondClass {

	public static void main(String[] args) {
		FirstClass.printHelloWorld("Hello World!!");
		FirstClass.protectedPrintHelloWorld("Hello World!!");
		FirstClass.publicPrintHelloWorld("Hello World!!");
	}

}
