package com.mmonsoor;

public class CompteBancaire {
	private int solde=1000;
	private String nomCompte;
	
	public CompteBancaire(String tmpNomCompte) {
		// TODO Auto-generated constructor stub
		nomCompte=tmpNomCompte;
	}

	public int getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}
	public  void deposer(int argent) {
		System.out.println("Vous avez déposé "+argent+" euros.");
		setSolde(getSolde()+argent);
		System.out.println("Votre nouveau solde est de "+getSolde());
		
	}
	public  void retirer (int argent) {
		if((getSolde()>0) &&  argent<=getSolde()) {
			System.out.println("Vous avez retiré "+argent+" euros.");
			setSolde(getSolde()-argent);
			System.out.println("Votre nouveau solde est de "+getSolde());
		}
		
		else if (getSolde()<=0) {
			System.out.println("Vous ne pouvez pas retirer de l'argent car vous n'avez plus d'argent dans votre compte");
			
		}
		else if(argent >getSolde() ) {
			System.out.println("Vous ne pouvez pas retirer une somme supérieure à votre compte bancaire");
			
		}	
		
	}

	
}
