package _00_IntroToStacks;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo {
	public static void main(String[] args) {
		/*
		 * Create a JFrame with a JPanel and a JLabel.
		 */
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		panel.add(label);
		frame.add(panel);
		/*
		 * Every time a key is pressed, add that character to the JLabel. It should look
		 * like a basic text editor.
		 */
		//frame.addActionListener(e -> {
		//	System.out.println("");
		//});
		/*
		 * Make it so that every time the BACKSPACE key is pressed, the last character
		 * is erased from the JLabel.
		 */

		/*
		 * Save that deleted character onto a Stack of Characters.
		 */

		/*
		 * Choose a key to be the Undo key. Make it so that when that key is pressed,
		 * the top Character is popped off the Stack and added back to the JLabel.
		 */

	}
}
