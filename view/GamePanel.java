package view;

import javax.swing.*;
import javax.swing.UIManager.*;

import model.Game;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GamePanel extends JPanel{
	private JPanel menuBar;
	private JLabel playerIndicator;
	private JLabel currPlayer;
	private JButton btnRestart;
	private JButton btnBack;
	
	private GameGrid grid;
	private Game gamePlay;
	
	private JFrame frame;
	
	public GamePanel(final JFrame frame) {
		this.frame = frame; 
		setLayout(new BorderLayout(0, 0));
		
		/** Menu Bar */
		menuBar = new JPanel();
		FlowLayout fl_menuBar = new FlowLayout();
		fl_menuBar.setHgap(10);
		menuBar.setLayout(fl_menuBar);
		
		playerIndicator = new JLabel("Player:");
		currPlayer = new JLabel();
		
		btnRestart = new JButton("Restart");
		btnRestart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newGame();
			}
		});
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				back();
			}
		});
		
		menuBar.add(playerIndicator);
		menuBar.add(currPlayer);
		menuBar.add(btnRestart);
		menuBar.add(btnBack);
		
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
	}
	
	public void checkGame() {
		// when game over with no winner
		System.out.println("Checking for winner...");
		if (gamePlay.isGameOver()) {
			if (gamePlay.getWinner() == "")
				JOptionPane.showMessageDialog(new JFrame(), "GAME OVER! No winner. :(");
			else 
				JOptionPane.showMessageDialog(new JFrame(), "Player " + gamePlay.getWinner() + " wins!");
			
			back();
		}
	}
	
	private void newGame() {
		frame.remove(this);
		frame.getContentPane().add(new GamePanel(frame));
		
		frame.repaint();
		frame.revalidate();
	}
	
	private void back() {
		frame.remove(this);
		frame.getContentPane().add(new MainMenuPanel(frame));
		
		frame.repaint();
		frame.revalidate();
	}
}
