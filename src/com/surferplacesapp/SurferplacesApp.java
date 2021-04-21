package com.surferplacesapp;

import java.util.ArrayList;
import java.util.Scanner;

import com.surferplacescommandos.AddPlacesCommando;
import com.surferplacescommandos.ExitCommando;
import com.surferplacescommandos.ListCommando;
import com.surferplacescommandos.RemovePlaces;
import com.surferplacescommandos.ShowOnePlace;

public class SurferplacesApp {

	public static void main(String[] args) {

		ArrayList<Places> surferPlaces = new ArrayList<>();

		Places place1 = new Places("Nazare", "Portugal", 39.6029108, -9.0701572);
		Places place2 = new Places("Peniche", "Portugal", 39.3372251, -9.3128528);
		Places place3 = new Places("Biarritz", "France", 43.4711437, -1.5527266);

		surferPlaces.add(place1);
		surferPlaces.add(place2);
		surferPlaces.add(place3);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the SurferPlaces App!");
		System.out.println("Choose from the following options:");
		System.out.println("Type 'Add' to add a new place");
		System.out.println("Type 'Remove' to delete the place");
		System.out.println("Type 'ShowAll' to Show all");
		System.out.println("Type 'Show' to show the chosen location");
		System.out.println("Type 'Exit' to leave the App");

		while (true) {
		System.out.println("\nPlease enter your Commando or type Exit to leave.");
		String input = scanner.nextLine();

	
			new AddPlacesCommando().execute(input, scanner, surferPlaces);
			new RemovePlaces().execute(input, scanner, surferPlaces);
			new ListCommando().execute(input, scanner, surferPlaces);
			new ExitCommando().execute(input, scanner);
			new ShowOnePlace().execute(input, scanner, surferPlaces);
		}
	}
}
