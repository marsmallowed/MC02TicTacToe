package view;

import javax.swing.*;
import java.awt.Color;

public class RestartPanel extends JPanel {
	public RestartPanel() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JButton btnRestart = new JButton("Restart");
		btnRestart.setBackground(Color.DARK_GRAY);
		btnRestart.setForeground(Color.LIGHT_GRAY);
		springLayout.putConstraint(SpringLayout.NORTH, btnRestart, 124, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, btnRestart, 139, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnRestart, 169, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnRestart, -141, SpringLayout.EAST, this);
		add(btnRestart);
		
		JButton btnMainMenu = new JButton("Back to Main Menu");
		btnMainMenu.setBackground(Color.DARK_GRAY);
		btnMainMenu.setForeground(Color.LIGHT_GRAY);
		springLayout.putConstraint(SpringLayout.NORTH, btnMainMenu, 26, SpringLayout.SOUTH, btnRestart);
		springLayout.putConstraint(SpringLayout.WEST, btnMainMenu, 139, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnMainMenu, 71, SpringLayout.SOUTH, btnRestart);
		springLayout.putConstraint(SpringLayout.EAST, btnMainMenu, 0, SpringLayout.EAST, btnRestart);
		add(btnMainMenu);
	}
}
