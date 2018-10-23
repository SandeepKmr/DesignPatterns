package com.factory;

import java.util.Scanner;

public class FactoryClient {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		Computer obj = ComputerFactory.getComputer(input);
		obj.createComputer();
	}

}
