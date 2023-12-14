package fr.zoraax.pokemon.classes;

public class Type {
    private String nom;
    private Type[] faiblesse;
    private Type[] resistance;

    public Type(String nom, Type[] faiblesse, Type[] resistance) {
        this.nom = nom;
        this.faiblesse = faiblesse;
        this.resistance = resistance;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Type[] getFaiblesse() {
        return this.faiblesse;
    }

    public void setFaiblesse(Type[] faiblesse) {
        this.faiblesse = faiblesse;
    }

    public Type[] getResistance() {
        return this.resistance;
    }

    public void setResistance(Type[] resistance) {
        this.resistance = resistance;
    }
}
