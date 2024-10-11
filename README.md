# Prosit 4: Programmation Orientée Objet (JAVA)

## Objectif : Gestion des Employés et des Magasins

Ce projet vise à étendre la gestion des produits d'un magasin en incluant maintenant la gestion des employés. Chaque magasin peut contenir jusqu'à 20 employés, répartis en trois catégories :

- **Caissier** : identifié par un `numeroDeCaisse`
- **Vendeur** : identifié par un `tauxDeVente`
- **Responsable** : identifié par une `prime`

Chaque employé possède également un identifiant, un nom, une adresse et un nombre d'heures travaillées par mois.

## Fonctionnalités

1. **Création des magasins** :
   - Magasin 1 : "Carrefour", situé à "Centre-Ville"
   - Magasin 2 : "Monoprix", situé à "Menzah 6"

2. **Gestion des employés** :
   - Ajouter 2 caissiers, un vendeur et un responsable pour le premier magasin.
   - Ajouter un caissier, 3 vendeurs et un responsable pour le deuxième magasin.
   - Afficher les caractéristiques des employés créés.

3. **Gestion des produits** :
   - Ajouter quelques produits pour chaque magasin.
   - Afficher tous les détails de chaque magasin (id, nom, adresse, capacité, produits et employés).

4. **Calcul des salaires** :
   - Les responsables : Salaire = (nombre d'heures * 10 DT) + prime + 20% pour les heures supplémentaires (au-delà de 160 heures).
   - Les caissiers : Salaire = nombre d'heures * 5 DT + 15% pour les heures supplémentaires (au-delà de 180 heures).
   - Les vendeurs : Salaire = 450 DT * taux_de_vente (%).

5. **Affichage des primes** :
   - Afficher la prime de tous les responsables dans le magasin.

6. **Affichage des salaires** :
   - Afficher le salaire de tous les employés dans le magasin.

7. **Méthode `toString()`** :
   - Afficher tous les employés avec la méthode `toString()`.

8. **Comparaison d'employés** :
   - Ajouter dans la classe `Employe` une méthode `equals(Object o)` pour comparer deux employés sur la base de leur identifiant, nom, adresse et nombre d'heures travaillées.

## Méthodes Principales

### Main

- Créer deux magasins.
- Ajouter des employés à ces magasins.
- Ajouter des produits à chaque magasin.
- Calculer et afficher les salaires.
- Afficher tous les employés et leurs caractéristiques.

### Classe Employé

- Comparer deux employés en utilisant la méthode `equals()`.
  
```java
public boolean equals(Object o) {
  // Comparaison des employés sur l'id, le nom, l'adresse et le nombre d'heures
}
