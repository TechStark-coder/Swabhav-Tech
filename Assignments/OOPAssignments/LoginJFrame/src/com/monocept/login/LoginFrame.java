// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.login;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings({ "unused", "serial" })
public class LoginFrame extends JFrame implements ActionListener {

	//getting requirments a button,panel,text box field!
	JButton but;
	JPanel butPanel;
	JLabel nameLabel, passwordLabel;
	final JTextField textField1, textField2;

	//constructor using
	public LoginFrame() {
		nameLabel = new JLabel();
		nameLabel.setText("Name");
		textField1 = new JTextField(10);
		passwordLabel = new JLabel();
		passwordLabel.setText("Password");
		textField2 = new JPasswordField(10);

		but = new JButton("proceed");

		//adding content too panel!
		butPanel = new JPanel(new GridLayout(3, 1));
		butPanel.add(nameLabel);
		butPanel.add(textField1);
		butPanel.add(passwordLabel);
		butPanel.add(textField2);
		butPanel.add(but);
		add(butPanel, BorderLayout.CENTER);
		but.addActionListener(this);
		setTitle("Login Form");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String nameLabel = textField1.getText();
		String passwordLabel = textField2.getText();
		if (nameLabel.equals("abc") && passwordLabel.equals("jframe")) {
			WelcomeFrame win = new WelcomeFrame();
			win.setVisible(true);
			JLabel welcome = new JLabel("welcome " + nameLabel);
			win.getContentPane().add(welcome);
		} else {
			System.out.println("invalid name and password");
		}
	}

}
