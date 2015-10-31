package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Event;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.UIManager.*;

import java.awt.Font;

public class MainFrame extends JFrame {
	private JLabel lblTic;
	private JLabel lblTac;
	private JLabel lblToe;
	
	private JPanel mainMenu;
	private JButton btnNewGame;
	private JButton btnHowToPlay;
	private JButton btnAbout;
	
	private GamePanel actualGame;
	
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setSize(480, 485);
		mainMenu = new JPanel();
		getContentPane().add(mainMenu);
		
		mainMenu.setForeground(Color.GRAY);
		SpringLayout springLayout = new SpringLayout();
		mainMenu.setLayout(springLayout);
		
		btnNewGame = new JButton("New Game");
		springLayout.putConstraint(SpringLayout.WEST, btnNewGame, 152, SpringLayout.WEST, mainMenu);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewGame, -258, SpringLayout.SOUTH, mainMenu);
		springLayout.putConstraint(SpringLayout.EAST, btnNewGame, -182, SpringLayout.EAST, mainMenu);
		btnNewGame.setForeground(Color.DARK_GRAY);
		btnNewGame.setBackground(Color.LIGHT_GRAY);
		mainMenu.add(btnNewGame);
		
		btnHowToPlay = new JButton("How to Play");
		springLayout.putConstraint(SpringLayout.NORTH, btnHowToPlay, 15, SpringLayout.SOUTH, btnNewGame);
		springLayout.putConstraint(SpringLayout.WEST, btnHowToPlay, 0, SpringLayout.WEST, btnNewGame);
		springLayout.putConstraint(SpringLayout.SOUTH, btnHowToPlay, -206, SpringLayout.SOUTH, mainMenu);
		springLayout.putConstraint(SpringLayout.EAST, btnHowToPlay, -182, SpringLayout.EAST, mainMenu);
		btnHowToPlay.setForeground(Color.DARK_GRAY);
		btnHowToPlay.setBackground(Color.LIGHT_GRAY);
		mainMenu.add(btnHowToPlay);
		
		btnAbout = new JButton("About");
		springLayout.putConstraint(SpringLayout.NORTH, btnAbout, 11, SpringLayout.SOUTH, btnHowToPlay);
		springLayout.putConstraint(SpringLayout.WEST, btnAbout, 0, SpringLayout.WEST, btnNewGame);
		springLayout.putConstraint(SpringLayout.SOUTH, btnAbout, -158, SpringLayout.SOUTH, mainMenu);
		springLayout.putConstraint(SpringLayout.EAST, btnAbout, -182, SpringLayout.EAST, mainMenu);
		btnAbout.setBackground(Color.LIGHT_GRAY);
		btnAbout.setForeground(Color.DARK_GRAY);
		mainMenu.add(btnAbout);
		
		lblTic = new JLabel("Tic");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewGame, 6, SpringLayout.SOUTH, lblTic);
		springLayout.putConstraint(SpringLayout.NORTH, lblTic, 70, SpringLayout.NORTH, mainMenu);
		springLayout.putConstraint(SpringLayout.SOUTH, lblTic, -301, SpringLayout.SOUTH, mainMenu);
		springLayout.putConstraint(SpringLayout.WEST, lblTic, 152, SpringLayout.WEST, mainMenu);
		springLayout.putConstraint(SpringLayout.EAST, lblTic, -281, SpringLayout.EAST, mainMenu);
		lblTic.setForeground(Color.RED);
		lblTic.setFont(new Font("Lobster 1.3", Font.ITALIC, 28));
		mainMenu.add(lblTic);
		
		lblTac = new JLabel("Tac");
		springLayout.putConstraint(SpringLayout.NORTH, lblTac, 70, SpringLayout.NORTH, mainMenu);
		springLayout.putConstraint(SpringLayout.WEST, lblTac, 6, SpringLayout.EAST, lblTic);
		springLayout.putConstraint(SpringLayout.SOUTH, lblTac, -6, SpringLayout.NORTH, btnNewGame);
		lblTac.setFont(new Font("Lobster 1.3", Font.ITALIC, 28));
		lblTac.setForeground(Color.BLACK);
		mainMenu.add(lblTac);
		
		lblToe = new JLabel("Toe");
		springLayout.putConstraint(SpringLayout.EAST, lblTac, -6, SpringLayout.WEST, lblToe);
		springLayout.putConstraint(SpringLayout.SOUTH, lblToe, -301, SpringLayout.SOUTH, mainMenu);
		springLayout.putConstraint(SpringLayout.WEST, lblToe, 252, SpringLayout.WEST, mainMenu);
		springLayout.putConstraint(SpringLayout.EAST, lblToe, -175, SpringLayout.EAST, mainMenu);
		springLayout.putConstraint(SpringLayout.NORTH, lblToe, 70, SpringLayout.NORTH, mainMenu);
		lblToe.setFont(new Font("Lobster 1.3", Font.ITALIC, 28));
		lblToe.setForeground(Color.RED);
		mainMenu.add(lblToe);
		
		/** ACTION LISTENERS */
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// remove main menu
				getContentPane().remove(mainMenu);
				
				// game grid
				actualGame = new GamePanel();
				getContentPane().add(actualGame, BorderLayout.CENTER);
				
				repaint();
				revalidate();
			}
		});
		
		/** NIMBUS LOOK AND FEEL SHITS */
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    // If Nimbus is not available, you can set the GUI to another look and feel.
		}
	}
}
