package tn.tuniprob.gestionmagasin;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Produit {
    private int id;
    private String lib;
    private String brand;
    private double price;
    private Date dateExpiration;

    public Produit(int id, String lib, String brand, double price, Date dateExpiration) {
        this.id = id;
        this.lib = lib;
        this.brand = brand;
        this.setPrice(price);
        this.dateExpiration = dateExpiration;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Le prix ne peut pas être négatif.");
            this.price = 0.0;
        }
    }

    public double getPrice() {
        return price;
    }

    public void afficher() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Identifiant : " + id);
        System.out.println("Libellé : " + lib);
        System.out.println("Marque : " + brand);
        System.out.println("Prix : " + price);
        System.out.println("Date d'expiration : " + sdf.format(dateExpiration));
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Produit [ID=" + id + ", Libellé=" + lib + ", Marque=" + brand + ", Prix=" + price + ", Date d'expiration=" + sdf.format(dateExpiration) + "]";
    }

    public boolean comparer(Produit p) {
        return this.id == p.id && this.lib.equals(p.lib) && this.price == p.price;
    }

    public static boolean comparer(Produit p1, Produit p2) {
        return p1.id == p2.id && p1.lib.equals(p2.lib) && p1.price == p2.price;
    }
}
