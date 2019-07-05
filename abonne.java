/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td1_poo;

/**
 *
 * @author Asus
 */
public class abonne {
    private int numero_identite;
    private String nom;
    private int numero_abo;
    private ouvrage ouvrage;

    public abonne() {
        
    this.numero_identite = 0;
    this.nom = "";
    this.numero_abo = 0;
    this.ouvrage = null;
    
    }
    

    public abonne(int numero_identite, String nom, int numero_abo, ouvrage ouvrage) {
        this.numero_identite = numero_identite;
        this.nom = nom;
        this.numero_abo = numero_abo;
        this.ouvrage = ouvrage;
    }
     public String toString()
     {
    return "l'abonne s'intitule "+nom+" son numreo d'abonnement est "+numero_abo;
     }
    public int getNumero_identite() {
        return numero_identite;
    }

    public String getNom() {
        return nom;
    }

    public int getNumero_abo() {
        return numero_abo;
    }

    public ouvrage getOuvrage() {
        return ouvrage;
    }

    public void setNumero_identite(int numero_identite) {
        this.numero_identite = numero_identite;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNumero_abo(int numero_abo) {
        this.numero_abo = numero_abo;
    }

    public void setOuvrage(ouvrage ouvrage) {
        this.ouvrage = ouvrage;
    }
    
    
  
    
}
