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
public class Td1_poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bibliotheque bib =new bibliotheque();
        ouvrage o=new livre("le rouge et le noir","31-11-1830","stendhal");
        abonne a=new abonne(00121,"khawla",0012,null);
        bib.AjoutAbonne(a);// ajouter un abonne 
        bib.AjoutOuvrage(o);// ajouter un ouvrage
        bib.Emprunter("le rouge et le noir",00121);//emprunter le livre à l'abonné 
        bib.info();
        
        
    }
    
}
