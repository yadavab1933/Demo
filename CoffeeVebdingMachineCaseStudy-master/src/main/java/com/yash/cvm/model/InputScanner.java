package com.yash.cvm.model;

import java.util.Scanner;

public class InputScanner {
	private final Scanner scanner;

	public InputScanner() {
		this.scanner = new Scanner(System.in);
	}

	public int nextInt() {

		return scanner.nextInt();

	}

}
