package com.surferplacescommandos;

import java.util.ArrayList;
import java.util.Scanner;
import com.surferplacesapp.Places;

public class AddPlacesCommando extends Commando {
	
	public AddPlacesCommando() {
		super.commandoName = "add"; // Vererbung
	}

	public void execute(String input, Scanner scanner, ArrayList<Places> places) {
		if (!commandoName.equalsIgnoreCase(input)) {// zurück, falls das Kommando falsch ist
			return;
		}
		
			System.out.println("Please enter a Surferplace:");
			String surferPlaces = scanner.nextLine();

			for (Places place : places) {
				String newlyAddedPlace = place.name;

				if (newlyAddedPlace.equalsIgnoreCase(surferPlaces)) {
					System.out.println("Location already exists in the list");
					return;
				}
			}

			System.out.println("Please enter a country:");
			String country = scanner.nextLine();
			Places place = new Places(surferPlaces, country);
			places.add(place);
			System.out.println("The new list is:");
			for (Places place1 : places) {
				System.out.println(place1.name);
			}
		}

	}

