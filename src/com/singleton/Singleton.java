package com.singleton;

import java.lang.reflect.ReflectPermission;
import java.security.Permission;

public class Singleton {

	private static Singleton singletonObject = null;

	private Singleton() {

		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkPermission(Permission perm) {
				if (perm.getClass() == ReflectPermission.class && "suppressAccessChecks".equals(perm.getName())) {
					throw new SecurityException("can't supress AccessChecks");
				}
			}
		});
		/*if (singletonObject != null) {
			throw new RuntimeException("Not Allowed !!");
		}*/

	}

	public static Singleton getInstance() {

		if (singletonObject == null) {
			synchronized (Singleton.class) {

				if (singletonObject == null) {

					singletonObject = new Singleton();

				}
			}
		}

		return singletonObject;

	}

}
