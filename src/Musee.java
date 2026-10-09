public class Musee {
    private final String nom;

    Musee(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Musee{" +
                "nom='" + nom + '\'' +
                '}';
    }

    String getNom() {
        return this.nom;
    }
}
