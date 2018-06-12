package com.mmonsoor;

public class Program {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Eleve eleve1=new Eleve("Misharl");
		Eleve eleve2=new Eleve("Wanek");
		Eleve eleve3=new Eleve("Yuna");
		eleve1.start();
		eleve2.start();
		eleve3.start();
		
		//On crée un compte bancaire
		CompteBancaire compte1= new CompteBancaire("Compte Monsoor");
		System.out.println(compte1.getSolde());
		compte1.retirer(1000);
		System.out.println(compte1.getSolde());
		compte1.retirer(1000);
		compte1.deposer(500);
		*/
		CompteBancaire compte1= new CompteBancaire("Compte Monsoor");
		compte1.setSolde(1000);
		Thread manipCompte= new Thread (new ManipulationCompte(compte1));
		manipCompte.start();
		Thread manipCompte2= new Thread (new ManipulationCompte(compte1));
		manipCompte2.start();
		Thread manipCompte3= new Thread (new ManipulationCompte(compte1));
		manipCompte3.start();
		
	
}
	
}
