public class Personne {
    private String nom ;
    private String prénom ;

    public void direBonjour() {
        System.out.println("Bonjour, je m'appelle " + this.nom + " " + this.prénom);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }
}
