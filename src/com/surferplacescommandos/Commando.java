package com.surferplacescommandos;

public class Commando {

	String commandoName;

	public boolean shouldExecute(String input) {
		if (commandoName.equals(input)) {
			return true;
		}
		return false;
	}

}
