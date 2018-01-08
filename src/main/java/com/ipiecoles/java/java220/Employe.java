package com.ipiecoles.java.java220;


import org.joda.time.LocalDate;

import java.util.Objects;

/**
 * Created by pjvilloud on 21/09/17.
 */
public abstract class Employe {

    //Exercice 2 :


    public abstract Double getPrimeAnnuelle ();


    //Exercice 3 :
    private String nom;
    private String prenom;
    private String matricule;
    private LocalDate dateEmbauche;
    private Double salaire;


    public String getNom() {
        return nom;
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

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }


    public Double getSalaire() {
        return salaire;
    }


    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }

    //Exercice 4 :
    public Employe () {
        }

    public Employe(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.dateEmbauche = dateEmbauche;
        this.salaire = salaire;
    }

    //Exercice 5 :
    public final Integer getNombreAnneeAnciennete () {
        return LocalDate.now().getYear() - dateEmbauche.getYear();
    }

    //Exercice 6 :
    public void setDateEmbauche (LocalDate dateEmbauche) throws Exception {
        this.dateEmbauche = dateEmbauche;
        if (getDateEmbauche().isAfter(LocalDate.now()))
            throw new Exception("La date d'embauche ne peut être postérieure à la date courante");
    }

    //Exercice 7 :
    public Integer getNbConges () {
        return Entreprise.NB_CONGES_BASE;
    }

    //Exercice 8 :

    @Override
    public String toString (){
        return "Employe{"
            + "nom='" + nom +"', prenom='" + prenom + "', matricule='" + matricule
            + "', dateEmbauche=" + dateEmbauche + ", salaire=" + salaire
            + "}";
    }

    //Exercice 9 :

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null) return false;
            if (getClass() != o.getClass()) return false;
            Employe e = (Employe) o;
            return  Objects.equals(nom, e.nom) &&
                    Objects.equals(prenom, e.prenom) &&
                    Objects.equals(matricule, e.matricule) &&
                    Objects.equals(dateEmbauche, e.dateEmbauche)&&
                    Double.compare(salaire, e.salaire) == 0;
        }

    //Exercice 10 :
    public int hashCode() {
        return Objects.hash(nom, prenom, matricule, dateEmbauche, salaire);
    }

    //Exercice 11 :
    public void augmenterSalaire (Double augmentation) {
        this.salaire = this.salaire * (1 + augmentation);
    }

}
