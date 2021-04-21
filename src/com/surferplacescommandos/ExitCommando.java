package com.surferplacescommandos;

import java.util.Scanner;

public class ExitCommando extends Commando {
	
	public ExitCommando() {
		super.commandoName = "Exit"; // Vererbung
	}

	public void execute(String input, Scanner scanner) {
		if (!commandoName.equalsIgnoreCase(input)) {
			return;
			}
		
			System.out.println("Good bye!");
			scanner.close();
			System.exit(0); // kein Fehler
		}
	}


