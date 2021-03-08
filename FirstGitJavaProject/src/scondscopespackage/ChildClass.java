package scondscopespackage;

import scopes.FirstClass;

public class ChildClass extends FirstClass{

	public static void main(String[] args) {
		FirstClass.protectedPrintHelloWorld("Hello World!!");
		FirstClass.publicPrintHelloWorld("Hello World!!");

	}

}
