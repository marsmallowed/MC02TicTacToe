package view;

import javax.swing.*;
import javax.swing.UIManager.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JPanel {
	public MainMenu() {
		setForeground(Color.GRAY);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.setForeground(Color.DARK_GRAY);
		btnNewGame.setBackground(Color.LIGHT_GRAY);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewGame, 88, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, btnNewGame, 160, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewGame, -239, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnNewGame, -178, SpringLayout.EAST, this);
		add(btnNewGame);
		
		JButton btnHowToPlay = new JButton("How to Play");
		btnHowToPlay.setForeground(Color.DARK_GRAY);
		btnHowToPlay.setBackground(Color.LIGHT_GRAY);
		springLayout.putConstraint(SpringLayout.NORTH, btnHowToPlay, 19, SpringLayout.SOUTH, btnNewGame);
		springLayout.putConstraint(SpringLayout.WEST, btnHowToPlay, 0, SpringLayout.WEST, btnNewGame);
		springLayout.putConstraint(SpringLayout.SOUTH, btnHowToPlay, -177, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnHowToPlay, -178, SpringLayout.EAST, this);
		add(btnHowToPlay);
		
		JButton btnAbout = new JButton("About");
		springLayout.putConstraint(SpringLayout.NORTH, btnAbout, 16, SpringLayout.SOUTH, btnHowToPlay);
		springLayout.putConstraint(SpringLayout.WEST, btnAbout, 0, SpringLayout.WEST, btnNewGame);
		springLayout.putConstraint(SpringLayout.SOUTH, btnAbout, -118, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnAbout, -178, SpringLayout.EAST, this);
		btnAbout.setForeground(Color.DARK_GRAY);
		btnAbout.setBackground(Color.LIGHT_GRAY);
		add(btnAbout);
		
		/** ACTION LISTENERS */
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GamePanel gamePanel = new GamePanel();
				gamePanel.setVisible(true);
			}	
		});
	}
}
