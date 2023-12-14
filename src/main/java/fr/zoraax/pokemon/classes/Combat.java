package fr.zoraax.pokemon.classes;

import fr.zoraax.pokemon.interfaces.Tour;

public class Combat implements Tour {
    private Dresseur dresseur1;
    private Dresseur dresseur2;
    private Arene arene;

    public Combat(Dresseur dresseur1, Dresseur dresseur2, Arene arene) {
        this.dresseur1 = dresseur1;
        this.dresseur2 = dresseur2;
        this.arene = arene;
    }

    public Dresseur getDresseur1() {
        return dresseur1;
    }

    public void setDresseur1(Dresseur dresseur1) {
        this.dresseur1 = dresseur1;
    }

    public Dresseur getDresseur2() {
        return dresseur2;
    }

    public void setDresseur2(Dresseur dresseur2) {
        this.dresseur2 = dresseur2;
    }

    public Arene getArene() {
        return arene;
    }

    public void setArene(Arene arene) {
        this.arene = arene;
    }

    @Override
    public void demarrerCombat() {

    }

    @Override
    public void tourDeJeu() {

    }

    @Override
    public void finirCombat() {

    }
}
