package view;

import javax.swing.*;
import javax.swing.UIManager.*;
import java.awt.GridLayout;

public class GameGrid extends JPanel {
	public GameGrid() {
		setLayout(new GridLayout(3, 3, 0, 0));
		
		JButton btn00 = new JButton("");
		add(btn00);
		
		JButton btn01 = new JButton("");
		add(btn01);
		
		JButton btn02 = new JButton("");
		add(btn02);
		
		JButton btn10 = new JButton("");
		add(btn10);
		
		JButton btn11 = new JButton("");
		add(btn11);
		
		JButton btn12 = new JButton("");
		add(btn12);
		
		JButton btn20 = new JButton("");
		add(btn20);
		
		JButton btn21 = new JButton("");
		add(btn21);
		
		JButton btn22 = new JButton("");
		add(btn22);
	}

}
