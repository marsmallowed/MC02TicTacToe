package view;

import javax.swing.*;
import javax.swing.UIManager.*;

import model.Game;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class GamePanel extends JPanel{
	private JPanel menuBar;
	private JLabel playerIndicator;
	private JLabel currPlayer;
	
	private GameGrid grid;
	private Game gamePlay;
	
	public GamePanel() {
		setLayout(new BorderLayout(0, 0));
		
		/** Menu Bar */
		menuBar = new JPanel();
		menuBar.setLayout(new FlowLayout());
		
		playerIndicator = new JLabel("Player:");
		currPlayer = new JLabel();
		menuBar.add(playerIndicator);
		menuBar.add(currPlayer);
		
		this.add(menuBar, BorderLayout.NORTH);
		
		gamePlay = new Game("x", "o");
		grid = new GameGrid(this, gamePlay);
		this.add(grid);
		
		currPlayer.setText(gamePlay.getCurrPlayer());
	}
	
	public void play() {
		currPlayer.setText(gamePlay.getCurrPlayer());
		menuBar.repaint();
		menuBar.revalidate();
		
		// when game over with no winner
//		if (gamePlay.isGameOver() && gamePlay.getWinner() == "") {
//			JOptionPane.showMessageDialog(new JFrame(), "GAME OVER! No winner. :(");
//		} else if (gamePlay.isGameOver()) {
//			JOptionPane.showMessageDialog(new JFrame(), "Player " + gamePlay.getWinner() + " wins!");
//		}
	}
	
	public void checkGame() {
		// when game over with no winner
		System.out.println("Checking for winner...");
		if (gamePlay.isGameOver() && gamePlay.getWinner() == "") {
			JOptionPane.showMessageDialog(new JFrame(), "GAME OVER! No winner. :(");
		} else if (gamePlay.isGameOver()) {
			JOptionPane.showMessageDialog(new JFrame(), "Player " + gamePlay.getWinner() + " wins!");
		}
	}
}
