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
	private MainMenuPanel mainMenu;
	private GamePanel actualGame;
	
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setSize(480, 485);
		
		mainMenu = new MainMenuPanel(this);
		add(mainMenu);
		
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
		
		repaint();
		revalidate();
	}
}
