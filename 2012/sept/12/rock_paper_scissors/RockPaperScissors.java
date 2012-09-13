

import java.util.Scanner;


public class RockPaperScissors {
    enum RPSItem { Rock, Paper, Scissors, Invalid }

    public static void main(String[] args) {
	boolean stop_q = false;

	while (true) {
	    prompt();

	    String input = read_input();
	    if (determine_stop(input))
		break;

	    RPSItem user_choice = parse_input(input);
	    if (user_choice == RPSItem.Invalid) {
		System.out.println("Invalid input!");
		continue;
	    }

	    String result = "";
	    RPSItem computer_choice = computer_choose();

	    System.out.println("You: " + item_name(user_choice) +
			       " vs " +
			       "Computer: " + item_name(computer_choice));

	    switch (judge(user_choice, computer_choice)) {
	    case -1:
		result = "Lose";
		break;
	    case 0:
		result = "Draw";
		break;
	    case 1:
		result = "Win";
		break;
	    case -2:
		result = "Error";
		break;
	    default:
		/* impossible to run to here. */
	    }

	    System.out.println("You " + result + "!");
	    System.out.println(""); /* an empty line */
	}
    }

    private static String read_input() {
	return (new Scanner(System.in)).nextLine();
    }

    private static boolean determine_stop(String input) {
	return input.toUpperCase().equals("STOP") ? true : false;
    }

    private static RPSItem parse_input(String input) {	
	final String[] name_list = {
	    "ROCK",
	    "PAPER",
	    "SCISSORS"
	};

	int choice = -1;
	for (int i = 0; i != name_list.length; ++i) {
	    if (name_list[i].length() < input.length())
		continue;

	    if (name_list[i].substring(0, input.length())
		    .equals(input.toUpperCase())) {
		choice = i;
		break;
	    }
	}

	switch (choice) {
	case -1:
	    return RPSItem.Invalid;
	case 0:
	    return RPSItem.Rock;
	case 1:
	    return RPSItem.Paper;
	case 2:
	    return RPSItem.Scissors;
	default:
	    /* impossible to run to here.  */

	}

	return RPSItem.Invalid;
    }

    private static RPSItem computer_choose() {
	switch ((int)(Math.random() * 3)) {
	case 0:
	    return RPSItem.Rock;
	case 1:
	    return RPSItem.Paper;
	case 2:
	    return RPSItem.Scissors;
	default:
	    /* impossible to run to here. */
	}

	return RPSItem.Invalid;
    }

    private static String item_name(RPSItem item) {
	switch (item) {
	case Rock:
	    return "Rock";
	case Paper:
	    return "Paper";
	case Scissors:
	    return "Scissors";
	case Invalid:
	    return "Invalid";
	default:
	    /* impossible to run to here. */
	}

	return "Error";
    }

    private static int judge(RPSItem user, RPSItem comp) {
	if (user == RPSItem.Invalid || comp == RPSItem.Invalid)
	    return -2;

	if (user == comp)
	    return 0; /* Draw */

	if ((user == RPSItem.Rock && comp == RPSItem.Scissors) ||
	    (user == RPSItem.Scissors && comp == RPSItem.Paper) ||
	    (user == RPSItem.Paper && comp == RPSItem.Rock)) {
	    return 1; /* Win */
	}

	return -1; /* Lose */
    }

    private static void prompt() {
	System.out.println("Make your choice: rock/paper/scissors" +
			 "(or `stop' to quit)");
	System.out.print("? ");
    }

}