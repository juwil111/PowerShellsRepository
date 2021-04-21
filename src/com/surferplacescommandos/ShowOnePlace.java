package com.surferplacescommandos;

import java.util.ArrayList;
import java.util.Scanner;
import com.surferplacesapp.Places;
import java.util.Iterator;

public class ShowOnePlace extends Commando {
	
	public ShowOnePlace() {
		super.commandoName = "show"; // Vererbung
	}

	public void execute(String input, Scanner scanner, ArrayList<Places> places) {
		if (!commandoName.equalsIgnoreCase(input)) { // um Groﬂ/kleinschreibung zu ignorieren
			return;
		}
		
		System.out.println("Please enter a Surferplace you want to get more information about");
		String surferPlaceToShow = scanner.nextLine();

		for (Places place : places) {
			String placeToShow = place.name;

			if (placeToShow.equalsIgnoreCase(surferPlaceToShow)) {

				String name = place.name;
				String location = place.country;
				System.out.println("The location you are looking for is: " + name);
				System.out.println("The country is: " + location);
				if (place.lat == 0.0) { // big decimal
					System.out.println("Gps Coordinates not known");
				} else {
					System.out.println("The Gps Coordinates are: " + place.lat + "," + place.longitude);
				}
				int waveometer = place.randomWaveoMeter();
				System.out.println("The WaveoMeter is: " + waveometer);
				return;

			}
		}
		System.out.println("This location is not in the list!");

	}
}
