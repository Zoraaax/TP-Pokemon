package fr.zoraax.pokemon.classes;

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

    public void coupCritique() {
    }

    public void esquive() {
    }
}
