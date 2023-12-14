package fr.zoraax.pokemon.classes;

public class Arene {
    private String nom;
    private String localisation;

    public Arene(String nom, String localisation) {
        this.nom = nom;
        this.localisation = localisation;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLocalisation() {
        return this.localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }
}
