package view;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AboutPanel extends JPanel {
	private JButton btnBack;
	private JFrame frame;
	
	public AboutPanel(final JFrame frame) {
		this.frame = frame;
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JTextArea txtAbout = new JTextArea();
		springLayout.putConstraint(SpringLayout.SOUTH, txtAbout, 335, SpringLayout.NORTH, this);
		txtAbout.setTabSize(5);
		txtAbout.setWrapStyleWord(true);
		txtAbout.setLineWrap(true);
		txtAbout.setEditable(false);
		springLayout.putConstraint(SpringLayout.NORTH, txtAbout, 41, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, txtAbout, 58, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, txtAbout, 416, SpringLayout.WEST, this);
		txtAbout.setText("An INTESYS MC02 Project\n\n");
		txtAbout.append("Submitted to:\n");
		txtAbout.append("Sir Rafael A. Cabredo\n\n");
		txtAbout.append("Submitted by:\n");
		txtAbout.append("Johanna Jherine A. Aspra\n");
		txtAbout.append("Anne Marielle U. Bagamaspad\n");
		add(txtAbout);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				back();
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnBack, 41, SpringLayout.SOUTH, txtAbout);
		springLayout.putConstraint(SpringLayout.WEST, btnBack, 195, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnBack, 75, SpringLayout.SOUTH, txtAbout);
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
