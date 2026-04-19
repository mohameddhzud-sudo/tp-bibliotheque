package entite;

import java.util.Date;

public class Emprunt {
    private Date dateemprunt;
    private entite.Livre Livre;

    private String lecteur;
    private int delai;

    public Date getDateemprunt() {
        return dateemprunt;
    }

    public void setDateemprunt(Date dateemprunt) {
        this.dateemprunt = dateemprunt;
    }

    public entite.Livre getLivre() {
        return Livre;
    }

    public void setLivre(entite.Livre livre) {
        Livre = livre;
    }

    public String getLecteur() {
        return lecteur;
    }

    public void setLecteur(String lecteur) {
        this.lecteur = lecteur;
    }

    public int getDelai() {
        return delai;
    }

    public void setDelai(int delai) {
        this.delai = delai;
    }

    public int getNblivre() {
        return nblivre;
    }

    public void setNblivre(int nblivre) {
        this.nblivre = nblivre;
    }

    public Emprunt(Date dateemprunt, entite.Livre livre, String lecteur, int delai, int nblivre) {
        this.dateemprunt = dateemprunt;
        Livre = livre;
        this.lecteur = lecteur;
        this.delai = delai;
        this.nblivre = nblivre;

    }

    private int nblivre;
}

