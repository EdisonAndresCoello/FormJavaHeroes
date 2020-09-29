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
		
		Heroe  h1 = new Heroe("marvel-captain",
				"Captain America",
				"Marvel Comics",
				"Steve Rogers",
				"Captain America Comics #1",
				"Steve Rogers");
		
		Heroe  h2 = new Heroe("marvel-spider",
				"Spider Man",
				"Marvel Comics",
				"Peter Parker",
				"Amazing Fantasy #15",
				"Peter Parker");
		
		Heroe  h3 = new Heroe("marvel-iron",
				"Iron Man",
				"Marvel Comics",
				"Tony Stark",
				"Tales of Suspense #39",
				"Tony Stark");
		
		Heroe  h4 = new Heroe("marvel-thor",
				"Thor",
				"Marvel Comics",
				"Thor Odinson",
				"Journey into Myster #83",
				"Thor Odinson");
		
		Heroe  h5 = new Heroe("marvel-hulk",
				"Hulk",
				"Marvel Comics",
				"Bruce Banner",
				"The Incredible Hulk #1",
				"Bruce Banner");
		
		Heroe  h6 = new Heroe("marvel-wolverine",
				"Wolverine ",
				"Marvel Comics",
				"James Howlett",
				"The Incredible Hulk #180",
				"James Howlett");
		
		Heroe  h7 = new Heroe("marvel-daredevil",
				"Daredevil",
				"Marvel Comics",
				"Matthew Michael Murdock",
				"Daredevil #1",
				"Matthew Michael Murdock");
		
		Heroe  h8 = new Heroe("marvel-hawkeye",
				"Hawkeye",
				"Marvel Comics",
				"Clinton Francis Barton",
				"Tales of Suspense #57",
				"Clinton Francis Barton");
		
		Heroe  h9 = new Heroe("marvel-cyclops",
				"Cyclops",
				"Marvel Comics",
				"Scott Summers",
				"X-Men #1",
				"Scott Summers");
		
		Heroe  h10 = new Heroe("marvel-silver",
				"Silver Surfer",
				"Marvel Comics",
				"Norrin Radd",
				"The Fantastic Four #48",
				"Norrin Radd");
		
		Heroe  h11 = new Heroe("dc-batman",
				"Batman",
				"DC Comics",
				"Bruce Wayne",
				"Detective Comics #27",
				"Bruce Wayne");
		
		Heroe h21 = new Heroe("dc-superman", 
				"Superman", 
				"DC Comics", 
				"Kal-El", 
				"Action Comics #1",
				"Kal-El");
		
		Heroe h31 = new Heroe("dc-flash", 
				"Flash", 
				"DC Comics", 
				"Jay Garrick", 
				"Flash Comics #1",
				"Jay Garrick, Barry Allen, Wally West, Bart Allen");
		
		Heroe h41 = new Heroe("dc-green", 
				"Green Lantern ", 
				"DC Comics", 
				"Alan Scott", 
				"All-American Comics #16", 
				"Alan Scott, Hal Jordan, Guy Gardner, John Stewart, Kyle Raynor, Jade, Sinestro, Simon Baz");
		
		Heroe h51 = new Heroe("dc-arrow", 
				"Green Arrow ", 
				"DC Comics", 
				"Oliver Queen", 
				"More Fun Comics #73", 
				"Oliver Queen");
		
		Heroe h61 = new Heroe("dc-wonder", 
				"Wonder Woman", 
				"DC Comics", 
				"Princess Diana", 
				"All Star Comics #8", 
				"Princess Diana");
		
		Heroe h71 = new Heroe("dc-martian", 
				"Martian Manhunter", 
				"DC Comics", 
				"J\\onn J\\onzz", 
				"Detective Comics #225", 
				"Martian Manhunter");
		
		Heroe h81 = new Heroe("dc-robin", 
				"Robin/Nightwing", "DC Comics",
				"Dick Grayson", 
				"Detective Comics #38",
				"Dick Grayson");
		
		Heroe h91 = new Heroe("dc-blue",
				"Blue Beetle", "DC Comics",
				"Dan Garret",
				"Mystery Men Comics #1",
				"Dan Garret, Ted Kord, Jaime Reyes");
		
		Heroe h101 = new Heroe("dc-black", 
				"Black Canary ", 
				"DC Comics", 
				"Dinah Drake", 
				"Flash Comics #86",
				"Dinah Drake, Dinah Lance");
		
		
		heroes.add(h1);
		heroes.add(h2);
		heroes.add(h3);
		heroes.add(h4);
		heroes.add(h5);
		heroes.add(h6);
		heroes.add(h7);
		heroes.add(h8);
		heroes.add(h9);
		heroes.add(h10);
		
		heroes.add(h11);
		heroes.add(h21);
		heroes.add(h31);
		heroes.add(h41);
		heroes.add(h51);
		heroes.add(h61);
		heroes.add(h71);
		heroes.add(h81);
		heroes.add(h91);
		heroes.add(h101);
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
