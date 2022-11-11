import java.util.*;

 class Unit07_Midterm_Group_Project_Hangman {
	static Scanner input = new Scanner(System.in);
	 public static String[] dictionary = { "mercedes", "toronto", "raptors", "cadillac", "bentley", "shelby", "camaro" };
	 public static String name = dictionary[(int) (Math.random() * dictionary.length)];
	 public static String asterisk = new String(new char[name.length()]).replace("\0", "*");
	 public static int digit = 0;
	
	public static void main(String[] args) {
		String playAgain = "y";
		while (playAgain.charAt(0) == 'y') {
		    hangmanStatementLogic();
		    System.out.print("Do you want to play again? Enter n or y > ");
		    playAgain = input.next();
		    if (playAgain.charAt(0) == 'y') {
				digit = 0;
				hangmanStatementLogic();
			}
			else {
				input.close();
				
			}
		}
	}

	public static void hangmanStatementLogic() {
		while (digit < 6 && asterisk.contains("*")) {
			System.out.println("Guess any letter in the word");
			System.out.println(asterisk);
			String guessLetter = input.next();
			String newAsterisks = "";
			for (int i = 0; i < name.length(); i++) {
				if (name.charAt(i) == guessLetter.charAt(0)) {
					newAsterisks += guessLetter.charAt(0);
				} else if (asterisk.charAt(i) != '*') {
					newAsterisks += name.charAt(i);
				} else {
					newAsterisks += "*";
				}
			}
			if (asterisk.equals(newAsterisks)) {
				digit++;
				graphicHangmanPic();
			} else {
				asterisk = newAsterisks;
			}
		}
		if (asterisk.equals(name))
			System.out.println("Correct! You win! The word was " + name);
	}
	public static void graphicHangmanPic() {
		if (digit == 1) {
			System.out.println("Wrong guess, 5 tries left");
			System.out.println("   __");
			System.out.println("   |           |");
			System.out.println("   |           O");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   | ");
			System.out.println("|");
		}
		if (digit == 2) {
			System.out.println("Wrong guess, 4 tries left");
			System.out.println("   __");
			System.out.println("   |           |");
			System.out.println("   |           O");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   | ");
			System.out.println("|");
		}
		if (digit == 3) {
			System.out.println("Wrong guess, 3 tries left");
			System.out.println("   __");
			System.out.println("   |           |");
			System.out.println("   |           O");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |          /");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("|");
		}
		if (digit == 4) {
			System.out.println("Wrong guess, 2 tries left");
			System.out.println("   __");
			System.out.println("   |           |");
			System.out.println("   |           O");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |          / \\");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("|");
		}
		if (digit == 5) {
			System.out.println("Wrong guess, 1 try left");
			System.out.println("   __");
			System.out.println("   |           |");
			System.out.println("   |           O");
			System.out.println("   |          -|");
			System.out.println("   |           |");
			System.out.println("   |          / \\");
			System.out.println("|");
		}
		if (digit == 6) {
			System.out.println("Wrong guess, all 6 chances lost.");
			System.out.println("   __");
			System.out.println("   |           |");
			System.out.println("   |           O");
			System.out.println("   |          -|-");
			System.out.println("   |           |");
			System.out.println("   |          / \\");
			System.out.println("|");

			Scanner input= new Scanner(System.in);
			if (input.next().charAt(0) == 'n') {
				System.out.println("See you next time!");
				input.close();
				System.exit(1);
			}
		}
	}
}