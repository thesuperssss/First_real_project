package first.view;

import javax.swing.JOptionPane;

public class FirstGUI
{

	public FirstGUI()
	{
		// Initializes the data member for the class
	}

	private void meetTheGUIThingy()
	{
		String answer;
		answer = "Oddish";
		String yesNo;
		JOptionPane.showMessageDialog(null, "Let's meet our new pokemon");
		JOptionPane.showMessageDialog(null, "your pokemon is a " + answer);

		answer = JOptionPane.showInputDialog(null,
				"what do you want to nickname it to");
		if (answer.equalsIgnoreCase("Nuptup"))
		{
			nuptup();
		}

		yesNo = JOptionPane.showInputDialog(null,
				"Really, your pokemons Name should be: " + answer
						+ " Yes or No");

		if (yesNo.equalsIgnoreCase("Yes"))
		{
			JOptionPane.showMessageDialog(null, answer + " was sent to the PC");

		}
		else
		{
			JOptionPane.showMessageDialog(null, "Ok then, " + answer
					+ " was a stupid name anyway");
			meetTheGUIThingy();
		}

	}

	private void nuptup()
	{
		JOptionPane.showMessageDialog(null, "#$%*&^%$#@#!#$%^^");
		JOptionPane.showMessageDialog(null, "&^*&(%(*&^%&^%");
		JOptionPane.showMessageDialog(null, "&^$^%&$&^%$$^&%$^&%");
		JOptionPane.showMessageDialog(null, "(*&(%@!#$!@*^(*^");
		JOptionPane.showMessageDialog(null, "&(*^*&%&^*%$*&^$&");
		nuptup();
	}

	public void start()
	{
		meetTheGUIThingy();

	}

}
