import java.util.*;

class Main {
	// defines as main
	public static void main(String[] args) {
		// creation of variables
		Scanner sc = new Scanner(System.in);
		int userAge;

		// asks user for their age
		System.out.println("How old are you?");
		userAge = sc.nextInt();

		// closes scanner
		sc.close();

		// checks if user is over 18 & tells user if they can vote
		if (userAge >= 18) {
			System.out.println("You are old enough to vote!");
		} else {
			System.out.println("You are too young to vote.");
		}
	}
}