package com.liquid.unabiz;

public class App {

	public static void main(String[] args) throws Exception {

		String message = args[0];

		UnabizProtect un = new UnabizProtect(message);
		un.toString();

	}

}
