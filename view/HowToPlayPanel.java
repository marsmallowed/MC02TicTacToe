package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HowToPlayPanel extends JPanel {
	private JButton btnBack;
	private JFrame frame;
	
	public HowToPlayPanel(final JFrame frame) {
		this.frame = frame;
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JTextArea txtPlay = new JTextArea();
		springLayout.putConstraint(SpringLayout.SOUTH, txtPlay, 335, SpringLayout.NORTH, this);
		txtPlay.setTabSize(5);
		txtPlay.setWrapStyleWord(true);
		txtPlay.setLineWrap(true);
		txtPlay.setEditable(false);
		springLayout.putConstraint(SpringLayout.NORTH, txtPlay, 41, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, txtPlay, 58, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, txtPlay, 416, SpringLayout.WEST, this);
		txtPlay.setText("X always goes first.\n");
		txtPlay.append("\nPlayers alternate placing Xs and Os on the board until either: ");
		txtPlay.append("\n\t(a) one player has three in a row, horizontally, ");
		txtPlay.append("\n\t    vertically or diagonally; or \n\t(b) all nine squares are filled.\n");
		txtPlay.append("\nIf a player is able to draw three Xs or three Os in a row, that player wins.\n");
		txtPlay.append("\nIf all nine squares are filled and neither player has three in a row, the game is a draw.\n");
		txtPlay.append("\n\n\n Source: http://boardgames.about.com/od/paperpencil/a/tic_tac_toe.htm");
		add(txtPlay);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				back();
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnBack, 41, SpringLayout.SOUTH, txtPlay);
		springLayout.putConstraint(SpringLayout.WEST, btnBack, 195, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnBack, 75, SpringLayout.SOUTH, txtPlay);
		springLayout.putConstraint(SpringLayout.EAST, btnBack, 266, SpringLayout.WEST, this);
		add(btnBack);
	}
	
	private void back() {
		// remove main menu
		frame.getContentPane().remove(this);
		
		// game grid
		frame.getContentPane().add(new MainMenuPanel(frame), BorderLayout.CENTER);
		
		frame.repaint();
		frame.revalidate();
	}

}
