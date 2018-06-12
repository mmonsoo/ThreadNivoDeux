package com.mmonsoor;

import java.util.Random;

public class ManipulationCompte implements Runnable {
	//Attribut de la classe
	private CompteBancaire comptebancaire;
	public ManipulationCompte(CompteBancaire cb) {
		// TODO Auto-generated constructor stub
		comptebancaire=cb;
	}
	public CompteBancaire getComptebancaire() {
		return comptebancaire;
	}
	public void setComptebancaire(CompteBancaire comptebancaire) {
		this.comptebancaire = comptebancaire;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			System.out.println("Nom du thread"+Thread.currentThread().getName());
			Random r = new Random();
			boolean b=r.nextBoolean();
			int somme=r.nextInt(1000)+1;
			faireOperationAleatoire( b,somme);
			//operationAleatoire();
		}
	}
	/**
	 * @param number
	 */
	public void operationAleatoire() {
		Random r = new Random();
		int number=r.nextInt(2);
		int somme=r.nextInt(1000)+1;
		switch (number) {
		case 0:
			comptebancaire.retirer(somme);
			break;
		case 1:
			comptebancaire.deposer(somme);
			break;
		}
	}
	
	public  synchronized void faireOperationAleatoire(boolean b,int somme) {
		
		if(b) {
			comptebancaire.retirer(somme);
		}
		else {
			comptebancaire.deposer(somme);
		}
		
	}



}
