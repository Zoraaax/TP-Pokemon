package fr.zoraax.pokemon.classes;

import java.util.ArrayList;
import java.util.List;

public abstract class Creature {
    protected String nom;
    protected int pointDeVie;
    protected int pointDeVieMax;
    protected List<Type> type;

    public Creature(String nom, int pointDeVie, Type[] type) {
        this.nom = nom;
        this.pointDeVie = pointDeVie;
        this.pointDeVieMax = pointDeVie;
        this.type = new ArrayList<>();
    }

    public String getNom() {
        return this.nom;
    }

    public int getPointDeVie() {
        return this.pointDeVie;
    }

    public int getPointDeVieMax() {
        return this.pointDeVieMax;
    }

    public List<Type> getType() {
        return this.type;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPointDeVie(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }

    public void setPointDeVieMax(int pointDeVieMax) {
        this.pointDeVieMax = pointDeVieMax;
    }

    public void setType(List<Type> type) {
        this.type = type;
    }

    public abstract void attaquer(Creature creature, Attaque attaque);
    public abstract void recevoirDegats(int degats);
    public abstract boolean coupCritique();
    public abstract boolean esquive();
}
