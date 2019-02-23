package com.insightfullogic.java8.answers.chapter3;

import java.lang.reflect.Field;

public class Qxtest {
	final int x = 0;
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Qxtest q =new Qxtest();
		System.out.println(q.getx());
		
		Field f = Qxtest.class.getDeclaredField("x");
		f.setAccessible(true);
		f.set(q, 1);
		
		
		
		System.out.println(q.getx());
		System.out.println(f.get(q));
	}
	
	int getx () {
		return x;
	}
}


