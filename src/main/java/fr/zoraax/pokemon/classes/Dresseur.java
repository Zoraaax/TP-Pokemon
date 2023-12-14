package fr.zoraax.pokemon.classes;

public class Dresseur {
    private String nom;
    private Pokeball[] pokeballs;

    public Dresseur(String nom, Pokeball[] pokeballs) {
        this.nom = nom;
        this.pokeballs = pokeballs;
    }

    public String getNom() {
        return this.nom;
    }

    public Pokeball[] getPokeballs() {
        return this.pokeballs;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPokeballs(Pokeball[] pokeballs) {
        this.pokeballs = pokeballs;
    }

    public Pokemon choisirPokemon() {
        return null;
    }

    public void donnerOrdreAttaque(Pokemon pokemon, Attaque attaque) {

    }
}
