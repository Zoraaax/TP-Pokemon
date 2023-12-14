package fr.zoraax.pokemon.classes;

public abstract class Creature {
    protected String nom;
    protected int pointDeVie;
    protected int pointDeVieMax;
    protected Type[] type;

    public Creature(String nom, int pointDeVie, Type[] type) {
        this.nom = nom;
        this.pointDeVie = pointDeVie;
        this.pointDeVieMax = pointDeVie;
        this.type = type;
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

    public Type[] getType() {
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

    public void setType(Type[] type) {
        this.type = type;
    }

    public abstract void attaquer(Creature creature, Attaque attaque);
    public abstract void recevoirDegats(int degats);
    public abstract void coupCritique();
    public abstract void esquive();
}
