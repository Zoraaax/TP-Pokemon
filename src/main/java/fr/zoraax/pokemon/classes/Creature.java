package fr.zoraax.pokemon.classes;

public abstract class Creature {
    protected String nom;
    protected double pointDeVie;
    protected double pointDeVieMax;
    protected Type[] type;

    abstract void attaquer(Creature creature, Attaque attaque);
    abstract void recevoirDegats(int degats);
    abstract void coupCritique();
    abstract void esquive();
}
