package com.bridgeit.functional_programs;

import com.bridgeit.utility.Utility;

public class Gambler {

	private static int wins = 0;

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.print("Enter stake: \n");
		int stake = utility.IntegerInput();
		System.out.print("Enter goal: \n");
		int goal = utility.IntegerInput();
		System.out.print("Enter Number of time to play: \n");
		int times = utility.IntegerInput();
		for (int i = 0; i < times; i++) {
			wins = utility.play(stake, goal,wins);
		}
		System.out.println("Won " + wins + " times ");
		System.out.println("Win percentage = " + 100 * wins / (float) times);
		System.out.println("Loss percentage = " + (100 - (100 * wins / (float) times)));
	}
}
