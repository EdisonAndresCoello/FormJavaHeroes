package com.heroes;

import com.heroes.repository.HeroeRepository;

public class Main {

	public static void main(String[] args) {
		HeroeRepository heroeRepository = new HeroeRepository();
		System.out.println(heroeRepository.getHeroePorPublisher("DC Comics"));
	}

}
