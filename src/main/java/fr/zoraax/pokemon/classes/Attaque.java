package fr.zoraax.pokemon.classes;

public class Attaque {
    private String nom;
    private Type type;
    private int puissanceMin;
    private int puissanceMax;

    public Attaque(String nom, Type type, int puissanceMin, int puissanceMax) {
        this.nom = nom;
        this.type = type;
        this.puissanceMin = puissanceMin;
        this.puissanceMax = puissanceMax;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getPuissanceMin() {
        return puissanceMin;
    }

    public void setPuissanceMin(int puissanceMin) {
        this.puissanceMin = puissanceMin;
    }

    public int getPuissanceMax() {
        return puissanceMax;
    }

    public void setPuissanceMax(int puissanceMax) {
        this.puissanceMax = puissanceMax;
    }
}
