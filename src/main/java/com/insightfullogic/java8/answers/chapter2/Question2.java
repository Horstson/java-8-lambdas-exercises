package com.insightfullogic.java8.answers.chapter2;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;import java.util.function.Supplier;

import javax.swing.JButton;
import javax.swing.text.DateFormatter;

public class Question2 {

     public final static ThreadLocal<DateFormatter> formatter = ThreadLocal.withInitial(() -> new DateFormatter(new SimpleDateFormat("dd-MMM-yyyy")));
     
     BinaryOperator<Integer> a = (t, u) -> t * u;
     
     Runnable r = () -> System.out.println();
     public static void main(String[] args) {
		JButton b = new JButton("aa");
		b.addActionListener(e -> e.getActionCommand());
		ThreadLocal<DateFormatter> tt = ThreadLocal.withInitial(new 	Supplier<DateFormatter>() {

			@Override
			public DateFormatter get() {
				return null;
			}
		});
		tt.set(new DateFormatter(new SimpleDateFormat("")));
	}
     
     
     
}
