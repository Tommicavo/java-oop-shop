package org.lessons.java.shop;

import java.util.Random;

public class Main {
	
	public static int getRandomCode() {
		final int minCode = 0;
		final int maxCode = Integer.MAX_VALUE;
		
		Random rnd = new Random();
		
		int randomCode = rnd.nextInt(maxCode - minCode) + minCode;
		return randomCode;
	}
	
	public static void main(String[] args) {
				
		Prodotto p1 = new Prodotto(getRandomCode(), "Maglia", "Una maglia bianca", 12.0, 0.22);
		System.out.println(p1);
		
		Prodotto p2 = new Prodotto(getRandomCode(), "Vino", "Un vino rosso", 35.0, 0.10);
		System.out.println(p2);
		
		Prodotto p3 = new Prodotto(getRandomCode(), "Drone", "Un drone cinese", 50.5, 0.25);
		System.out.println(p3);
	}
}
