package tn.tuniprob.gestionmagasin;

public class Responsable extends Employe {
    private double prime;

    public Responsable(int id, String nom, String adresse, int nbrHeures, double prime) {
        super(id, nom, adresse, nbrHeures);
        this.prime = prime;
    }

    public double getPrime() {
        return prime;
    }

    @Override
    public double calculerSalaire() {
        double salaire = nbrHeures * 5.0;
        return salaire + prime;
    }

    @Override
    public String toString() {
        return "Responsable [ID=" + id + ", Nom=" + nom + ", Adresse=" + adresse + ", Heures travaillées=" + nbrHeures
                + ", Prime=" + prime + ", Salaire Total=" + calculerSalaire() + " DT]";
    }
}
