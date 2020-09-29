package com.heroes.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.heroes.dominio.Heroe;


// CRUD
// CREATE, READ, UDAPTE, DELETE


public class HeroeRepository {
	ArrayList<Heroe> heroes = new ArrayList<>();
	
	public HeroeRepository() {
		
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
	
	public Heroe getHeroePorId(String id) {
		for(Heroe h: heroes) {
			if(h.getId().equals(id))
				return h;
		}
		return null;
	}
	
	public ArrayList<Heroe> getHeroePorPublisher(String publisher){
		ArrayList<Heroe> result = new ArrayList<>();
		
		for(Heroe h: heroes) {
			if(h.getPublisher().equals(publisher))
				result.add(h);
		}
		
		return result;
	}
	
	public List<Heroe> getHeroePorSuperHeroFilter(String superHero){
		
//		ArrayList<Heroe> result = new ArrayList<>();
//		superHero = superHero.toLowerCase();
//		for(Heroe h: heroes) {
//			if(h.getSuperhero().toLowerCase().contains(superHero))
//				result.add(h);
//		}
		
		
		return heroes.stream().filter(h -> h.getSuperhero().toLowerCase().contains(superHero)).collect(Collectors.toList());
		
//		return result;
	}
	
	
	
	

	public ArrayList<Heroe> getHeroes() {
		return heroes;
	}
	
	
}
