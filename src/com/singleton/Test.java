package com.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		// By Reflection
		Constructor c = Singleton.class.getDeclaredConstructor();
		c.setAccessible(true);
		Singleton singObj = (Singleton) c.newInstance();
		System.out.println("Reflection Obj" + singObj.hashCode());

		Singleton obj = Singleton.getInstance();
		Singleton obj1 = Singleton.getInstance();

		System.out.println("OBJ 1" + obj.hashCode());
		System.out.println("OBJ 2" + obj1.hashCode());

	}

}
