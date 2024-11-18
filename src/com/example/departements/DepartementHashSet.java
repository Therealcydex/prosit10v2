package com.example.departements;

import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {
    private HashSet<Departement> departements = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement t) {
        if (departements.add(t)) {
            System.out.println("Département ajouté : " + t);
        } else {
            System.out.println("Département existe déjà : " + t);
        }
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        return departements.stream().anyMatch(dep -> dep.getNom().equalsIgnoreCase(nom));
    }

    @Override
    public boolean rechercherDepartement(Departement t) {
        return departements.contains(t);
    }

    @Override
    public void supprimerDepartement(Departement t) {
        if (departements.remove(t)) {
            System.out.println("Département supprimé : " + t);
        } else {
            System.out.println("Département introuvable : " + t);
        }
    }

    @Override
    public void displayDepartement() {
        departements.forEach(System.out::println);
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> sorted = new TreeSet<>((d1, d2) -> d1.getId() - d2.getId());
        sorted.addAll(departements);
        return sorted;
    }
}
