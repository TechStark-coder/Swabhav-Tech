// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.basic;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ThreeButtons implements ActionListener {
	public static void main(String[] args) {
		JFrame f = new JFrame("Button Example");
		JButton a = new JButton("Hello");
		a.setLayout(new FlowLayout(FlowLayout.CENTER));
		JButton b = new JButton("print");
//		JButton c = new JButton("printasync");
		
		a.addActionListener(null);
//		add(a, BorderLayout.NORTH);
		a.setBounds(50, 100, 95, 30);
		f.add(a); 
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);

		b.setBounds(70, 90, 65, 20);
		f.add(b);
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
//
//		c.setBounds(50, 100, 95, 30);
//		f.add(c);
//		f.setSize(500, 500);
//		f.setLayout(null);
//		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("hello!!!");
		// TODO Auto-generated method stub
		
	}
}