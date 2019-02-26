package com.insightfullogic.java8.exercises.chapter5;

import java.util.stream.Stream;

public class C5Test {
	public static void main(String[] args) {
		Stream<String> names = Stream.of("xing kai","lu zuo jin","bai jun jun");
		String name = getLongestName(names);
	}

	private static String getLongestName(Stream<String> names) {
		names.forEach(null);
		
		return null;
	}
}
