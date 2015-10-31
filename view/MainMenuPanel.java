package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainMenuPanel extends JPanel {
	private JLabel lblTic;
	private JLabel lblTac;
	private JLabel lblToe;
	
	private JButton btnNewGame;
	private JButton btnHowToPlay;
	private JButton btnAbout;
	
	private JFrame frame;
	
	public MainMenuPanel(final JFrame frame) {
		this.frame = frame;
		setForeground(Color.GRAY);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		btnNewGame = new JButton("New Game");
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewGame, -263, SpringLayout.SOUTH, this);
		btnNewGame.setForeground(Color.DARK_GRAY);
		btnNewGame.setBackground(Color.LIGHT_GRAY);
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newGame();
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, btnNewGame, 169, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnNewGame, -177, SpringLayout.EAST, this);
		add(btnNewGame);
		
		btnHowToPlay = new JButton("How to Play");
		btnHowToPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				howToPlay();
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnHowToPlay, 6, SpringLayout.SOUTH, btnNewGame);
		springLayout.putConstraint(SpringLayout.WEST, btnHowToPlay, 0, SpringLayout.WEST, btnNewGame);
		springLayout.putConstraint(SpringLayout.SOUTH, btnHowToPlay, -219, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnHowToPlay, -177, SpringLayout.EAST, this);
		btnHowToPlay.setForeground(Color.DARK_GRAY);
		btnHowToPlay.setBackground(Color.LIGHT_GRAY);
		add(btnHowToPlay);
		
		btnAbout = new JButton("About");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				about();
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnAbout, 4, SpringLayout.SOUTH, btnHowToPlay);
		springLayout.putConstraint(SpringLayout.WEST, btnAbout, 0, SpringLayout.WEST, btnNewGame);
		springLayout.putConstraint(SpringLayout.SOUTH, btnAbout, -177, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnAbout, -177, SpringLayout.EAST, this);
		btnAbout.setBackground(Color.LIGHT_GRAY);
		btnAbout.setForeground(Color.DARK_GRAY);
		add(btnAbout);
		
		lblTic = new JLabel("Tic");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewGame, 6, SpringLayout.SOUTH, lblTic);
		springLayout.putConstraint(SpringLayout.SOUTH, lblTic, -307, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, lblTic, 110, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblTic, 169, SpringLayout.WEST, this);
		lblTic.setFont(new Font("Lobster 1.3", Font.ITALIC, 28));
		lblTic.setForeground(Color.RED);
		add(lblTic);
		
		lblTac = new JLabel("Tac");
		springLayout.putConstraint(SpringLayout.NORTH, lblTac, 111, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblTac, 214, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblTac, -8, SpringLayout.NORTH, btnNewGame);
		springLayout.putConstraint(SpringLayout.EAST, lblTic, -6, SpringLayout.WEST, lblTac);
		springLayout.putConstraint(SpringLayout.EAST, lblTac, -222, SpringLayout.EAST, this);
		lblTac.setFont(new Font("Lobster 1.3", Font.ITALIC, 28));
		lblTac.setForeground(Color.BLACK);
		add(lblTac);
		
		lblToe = new JLabel("Toe");
		springLayout.putConstraint(SpringLayout.NORTH, lblToe, 111, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblToe, 6, SpringLayout.EAST, lblTac);
		springLayout.putConstraint(SpringLayout.SOUTH, lblToe, -8, SpringLayout.NORTH, btnNewGame);
		springLayout.putConstraint(SpringLayout.EAST, lblToe, -177, SpringLayout.EAST, this);
		lblToe.setFont(new Font("Lobster 1.3", Font.ITALIC, 28));
		lblToe.setForeground(Color.RED);
		add(lblToe);
	}
	
	private void newGame() {
		// remove main menu
		frame.getContentPane().remove(this);
		
		// game grid
		frame.getContentPane().add(new GamePanel(frame), BorderLayout.CENTER);
		
		frame.repaint();
		frame.revalidate();
	}
	
	private void howToPlay() {
		// remove main menu
		frame.getContentPane().remove(this);
		
		// how to play
		frame.getContentPane().add(new HowToPlayPanel(frame), BorderLayout.CENTER);
		
		frame.repaint();
		frame.revalidate();
	}
	
	private void about() {
		// remove main menu
		frame.getContentPane().remove(this);
		
		// about
		frame.getContentPane().add(new AboutPanel(frame), BorderLayout.CENTER);
		
		frame.repaint();
		frame.revalidate();
	}

}
