package tn.tuniprob.gestionmagasin;

import java.util.ArrayList;

public class Magasin {
    private int id;
    private String nom;
    private String adresse;
    private int capacite;
    private ArrayList<Produit> produits;
    private ArrayList<Employe> employes;

    public Magasin(int id, String nom, String adresse, int capacite) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.capacite = capacite;
        this.produits = new ArrayList<>();
        this.employes = new ArrayList<>();
    }

    public boolean ajouterProduit(Produit produit) {
        if (produits.size() < capacite) {
            produits.add(produit);
            return true;
        } else {
            System.out.println("Capacité maximale atteinte, impossible d'ajouter plus de produits.");
            return false;
        }
    }

    public boolean ajouterEmploye(Employe employe) {
        if (employes.size() < 20) {
            employes.add(employe);
            return true;
        } else {
            System.out.println("Limite maximale des employés atteinte (20 par magasin).");
            return false;
        }
    }

    public void afficherDetails() {
        System.out.println("Magasin ID: " + id);
        System.out.println("Nom: " + nom);
        System.out.println("Adresse: " + adresse);
        System.out.println("Capacité: " + capacite);
        System.out.println("Produits disponibles :");
        for (Produit produit : produits) {
            System.out.println(produit);
        }
        System.out.println("Employés :");
        for (Employe employe : employes) {
            System.out.println(employe);
        }
    }

    public void afficherSalairesEmployes() {
        for (Employe employe : employes) {
            System.out.println("Salaire de " + employe.getNom() + ": " + employe.calculerSalaire() + " DT");
        }
    }

    public void afficherPrimesResponsables() {
        for (Employe employe : employes) {
            if (employe instanceof Responsable) {
                Responsable responsable = (Responsable) employe;
                System.out.println("Prime de " + responsable.getNom() + ": " + responsable.getPrime());
            }
        }
    }
    public ArrayList<Produit> getProduits() {
        return produits;
    }

    public void afficherCaracteristiques() {
        System.out.println("Magasin ID: " + id);
        System.out.println("Nom: " + nom);
        System.out.println("Adresse: " + adresse);
        System.out.println("Capacité: " + capacite);
        System.out.println("Produits:");
        for (Produit produit : produits) {
            System.out.println(produit);
        }
        System.out.println("Employés:");
        for (Employe employe : employes) {
            System.out.println(employe);
        }
    }

    public ArrayList<Employe> getEmployes() {
        return employes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Magasin ID: ").append(id).append("\n");
        sb.append("Nom: ").append(nom).append("\n");
        sb.append("Adresse: ").append(adresse).append("\n");
        sb.append("Capacité: ").append(capacite).append("\n");
        sb.append("Produits :\n");
        for (Produit produit : produits) {
            sb.append(produit).append("\n");
        }
        sb.append("Employés :\n");
        for (Employe employe : employes) {
            sb.append(employe).append("\n");
        }
        return sb.toString();
    }



}
