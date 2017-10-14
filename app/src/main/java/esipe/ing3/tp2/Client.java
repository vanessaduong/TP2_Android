package esipe.ing3.tp2;

import android.graphics.drawable.Drawable;

import java.io.Serializable;
import java.util.Date;


/**
 * Created by van.duong on 05/10/2017.
 */

public class Client implements Serializable{
    private String nom;
    private String prenom;
    private String sexe;
    private String email;
    private Date birthdate;
    private String niveau;
    private String actif;
    private int image;

    public Client(String nom, String prenom, String sexe, String email, Date birthdate, String niveau, String actif, int image) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.email = email;
        this.birthdate = birthdate;
        this.niveau = niveau;
        this.actif = actif;
        this.image = image;
    }

    public Client(){}

    public String getNom() {
        return nom;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getActif() {
        return actif;
    }

    public void setActif(String actif) {
        this.actif = actif;
    }
}
