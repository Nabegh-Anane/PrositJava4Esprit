package tn.tuniprob.gestionmagasin;

import java.util.Date;

public class GestionMagasins {

    public static void main(String[] args) {
        Date date1 = new Date(2024 - 1900, 9, 30);
        Produit produit1 = new Produit(1021, "Lait", "Delice", 0.7, date1);
        Produit produit2 = new Produit(2510, "Yaourt", "Vitalait", 0.5, date1);

        Magasin magasin1 = new Magasin(1, "Carrefour", "123 Rue de Carrefour", 50);
        Magasin magasin2 = new Magasin(2, "Monoprix", "456 Rue de Monoprix", 100);

        magasin1.ajouterProduit(produit1);
        magasin2.ajouterProduit(produit2);

        Caissier caissier1 = new Caissier(101, "Ali", "Tunis", 190, 1);
        Vendeur vendeur1 = new Vendeur(102, "Mourad", "Sousse", 160, 0.95);
        Responsable responsable1 = new Responsable(103, "Hichem", "Tunis", 170, 200);

        magasin1.ajouterEmploye(caissier1);
        magasin1.ajouterEmploye(vendeur1);
        magasin1.ajouterEmploye(responsable1);

        magasin1.afficherCaracteristiques();
        magasin1.afficherSalairesEmployes();
        magasin1.afficherPrimesResponsables();
    }
}
