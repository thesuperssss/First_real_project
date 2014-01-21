package first.view;

import first.model.Thingy;
import java.util.Scanner;

public class ConsoleView
{
	// Scanner object
	private Scanner wordScanner;

	private Thingy testThingy;

	public ConsoleView()
	{
		wordScanner = new Scanner(System.in);
		testThingy = new Thingy();
	}

	public void start()
	{
		// getWords();
		meetTheThingy();

	}

	// do not forget the ()

	private void meetTheThingy()
	{
		System.out.println("Let's meet our new pokemon");
		System.out.println("your pokemon is a " + testThingy.getName());

		System.out.println("what do you want to nickname it to");

		String newName = wordScanner.nextLine();

		System.out.println("Really, your pokemons Name should be: " + newName
				+ " Yes or No");
		testThingy.setName(newName);
		String answer = wordScanner.nextLine();

		if (newName.equalsIgnoreCase("Nuptup"))
		{
			System.out.println("@%$#^%@$%&^$%#*%*&");
			System.out.println("&^*&(%(*&^%&^%");
			System.out.println("&^$^%&$&^%$$^&%$^&%");
			System.out.println("(*&(%@!#$!@*^(*^");
			System.out.println("&(*^*&%&^*%$*&^$&");
			System.exit(0);
		}

		if (answer.equalsIgnoreCase("Yes"))
		{
			testThingy.setName(newName);
			System.out.println(testThingy.getName() + " was sent to the PC");
			Food();

		} else if (answer.equalsIgnoreCase("no"))
		{
			System.out.println("Ok then, " + newName
					+ " was a stupid name anyway");
			testThingy.setName("Oddish");
			meetTheThingy();
		}

	}

	private void Food()
	{
		System.out.println("What is " + testThingy.getName()
				+ "'s favorite food");
		String food = wordScanner.nextLine();
		testThingy.setFood("food");
		System.out.println("I like " + food + " too");
		movie();
	}

	private void movie()
	{
		System.out.println("what is " + testThingy.getName()
				+ " favorite movie");
		String movie = wordScanner.nextLine();
		System.out.println("pufffft " + movie + " sucks");
	}

}
