package com.mmonsoor;

import java.util.Random;

public class Eleve extends Thread {
	private String nom;
	public Eleve(String tmpNom) {
		// TODO Auto-generated constructor stub
		nom=tmpNom;	
	}
	public void run() {
		//On cree un objet Random
		Random r = new Random();
		int tempslatence = r.nextInt(((3000-1000))+1)+1000;
		System.out.println("Temps de latence de: "+tempslatence);
		//L'enfant compte de 1 à 10
		for(int i=1;i<=10;i++) {
			System.out.println(nom+" dit chiffre en cours: "+i);
			try {
				this.sleep(tempslatence);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(nom+" a fini de compter jusqu'à 10");
	
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
}
