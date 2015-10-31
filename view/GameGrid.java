package view;

import javax.swing.*;
import model.Game;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameGrid extends JPanel {
	private JButton btn00;
	private JButton btn01;
	private JButton btn02;
	private JButton btn10;
	private JButton btn11;
	private JButton btn12;
	private JButton btn20;
	private JButton btn21;
	private JButton btn22;
	
	public GameGrid(final GamePanel panel, final Game gamePlay) {
		
		setLayout(new GridLayout(3, 3, 0, 0));
		
		btn00 = new JButton("");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn00.setText(gamePlay.getCurrPlayer());
				System.out.println("Setting move for " + gamePlay.getCurrPlayer() + " at index 0");
				gamePlay.setMove(gamePlay.getCurrPlayer(), 0);
				panel.play();
				btn00.setEnabled(false);
				panel.checkGame();
			}
		});
		add(btn00);
		
		btn01 = new JButton("");
		btn01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn01.setText(gamePlay.getCurrPlayer());
				System.out.println("Setting move for " + gamePlay.getCurrPlayer() + " at index 1");
				gamePlay.setMove(gamePlay.getCurrPlayer(), 1);
				panel.play();
				btn01.setEnabled(false);
				panel.checkGame();
			}
		});
		add(btn01);
		
		btn02 = new JButton("");
		btn02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn02.setText(gamePlay.getCurrPlayer());
				System.out.println("Setting move for " + gamePlay.getCurrPlayer() + " at index 2");
				gamePlay.setMove(gamePlay.getCurrPlayer(), 2);
				panel.play();
				btn02.setEnabled(false);
				panel.checkGame();
			}
		});
		add(btn02);
		
		btn10 = new JButton("");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn10.setText(gamePlay.getCurrPlayer());
				System.out.println("Setting move for " + gamePlay.getCurrPlayer() + " at index 3");
				gamePlay.setMove(gamePlay.getCurrPlayer(), 3);
				panel.play();
				btn10.setEnabled(false);
				panel.checkGame();
			}
		});
		add(btn10);
		
		btn11 = new JButton("");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn11.setText(gamePlay.getCurrPlayer());
				System.out.println("Setting move for " + gamePlay.getCurrPlayer() + " at index 4");
				gamePlay.setMove(gamePlay.getCurrPlayer(), 4);
				panel.play();
				btn11.setEnabled(false);
				panel.checkGame();
			}
		});
		add(btn11);
		
		btn12 = new JButton("");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn12.setText(gamePlay.getCurrPlayer());
				System.out.println("Setting move for " + gamePlay.getCurrPlayer() + " at index 5");
				gamePlay.setMove(gamePlay.getCurrPlayer(), 5);
				panel.play();
				btn12.setEnabled(false);
				panel.checkGame();
			}
		});
		add(btn12);
		
		btn20 = new JButton("");
		btn20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn20.setText(gamePlay.getCurrPlayer());
				System.out.println("Setting move for " + gamePlay.getCurrPlayer() + " at index 6");
				gamePlay.setMove(gamePlay.getCurrPlayer(), 6);
				panel.play();
				btn20.setEnabled(false);
				panel.checkGame();
			}
		});
		add(btn20);
		
		btn21 = new JButton("");
		btn21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn21.setText(gamePlay.getCurrPlayer());
				System.out.println("Setting move for " + gamePlay.getCurrPlayer() + " at index 7");
				gamePlay.setMove(gamePlay.getCurrPlayer(), 7);
				panel.play();
				btn21.setEnabled(false);
				panel.checkGame();
			}
		});
		add(btn21);
		
		btn22 = new JButton("");
		btn22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn22.setText(gamePlay.getCurrPlayer());
				System.out.println("Setting move for " + gamePlay.getCurrPlayer() + " at index 8");
				gamePlay.setMove(gamePlay.getCurrPlayer(), 8);
				panel.play();
				btn22.setEnabled(false);
				panel.checkGame();
			}
		});
		add(btn22);
	}

}
