package com.heroes.data;

import java.util.ArrayList;

import com.heroes.dominio.Heroe;

public class Data {
	
	private ArrayList<Heroe> heroes = new ArrayList<>();
	
	public Data() {
		Heroe  h1 = new Heroe("dc-batman",
				"Batman",
				"DC Comics",
				"Bruce Wayne",
				"Detective Comics #27",
				"Bruce Wayne");
		
		Heroe  h2 = new Heroe("marvel-captain",
				"Captain America",
				"Marvel Comics",
				"Steve Rogers",
				"Captain America Comics #1",
				"Steve Rogers");
		
		Heroe  h3 = new Heroe("marvel-iron",
				"Iron Man",
				"Marvel Comics",
				"Tony Stark",
				"Tales of Suspense #39",
				"Tony Stark");
		
		
		heroes.add(h1);
		heroes.add(h2);
		heroes.add(h3);
	}

	public ArrayList<Heroe> getHeroes() {
		return heroes;
	}
	
	
}
