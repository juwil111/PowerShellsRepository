package com.surferplacescommandos;

import java.util.ArrayList;
import java.util.Scanner;

import com.surferplacesapp.Places;

public class ListCommando extends Commando {
	
	public ListCommando() {
		super.commandoName = "showall"; // Vererbung
	}

	public void execute(String input, Scanner scanner, ArrayList<Places> places) {
		if (!commandoName.equalsIgnoreCase(input)) {
			return;
		}
		
			for (Places place : places) {
				System.out.println("The place name is: " + place.name);
				System.out.println("The country is: " + place.country);
				if (place.lat == 0.0) { // big decimal
					System.out.println("Gps Coordinates not known");
				} else {
					System.out.println("The Gps Coordinates are: " + place.lat + "," + place.longitude);
				}

				int waveometer = place.randomWaveoMeter();
				System.out.println("The WaveoMeter is: " + waveometer);

			}
		}

	}

