import java.util.Scanner;

/**
 *   File Name: HomeMortgageCalculator.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 28, 2016
 *
 */

/**
 * HomeMortgageCalculator //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class HomeMortgageCalculator {

	static String[] details;
	static String ID;
	static float interest;
	static double principle;
	static Scanner scanner = new Scanner(System.in);
	static double termInMonths;
	static String[] userVars;

	// method to say farewell to user
	public static void exitApplication() {
		// Message to say farewell to user
		System.out.println("\nThank you for using our home mortgage calculator!");
		// Exit the system
		System.exit(0);

	}

	public static void main(String[] args) {
		// Declare local variables

		double principle = 0;
		double months = 0;
		float interest = 0;
		double monthlyPayment;
		double termInMonths = 0;

		// Output a welcome message to user
		System.out.println("Hello, Welcome to our Home Mortgae Calculator!");
		// Request the user's property ID
		System.out.println("Can I have your property ID? ");
		// Set the captured name to a local String variable, name
		ID = scanner.nextLine();

		System.out.println("What is your principle?");
		principle = scanner.nextDouble();

		// Variable total
		// monthlyPayment = Double.parseDouble(scanner.nextLine());

		monthlyPayment = (principle * interest) / (1 - Math.pow(1 + interest, -termInMonths));

		details = requestUserInfo(ID, "What is your principle?");
		// Output the information to the user
		outputUserDetails(monthlyPayment);
		// Call method which gives a farewell to user and exits the system.
		exitApplication();

	}

	public static void outputUserDetails(Double monthlyPayment) {

		// Begin outputting user gathered details such as their name
		System.out.println("\nYour payment each moth would be: " + monthlyPayment);
		// Iterate through user details backwards, each iteration echos a detail
		for (int i = userVars.length - 1; i > 0; i--) {
			// Echo detail gathered of user info and requested details to
			// console
			System.out.println("Your " + details[i] + "is " + userVars[i] + ".");
		}

	}

	// This a method or function (Components that make up the method form a
	// method signature
	public static String[] requestUserInfo(String name, String... details) {
		// Create an array of Strings type objects to hold values for user, size
		// is based on supplied arguments
		userVars = new String[details.length];
		// Greet the user
		System.out.println("What is your interest?");
		interest = scanner.nextFloat();
		// Perform a loop for the amount of iterations equal to the length of
		// supplied items
		for (int i = 0; i < details.length; i++) {
			// For each iteration ask the user for details
			System.out.println("How many terms?");
			// Capture user input in relative variable within array
			termInMonths = scanner.nextDouble();

		}
		// return the String array of supplied details
		return details;
	}

}
