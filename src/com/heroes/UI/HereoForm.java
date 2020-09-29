package com.heroes.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import com.heroes.component.CardHeroe;
import com.heroes.dominio.Heroe;
import com.heroes.repository.HeroeRepository;

public class HereoForm extends JFrame {
	HeroeRepository repository = new HeroeRepository();
	
	public HereoForm(String heroeId) {
		
		this.setSize(250, 250);
		
		Heroe h = repository.getHeroePorId(heroeId);
		
		CardHeroe card = new CardHeroe(h, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				HereoForm.this.setVisible(false);
			}
		}, "Atras");
		
		
		
		getContentPane().add(card);
	}

}
