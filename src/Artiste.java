import java.time.LocalDate;
import java.util.Date;

public class Artiste {

    private String prenom;
    private String nom;
    private String nationalite;
    private LocalDate dateDeNaissance;

    Artiste(String nom) {
        this.nom = nom;
        this.prenom = "inconnu";
        this.nationalite = "inconnu";
    }
}
