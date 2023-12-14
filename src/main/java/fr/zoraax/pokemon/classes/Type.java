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

    /**
     * Ajoute une faiblesse au type choisit
     * @param type - Type à ajouter
     */
    public void ajouterFaiblesse(Type type) {
        Type[] faiblesse = this.getFaiblesse();
        faiblesse[faiblesse.length] = type;
        this.setFaiblesse(faiblesse);
    }

    /**
     * Ajoute une résistance au type choisit
     * @param type - Type à ajouter
     */
    public void ajouterResistance(Type type) {
        Type[] resistance = this.getResistance();
        resistance[resistance.length] = type;
        this.setResistance(resistance);
    }

    /**
     * Vérifie si le type est fort contre le type choisit
     * @param type - Type à vérifier
     * @return Booléen - Retourne true si le type est fort contre le type choisit
     */
    public boolean estFaibleContre(Type type) {
        for (Type faiblesse : this.getFaiblesse()) {
            if (faiblesse == type) {
                return true;
            }
        }
        return false;
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
