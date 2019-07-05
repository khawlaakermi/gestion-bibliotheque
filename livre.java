/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td1_poo;

import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class livre extends ouvrage {
    
    private String auteur;
    public livre()
    {
    super();
    this.auteur = "";
    }

    public livre(String titre, String date_creation, String auteur) {
        super(titre,date_creation);
        this.auteur = auteur;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
  
}
