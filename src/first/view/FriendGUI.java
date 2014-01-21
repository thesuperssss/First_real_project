package first.view;

import javax.swing.JOptionPane;

import first.model.Friend;

public class FriendGUI
{
	private Friend graysonFriend;
	private Friend alyFriend;
	private Friend samFriend;
	private int count;

	public FriendGUI()
	{
		graysonFriend = new Friend();
		alyFriend = new Friend();
		samFriend = new Friend();
	}

	private void findOutAboutFriends()
	{
		String friendName;

		int friendAge;

		String friendAgeS;

		String friendPersonality;

		Boolean friendIsImaginary;
		String friendIsImaginaryS;

		Double friendWeight;
		String friendWeightS;

		String friendHobby;
		int myAge;
		myAge = 16;
		if(count>1)
		{
			JOptionPane.showMessageDialog(null, "thank you");
		}
		
		
		
		friendName = JOptionPane.showInputDialog(null, "Who are you");
		if (friendName.equalsIgnoreCase("aly")
				|| friendName.equalsIgnoreCase("grayson")
				|| friendName.equalsIgnoreCase("sam"))
		{
		}
		else
		{
			JOptionPane.showMessageDialog(null, "I don't know you sorry");
			System.exit(0);
		}
		friendAgeS = JOptionPane.showInputDialog(null, "Hello " + friendName
				+ " what is your age");
		friendAge = Integer.parseInt(friendAgeS);

		if (friendAge == myAge)
		{
			JOptionPane.showMessageDialog(null, "You are the same age as me");
		}
		else if (friendAge > myAge)
		{
			if (friendAge == 17)
			{
				JOptionPane.showMessageDialog(null, "You are "
						+ (friendAge - myAge) + " year older than me");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "You are "
						+ (friendAge - myAge) + " years older than me");
			}
		}
		else if (friendAge < myAge)
		{
			if (friendAge == 15)
			{
				JOptionPane.showMessageDialog(null, "You are "
						+ (friendAge - myAge) + " year younger than me");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "You are "
						+ (friendAge - myAge) + " years younger than me");
			}
		}

		friendPersonality = JOptionPane.showInputDialog(null,
				"What is your personality");
		JOptionPane.showMessageDialog(null, "Cool");

		friendIsImaginaryS = JOptionPane.showInputDialog("Are you real");

		if (friendIsImaginaryS.equalsIgnoreCase("yes"))
		{
			friendIsImaginary = true;
		}
		else
		{
			friendIsImaginary = false;
			JOptionPane.showMessageDialog(null, "Really?");
		}
		friendWeightS = JOptionPane.showInputDialog(null, "How heavy are you");
		JOptionPane.showMessageDialog(null, "Interesting");
		friendWeight = Double.parseDouble(friendWeightS);
		friendHobby = JOptionPane.showInputDialog(null,
				"What do you like to do");

		if (friendName.equalsIgnoreCase("grayson"))
		{
			graysonFriend.setName(friendName);
			graysonFriend.setAge(friendAge);
			graysonFriend.setPersonality(friendPersonality);
			graysonFriend.setIsImaginary(friendIsImaginary);
			graysonFriend.setWeight(friendWeight);
			graysonFriend.setHobby(friendHobby);
		}
		else if (friendName.equalsIgnoreCase("aly"))
		{
			alyFriend.setName(friendName);
			alyFriend.setAge(friendAge);
			alyFriend.setPersonality(friendPersonality);
			alyFriend.setIsImaginary(friendIsImaginary);
			alyFriend.setWeight(friendWeight);
			alyFriend.setHobby(friendHobby);
		}
		else if (friendName.equalsIgnoreCase("Sam"))
		{
			samFriend.setName(friendName);
			samFriend.setAge(friendAge);
			samFriend.setPersonality(friendPersonality);
			samFriend.setIsImaginary(friendIsImaginary);
			samFriend.setWeight(friendWeight);
			samFriend.setHobby(friendHobby);
		}

		while (count < 3)
		{
			count = count + 1;
			findOutAboutFriends();
		}
		if (count == 3)
		{
			showAndTell();
		}
	}

	private void showAndTell()
	{
		JOptionPane
				.showMessageDialog(null, graysonFriend.getName()
						+ " hello, so you are " + graysonFriend.getAge()
						+ " years old");
		JOptionPane.showMessageDialog(null, "I also hear you are a "
				+ graysonFriend.getPersonality() + " type of person");

		if (graysonFriend.getIsImaginary() == true)
		{
			JOptionPane.showMessageDialog(null, "you are also real");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "you are also not real");
			JOptionPane.showMessageDialog(null, "(I don't see how that is possable)");
		}
		JOptionPane.showMessageDialog(null,
				"and also weigh " + graysonFriend.getWeight() + " pounds.");
		JOptionPane.showMessageDialog(null,
				"You like to " + graysonFriend.getHobby());

		JOptionPane.showMessageDialog(null, alyFriend.getName()
				+ " hello, so you are " + alyFriend.getAge() + " years old");
		JOptionPane.showMessageDialog(null, "I also hear you are a "
				+ alyFriend.getPersonality() + " type of person");

		if (alyFriend.getIsImaginary() == true)
		{
			JOptionPane.showMessageDialog(null, "you are also real");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "you are also not real");
		}
		JOptionPane.showMessageDialog(null,
				"and also weigh " + alyFriend.getWeight() + " pounds.");
		JOptionPane.showMessageDialog(null,
				"You like to " + alyFriend.getHobby());

		JOptionPane.showMessageDialog(null, samFriend.getName()
				+ " hello, so you are " + samFriend.getAge() + " years old");
		JOptionPane.showMessageDialog(null, "I also hear you are a "
				+ samFriend.getPersonality() + " type of person");

		if (samFriend.getIsImaginary() == true)
		{
			JOptionPane.showMessageDialog(null, "you are also real");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "you are also not real");
		}
		JOptionPane.showMessageDialog(null,
				"and also weigh " + samFriend.getWeight() + " pounds.");
		JOptionPane.showMessageDialog(null,
				"You like to " + samFriend.getHobby());
	}

	public void start()
	{
		count = 1;
		findOutAboutFriends();
	}
}
