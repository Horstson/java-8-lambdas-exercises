package com.insightfullogic.java8.examples.chapter3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Functional {

    private JButton button = new JButton();

    // BEGIN field_assignment
    private ActionEvent lastEvent;

    private void registerHandler() {
        button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
    }
    // END field_assignment


}
