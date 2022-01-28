// Copyright to user asif 2021 
//all rights reserved */
package com.monocept.test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.monocept.tiktakjframe.Board;
import com.monocept.tiktakjframe.Game;
import com.monocept.tiktakjframe.Mark;
import com.monocept.tiktakjframe.Player;
import com.monocept.tiktakjframe.ResultAnalyser;

@SuppressWarnings("serial")
public class TikTakFrameTest extends JFrame implements ActionListener {
	JPanel buttonPanel = new JPanel();
	JPanel textPanel = new JPanel();
	JLabel textField = new JLabel();
	JButton[] button = new JButton[9];

	Board board = new Board();
	ResultAnalyser resultAnalyser = new ResultAnalyser(board);
	Player[] players = new Player[2];

	Game game = new Game(board, resultAnalyser, players);

	public TikTakFrameTest() {

		Player player1 = new Player("Player 1", Mark.O);
		Player player2 = new Player("Player 2", Mark.X);

		players[0] = player1;
		players[1] = player2;
		this.setSize(300, 400);
		this.setTitle("Tic Tac");
		this.setLayout(new BorderLayout());
		this.setVisible(true);

		textPanel.setLayout(new BorderLayout());
		textPanel.setBounds(0, 0, 800, 100);

		textField.setFont(new Font("Blogger_Sans_Bold", Font.PLAIN, 45));
		textField.setHorizontalAlignment(JLabel.CENTER);
		textField.setText("Tic Tac Game");

		buttonPanel.setLayout(new GridLayout(3, 3));
		buttonPanel.setBackground(new Color(150, 150, 150));

		for (int i = 0; i < 9; i++) {
			button[i] = new JButton(String.valueOf(i + 1));
			buttonPanel.add(button[i]);
			button[i].setFont(new Font("MEME font", Font.BOLD, 40));
			button[i].setFocusable(false);
			button[i].addActionListener(this);
		}

		textPanel.add(textField);
		this.add(textPanel, BorderLayout.NORTH);
		this.add(buttonPanel);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton obj = (JButton) e.getSource();
		System.out.println(obj.getText());
		if (game.currentPlayer().equals(players[0])) {
			obj.setText(players[0].getMarkType().toString());
		} else {
			obj.setText(players[1].getMarkType().toString());
		}
	}

}