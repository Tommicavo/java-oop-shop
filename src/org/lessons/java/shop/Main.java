package org.lessons.java.shop;

public class Main {	
	public static void main(String[] args) {
				
		Prodotto p1 = new Prodotto("Maglia", "Una maglia bianca", 12.0, 0.22);
		System.out.println(p1);
		
		Prodotto p2 = new Prodotto("Vino", "Un vino rosso", 35.0, 0.10);
		System.out.println(p2);
		
		Prodotto p3 = new Prodotto("Drone", "Un drone cinese", 50.5, 0.25);
		System.out.println(p3);
	}
}
