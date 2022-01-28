// Copyright to user asif 2021 
//all rights reserved */
package com.test;

import javax.swing.JOptionPane;

import com.monocept.login.LoginFrame;

public class LoginTest {
	public static void main(String[] args) {
		try {
			LoginFrame form = new LoginFrame();
			form.setSize(400, 300); // size of the frame
			form.setVisible(true); // adding visibility
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}