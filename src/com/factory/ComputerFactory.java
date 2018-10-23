package com.factory;

public class ComputerFactory {

	public static Computer getComputer(String type) {

		Computer obj = null;
		switch (type) {

		case "server":
			obj = new Server();
			break;

		case "laptop":
			obj = new Laptop();
			break;

		case "desktop":
			obj = new Desktop();
			break;

		default:
			throw new RuntimeException("invalid Option !!");
		}
		return obj;

	}
}
