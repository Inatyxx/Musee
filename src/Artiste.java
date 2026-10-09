import java.time.LocalDate;
import java.util.Date;

public class Artiste {

    private String nom;
    private String prenom;
    private String nationalite;
    private LocalDate dateDeNaissance;

    public Artiste(String prenom) {
        this.prenom = prenom;
        this.nationalite = "inconnu";
    }

    public Artiste(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
        this.nationalite = "inconnu";
    }

    public Artiste(String prenom, String nom, String nationalite) {
        this.prenom = prenom;
        this.nom = nom;
        this.nationalite = nationalite;
    }

    public Artiste(LocalDate dateDeNaissance, String nationalite, String nom, String prenom) {
        this.dateDeNaissance = dateDeNaissance;
        this.nationalite = nationalite;
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNationalite() {
        return nationalite;
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    @Override
    public String toString() {
        return "Artiste{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nationalite='" + nationalite + '\'' +
                ", dateDeNaissance=" + dateDeNaissance +
                '}';
    }
}
