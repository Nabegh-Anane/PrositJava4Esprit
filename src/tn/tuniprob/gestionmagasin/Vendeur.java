package tn.tuniprob.gestionmagasin;

public class Vendeur extends Employe {
    private double tauxDeVente;

    public Vendeur(int id, String nom, String adresse, int nbrHeures, double tauxDeVente) {
        super(id, nom, adresse, nbrHeures);
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public double calculerSalaire() {
        return 450 * tauxDeVente;
    }

    @Override
    public String toString() {
        return super.toString() + ", Taux de Vente: " + tauxDeVente + ", Salaire: " + calculerSalaire() + " DT";
    }
}
