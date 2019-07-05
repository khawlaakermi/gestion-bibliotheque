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
public class ouvrage {
    
    private String titre ;
    private String date_creation;
    private boolean existe;
    public ouvrage()
    {
    titre="";
    date_creation="";
    existe=false;
    
    }
    public ouvrage(String titre, String date_creation) {
        this.titre = titre;
        this.date_creation = date_creation;
        this.existe = true;
    }
public String toString() // permet l'affichage d'un ouvrage 
{
return "l'ouvrage s'intitule  "+titre +" creé le  "+date_creation ;


}
    public String getTitre() {
        return titre;
    }

    public String getDate_creation() {
        return date_creation;
    }

    public boolean getExiste() {
        return existe;
    }

    

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDate_creation(String date_creation) {
        this.date_creation = date_creation;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
    }

  
    
    
    
}
