package _00_IntroToStacks;

import java.util.Random;
import java.util.Stack;
import java.util.stream.DoubleStream;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		// 1. Create a Stack of Doubles
		Stack<Double> duuble = new Stack<Double>();
		// Don't forget to import the Stack class

		// 2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		Random rand = new Random();
		
		for (int i = 0; i < 100; i++) {
			duuble.push(rand.nextDouble()*100);
		}

		// 3. Ask the user to enter in two numbers between 0 and 100, inclusive.
		String result = JOptionPane.showInputDialog("Enter in a number between 0 and 100");
		String result2 = JOptionPane.showInputDialog("Enter in another number between 0 and 100");
		int innt = Integer.parseInt(result);
		int innt2 = Integer.parseInt(result2);
		// 4. Pop all the elements off of the Stack. Every time a double is popped that
		// is
		// between the two numbers entered by the user, print it to the screen.
		double n;
		while (!duuble.isEmpty()) {
			n = duuble.pop();
			if (innt > innt2) {
				if (n < innt && n > innt2) {
					System.out.println(n);
				}
			}
			else if (innt2 > innt) {
				if (n < innt2 && n > innt) {
					System.out.println(n);
				}
			}
		}
	
		// EXAMPLE:
		// NUM 1: 65
		// NUM 2: 75

		// Popping elements off stack...
		// Elements between 65 and 75:
		// 66.66876846
		// 74.51651681
		// 70.05110654
		// 69.21350456
		// 71.54506465
		// 66.47984807
		// 74.12121224
	}
}

