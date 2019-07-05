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
public class vedio extends ouvrage{
    private String editeur;
    private float duree;

    public vedio() {
        super();
        this.editeur = "";
        this.duree = 0;
    }

    public vedio(String editeur, float duree, String titre, String date_creation) {
        super(titre, date_creation);
        this.editeur = editeur;
        this.duree = duree;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public void setDuree(float duree) {
        this.duree = duree;
    }

    public String getEditeur() {
        return editeur;
    }

    public float getDuree() {
        return duree;
    }
    
    
}
