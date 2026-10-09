public class Salle {

    private int etage;
    private String nom;
    private double superficie;

    public Salle(int etage, String nom, double superficie) {
        this.etage = etage;
        this.nom = nom;
        this.superficie = superficie;
    }

    public int getEtage() {
        return etage;
    }

    public String getNom() {
        return nom;
    }

    public double getSuperficie() {
        return superficie;
    }

    @Override
    public String toString() {
        return "Salle{" +
                "etage=" + etage +
                ", nom='" + nom + '\'' +
                ", superficie=" + superficie +
                '}';
    }
}
