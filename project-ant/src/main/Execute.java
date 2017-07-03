package main;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Execute {

	public static void main(String[] args) {
	    JFrame frame = new JFrame("JOptionPane showMessageDialog example");

		JOptionPane pane = new JOptionPane();
		pane.showMessageDialog(frame, "Teste");
	}

}
