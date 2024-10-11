package tn.tuniprob.gestionmagasin;

public class Employe {
    protected int id;
    protected String nom;
    protected String adresse;
    protected int nbrHeures;

    public Employe(int id, String nom, String adresse, int nbrHeures) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nbrHeures = nbrHeures;
    }

    public double calculerSalaire() {
        return 0;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Employe [ID=" + id + ", Nom=" + nom + ", Adresse=" + adresse + ", Heures travaillées=" + nbrHeures + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Employe) {
            Employe e = (Employe) o;
            return this.id == e.id && this.nom.equals(e.nom) && this.adresse.equals(e.adresse) && this.nbrHeures == e.nbrHeures;
        }
        return false;
    }
}
