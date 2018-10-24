package com.prototype;

import java.util.HashMap;


public class PrototypeFactory {

	public static HashMap<String, PrototypeCapable> prototypeObjects = new HashMap<>();

	public static class ModelType {

		public static final String ALBUM_TYPE = "album";

	}

	static {

		prototypeObjects.put(ModelType.ALBUM_TYPE, new Album());
	}

	public static PrototypeCapable getProtoypeInstance(String type) throws CloneNotSupportedException {

		PrototypeCapable o = ((PrototypeCapable) prototypeObjects.get(type)).clone();

		return o;

	}

}
