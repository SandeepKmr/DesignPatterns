package com.prototype;

import com.prototype.PrototypeFactory.ModelType;

public class TestPrototype {

	public static void main(String args[]) throws CloneNotSupportedException {
		Album obj = (Album) PrototypeFactory.getProtoypeInstance(ModelType.ALBUM_TYPE);
		System.out.println(obj.hashCode());

		Album obj1 = (Album) PrototypeFactory.getProtoypeInstance(ModelType.ALBUM_TYPE);
		System.out.println(obj1.hashCode());

		Album obj2 = (Album) PrototypeFactory.getProtoypeInstance(ModelType.ALBUM_TYPE);
		System.out.println(obj2.hashCode());
	}

}
