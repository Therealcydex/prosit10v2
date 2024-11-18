package com.example.departements;

public class Main {
    public static void main(String[] args) {
        DepartementHashSet gestionDepartement = new DepartementHashSet();

        // Creating departments
        Departement dep1 = new Departement(1, "IT", 100);
        Departement dep2 = new Departement(2, "HR", 50);
        Departement dep3 = new Departement(3, "Marketing", 20);

        // Adding departments
        gestionDepartement.ajouterDepartement(dep1);
        gestionDepartement.ajouterDepartement(dep2);
        gestionDepartement.ajouterDepartement(dep3);

        // Display all departments
        System.out.println("Liste des départements :");
        gestionDepartement.displayDepartement();

        // Search by name
        System.out.println("Recherche par nom (IT) : " + gestionDepartement.rechercherDepartement("IT"));

        // Remove a department
        gestionDepartement.supprimerDepartement(dep2);

        // Display all departments after removal
        System.out.println("Liste des départements après suppression :");
        gestionDepartement.displayDepartement();

        // Sorting departments by ID
        System.out.println("Départements triés par ID :");
        gestionDepartement.trierDepartementById().forEach(System.out::println);
    }
}
