package com.heroes.UI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;

import com.heroes.component.CardHeroe;
import com.heroes.dominio.Heroe;
import com.heroes.repository.HeroeRepository;


public class HomeForm extends JFrame {

	HeroeRepository repository = new HeroeRepository();
	
	public HomeForm() {
		setLayout(new GridLayout(5, 2,20,20));
		
		List<Heroe> heroes = repository.getHeroePorPublisher("Marvel Comics");
		
		for(Heroe h: heroes) {
			CardHeroe jPanel = new CardHeroe(h, new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					HereoForm form = new HereoForm(h.getId());
					form.setVisible(true);
					
				}
			}, "Mas..");
			getContentPane().add(jPanel);
		}
		
		setSize(800, 800);

		
		
		
	}
	
	public static void main(String arg[]) {
		System.out.println("dd");
		HomeForm form = new HomeForm();
		form.setVisible(true);
	}
	
}
