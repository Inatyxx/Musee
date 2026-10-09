public class Musee {
    private final String nom;

    Musee(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return this.nom;
    }

    @Override
    public String toString() {
        return "Musee{" +
                "nom='" + nom + '\'' +
                '}';
    }
}