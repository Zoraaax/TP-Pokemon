package fr.zoraax.pokemon.classes;

import java.util.ArrayList;
import java.util.List;

public class Type {
    private String nom;
    private List<Type> faiblesse;
    private List<Type> resistance;

    public Type(String nom, Type[] faiblesse, Type[] resistance) {
        this.nom = nom;
        this.faiblesse = new ArrayList<>();
        this.resistance = new ArrayList<>();
    }

    /**
     * Ajoute une faiblesse au type choisit
     * @param type - Type à ajouter
     */
    public void ajouterFaiblesse(Type type) {
        this.faiblesse.add(type);
    }

    /**
     * Ajoute une résistance au type choisit
     * @param type - Type à ajouter
     */
    public void ajouterResistance(Type type) {
        this.resistance.add(type);
    }

    /**
     * Vérifie si le type est fort contre le type choisit
     * @param type - Type à vérifier
     * @return Booléen - Retourne true si le type est fort contre le type choisit
     */
    public boolean estFaibleContre(Type type) {
        return this.faiblesse.contains(type);
    }

    /**
     * Vérifie si le type est resistant contre le type choisit
     * @param type - Type à vérifier
     * @return Booléen - Retourne true si le type est resistant contre le type choisit
     */
    public boolean estResistantContre(Type type) {
        return this.resistance.contains(type);
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Type> getFaiblesse() {
        return this.faiblesse;
    }

    public void setFaiblesse(List<Type> faiblesse) {
        this.faiblesse = faiblesse;
    }

    public List<Type> getResistance() {
        return this.resistance;
    }

    public void setResistance(List<Type> resistance) {
        this.resistance = resistance;
    }
}
