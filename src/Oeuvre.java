public class Oeuvre {

    private final String nom;
    private final int annee;
    private final double largeur;
    private final double hauteur;


    public Oeuvre(String nom, int annee, double largeur, double hauteur) {
        this.nom = nom;
        this.annee = annee;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public String getNom() {
        return nom;
    }

    public int getAnnee() {
        return annee;
    }

    public double getLargeur() {
        return largeur;
    }

    public double getHauteur() {
        return hauteur;
    }

    @Override
    public String toString() {
        return "Oeuvre{" +
                "nom='" + nom + '\'' +
                ", annee=" + annee +
                ", largeur=" + largeur +
                ", hauteur=" + hauteur +
                '}';
    }
}
