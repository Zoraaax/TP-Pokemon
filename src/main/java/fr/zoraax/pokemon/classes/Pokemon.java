package fr.zoraax.pokemon.classes;

import java.util.Random;

public class Pokemon extends Creature {
    private int niveau;
    private double pointExperience;
    private double pointExperienceMax;
    private Attaque[] attaques;

    public Pokemon(String nom, int pointDeVie, Type[] type, int niveau, double pointExperience, double pointExperienceMax, Attaque[] attaques) {
        super(nom, pointDeVie, type);
        this.niveau = niveau;
        this.pointExperience = pointExperience;
        this.pointExperienceMax = pointExperienceMax;
        this.attaques = attaques;
    }

    public int getNiveau() {
        return this.niveau;
    }

    public double getPointExperience() {
        return this.pointExperience;
    }

    public double getPointExperienceMax() {
        return this.pointExperienceMax;
    }

    public Attaque[] getAttaques() {
        return this.attaques;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public void setPointExperience(double pointExperience) {
        this.pointExperience = pointExperience;
    }

    public void setPointExperienceMax(double pointExperienceMax) {
        this.pointExperienceMax = pointExperienceMax;
    }

    public void setAttaques(Attaque[] attaques) {
        this.attaques = attaques;
    }

    public void evoluer() {
    }

    public void attaquer(Creature cible, Attaque attaque) {
    }

    public void recevoirDegats(int degats) {
    }

    /**
     * Permet de vérifier si l'attaque est un coup critique
     * @return Booléen - Retourne true si l'attaque est un coup critique
     */
    public boolean coupCritique() {
        Random random = new Random();

        return random.nextInt(100) < 25;
    }

    /**
     * Permet de vérifier si le pokemon esquive l'attaque
     * @return Booléen - Retourne true si le pokemon esquive l'attaque
     */
    public boolean esquive() {
        Random random = new Random();

        return random.nextInt(100) < 10;
    }
}
