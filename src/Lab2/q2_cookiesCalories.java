package Lab2;

import java.util.Scanner;

public class q2_cookiesCalories {

	public static void main(String[] args) {
		// q2 Cookies Calories
		// 300 calories for 40 cookies
		// 7.5 calories for each

		double perEach = 7.5;

		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter the number of cookies you ate : ");
		double calories = user_input.nextDouble();
		System.out.println("Number of total calories consumeed is : " + (calories * perEach));

	}

}
