package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunJets {
	Hangar2 h = new Hangar2();
	ArrayList<Jet> jets = new ArrayList<Jet>();

	public static void runJets() {

		RunJets obj = new RunJets();
		obj.jetMenu();

	}

	public void jetMenu() {

		while (true) {
			Scanner key = new Scanner(System.in);
			System.out.println("  Welcome to the Fantastic World of Jets!");
			System.out.println("|----------------------------------------|");
			System.out.println("|                MENU                    |");
			System.out.println("|----------------------------------------|");
			System.out.println("|                                        |");
			System.out.println("|  1. List Fleet of Jets                 |");
			System.out.println("|  2. View Fastest Jet                   |");
			System.out.println("|  3. View Longest Range Jet             |");
			System.out.println("|  4. Add a Jet to the Fleet             |");
			System.out.println("|  5. Exit                               |");
			System.out.println("|                                        |");
			System.out.println("|----------------------------------------|");
			System.out.println("\nWhat would you like to do?");
			int choice = key.nextInt();

			if (choice == 1) {
				listJets();
			}
			if (choice == 5) {
				exitOption();
			}
			if (choice == 4) {
				h.newJet();
			}
			if (choice == 2) {
				fastestJet();
			}
			if (choice == 3) {
				longestRange();
			}

		} // new Hangar().addJets(jets,choice);
	}

	public void exitOption() {
		Scanner key = new Scanner(System.in);

		System.out.println("|----------------------------------------|");
		System.out.println("|                MENU                    |");
		System.out.println("|----------------------------------------|");
		System.out.println("|      Are you sure you want to exit?    |");
		System.out.println("|                 1. Yes                 |");
		System.out.println("|                 2. No                  |");
		System.out.println("|                                        |");
		System.out.println("|----------------------------------------|");
		System.out.println("\nWhat would you like to do?");
		int exit = key.nextInt();

		if (exit == 1) {
			System.out.println("|----------------------------------------|");
			System.out.println("|                MENU                    |");
			System.out.println("|----------------------------------------|");
			System.out.println("|               Goodbye!!                |");
			System.out.println("|                                        |");
			System.out.println("|----------------------------------------|");
			System.exit(0);

		}
		if (exit == 2) {
			jetMenu();
		}

	}

	public void listJets() {
		

		System.out.println("\nBehold our Fantastic Fleet of Jets: ");
		System.out.println("-----------------------");

		for (int i = 0; i < h.jets.length; i++) {

			if (h.jets[i] != null) {
				System.out.println(h.jets[i]);
			}
		}
		System.out.println("-----------------------");
	}

	public void fastestJet() {
		double maxValue = 0;
		int i = 0;
		int fastestJet = 0;
		for (i = 0; i < h.jets.length; i++) {
			if (h.jets[i] != null) {
				if (h.jets[i].getSpeed() > maxValue) {
					maxValue = h.jets[i].getSpeed();
					h.jets[fastestJet] = h.jets[i];

				}
			}

		}
		System.out.println("|----------------------------------------|");
		System.out.println("|              Fastest Jet               |");
		System.out.println("|----------------------------------------|");
		System.out.println("\n" + h.jets[fastestJet]);
		System.out.println("|----------------------------------------|");
	}

	public void longestRange() {
		double maxValue = 0;
		int longestRange = 0;
		for (int i = 0; i < h.jets.length; i++) {
			if (h.jets[i] != null) {
				if (h.jets[i].getRange() > maxValue) {
					maxValue = h.jets[i].getRange();
					h.jets[longestRange] = h.jets[i];
				}
			}

		}
		System.out.println("|----------------------------------------|");
		System.out.println("|          Longest Ranged Jet            |");
		System.out.println("|----------------------------------------|");
		System.out.println("\n" + h.jets[longestRange]);
		System.out.println("|----------------------------------------|");
	}
}
