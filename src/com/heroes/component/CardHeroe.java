package com.heroes.component;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.heroes.UI.HereoForm;
import com.heroes.dominio.Heroe;

public class CardHeroe extends JPanel {
	
	public CardHeroe(Heroe h, ActionListener action) {
		this.setLayout(null);
		
		Image img = new ImageIcon("heroes/" + h.getId() + ".jpg").getImage().getScaledInstance(140, 180, Image.SCALE_SMOOTH);
		JLabel imgLabel = new JLabel();
		imgLabel.setBounds(0, 0, 140, 180);
		imgLabel.setIcon(new ImageIcon(img));
		this.add(imgLabel);
		
		JLabel alterEgo = new JLabel(h.getAlter_ego());
		alterEgo.setBounds(150, 0, 80, 25);
		this.add(alterEgo);
		
		JLabel characters = new JLabel(h.getCharacters());
		characters.setBounds(150, 20, 80, 25);
		this.add(characters);
		
		JLabel firstAppearance = new JLabel(h.getFirst_appearance());
		firstAppearance.setBounds(150, 40, 80, 25);
		this.add(firstAppearance);
		
		JLabel superhero = new JLabel(h.getSuperhero());
		superhero.setBounds(150, 60, 80, 25);
		this.add(superhero);
		
		JButton mostrarDetalleButton = new JButton("Mas...");
		mostrarDetalleButton.addActionListener(action);
		mostrarDetalleButton.setBounds(150, 80, 80, 25);
		
		
		this.add(mostrarDetalleButton);
		
	}

}
