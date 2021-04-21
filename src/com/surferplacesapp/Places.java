package com.surferplacesapp;

public class Places {
	public String name;
	public String country;
	public double lat; // big decimal
	public double longitude;
	public int waveometer;

	public Places(String name, String country) {

		this.name = name;
		this.country = country;
	}

	public Places(String name, String country, double lat, double longitude) {

		this.name = name;
		this.country = country;
		this.lat = lat;
		this.longitude = longitude;
	}
	

	 public int randomWaveoMeter() {						//Methode, dass Werte nicht gespeichert werden
			int random = (int) (Math.random() * 11);
			return random;
		}
	 
}
