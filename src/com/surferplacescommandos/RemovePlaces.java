package com.surferplacescommandos;

import java.util.ArrayList;
import java.util.Scanner;
import com.surferplacesapp.Places;
import java.util.Iterator;

public class RemovePlaces extends Commando {

	public RemovePlaces() {
		super.commandoName = "remove"; // Vererbung
	}

	public void execute(String input, Scanner scanner, ArrayList<Places> places) {
		if (!commandoName.equalsIgnoreCase(input)) { // um Groﬂ/kleinschreibung zu ignorieren
			return;
		}

		System.out.println("Please enter a Surferplace to remove");
		String surferPlacesToRemove = scanner.nextLine();
		// int index = -1;

		/*
		 * for (Places place : places) { String deletedPlace = place.name;
		 * 
		 * if (deletedPlace.equalsIgnoreCase(surferPlacesToRemove)) { index =
		 * places.indexOf(place); }
		 */

		Iterator<Places> it = places.iterator();

		while (it.hasNext()) {
			Places value = it.next();
			if (value.name.equalsIgnoreCase(surferPlacesToRemove)) {
				it.remove();
				break;
			}

		}
		System.out.println("The new list is:");
		for (Places place : places) {
			System.out.println(place.name);
		}

		/*
		 * if (index != -1) { places.remove(index);
		 * System.out.println("The new list is:"); } for (Places place : places) {
		 * System.out.println(place.name); }
		 */
	}
}
