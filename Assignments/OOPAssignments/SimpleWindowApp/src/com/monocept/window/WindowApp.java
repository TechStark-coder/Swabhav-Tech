// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.window;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("unused")
public class WindowApp {
	public static void main(String[] args) {
		JFrame myWindow = new JFrame("Asif's Window");
		myWindow.setSize(400, 250);
		// setting size
		JButton myButton = new JButton("Proceed!");
		myButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showConfirmDialog(myButton, "Proceed Button is pressed");
				System.out.println("Proceed Button is pressed!");
			}
		});
		// this phase adding my stuffs to window!
		myWindow.add(myButton);
		myWindow.setLayout(new FlowLayout());
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.setVisible(true);

		// have to set the window visiblity to true so that when we press it gets
		// closed!

		// lambda method
		myButton.addActionListener((button) -> System.out.println("button is pressed"));

//		myButton b2 = new Button(WindowApp::);
		}
}
