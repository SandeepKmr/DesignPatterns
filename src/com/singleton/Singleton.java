package com.singleton;

public class Singleton implements Cloneable {

	private static Singleton singletonObject = null;

	private Singleton() {

		// Reflection
		if (singletonObject != null) {
			throw new RuntimeException("Not Allowed !!");
		}

	}

	public static Singleton getInstance() {

		// Double check locking for protecting it from multithreds and half
		// baked objects .

		if (singletonObject == null) {
			synchronized (Singleton.class) {

				if (singletonObject == null) {

					singletonObject = new Singleton();

				}
			}
		}

		return singletonObject;

	}

	// For Serialization

	protected Object readResolve() {
		return getInstance();
	}

	// for cloning

	@Override
	public Singleton clone() throws CloneNotSupportedException {
		return singletonObject;

	}

}
