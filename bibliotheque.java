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

public class bibliotheque {
    static int max=100;// nombre maximum d'ouvrages et d'abonnes
    static int nombre_ouvrage=0;// variable static qui permet de compter le nombre d'ouvrages dans le tableau
    static int nombre_abonne=0;// varaible static pour compter nombre d'abonnes
    private ouvrage [] ouvrages;
    private abonne[] abonnes ;

    public bibliotheque() {
        ouvrages=new ouvrage[max];
         abonnes=new abonne[max];
       
    }

    public bibliotheque(ouvrage[] ouvrages, abonne[] abonnes) {
        this.ouvrages = ouvrages;
        this.abonnes = abonnes;
    }
    public boolean AjoutOuvrage(ouvrage o)
    {
    boolean existe=false;
    int i=0;
    while(existe==false && i<nombre_ouvrage)
    {
    if (ouvrages[i].getTitre()==o.getTitre())
    {
    existe=true ;
    
    }
    else
        i++;
    
    }
    if (existe==true)
        return false;
    else
    {
        ouvrages[nombre_ouvrage]=o;// insere le nouveau ouvrage au tableau
        nombre_ouvrage++;// incrementer le nombre d'ouvrage
        return true ;// true car l'ajout s'effectue avec succe
    }  
    }
    public ouvrage GetOuvrage (String titre)// permet de retourner un ouvrage ,s'il n'existe pas alors retourner null
    {
    ouvrage o=null;    
    boolean existe=false;
    int i=0;
    while(existe==false && i<nombre_ouvrage)
    {
    if (ouvrages[i].getTitre()==titre)
    {
    existe=true ;
    o=ouvrages[i];
    return o;
    }
    else
        i++;
    
    }
    return o;
    }
    public boolean AjoutAbonne(abonne a)
    {
      
    boolean existe=false;
    int i=0;
    while(existe==false && i<nombre_abonne)
    {
    if (abonnes[i].getNumero_identite()==a.getNumero_identite())
    {
     existe=true ;
    
    }
    else
        i++;
    
    }
    if (existe==true)
        return false;
    else
    {
        abonnes[nombre_abonne]=a; // insere le nouveau abonne au tableau
        nombre_abonne++; // incrementer le nombre d'abonnements
        return true ;// true car l'ajout s'effectuer avec succe
    } 
    
    
    
    }
    public abonne GetAbonne(int num_id)
    {
    abonne a=null;    
    boolean existe=false;
    int i=0;
    while(existe==false && i<nombre_abonne)
    {
    if (abonnes[i].getNumero_identite()==num_id)// comparison avec le numero d'id
    {
    existe=true ;
    a=abonnes[i];// on a trouvé l'abonné cherché et on va le  retourner 
    return a;
    }
    else
        i++;
    
    }
    return a;
 
    }
    public boolean disponible (String titre)// teste si l ouvrage est disponible ou pas
    {
    ouvrage o =new ouvrage();
    o=GetOuvrage(titre);
    if (o.getExiste()==true)
    {return true ;
    }
    return false;
    }
    public boolean libre  (int id )// teste si l abonne n'a pas d'ouvrage
    {
    abonne a =new abonne();
    a=GetAbonne(id);
    if (a.getOuvrage()==null)
    {return true ;
    }
    return false;
    }
    public boolean Emprunter(String titre , int num_id)
    {
    if (disponible (titre)==true && libre(num_id) == true)// verfier que l abonne n'a pas des ouvrages emprunté et que l'emprunt est diponible
    {
    ouvrage o=GetOuvrage(titre);
    o.setExiste(false);// changer l'etat de l'ouvrage 
    abonne a=GetAbonne(num_id);// affecter l ouvrage au abonne correspondant
    a.setOuvrage(o);
    return true; // l emprunt s'effectue avec succe
    }
    else
    {
    
    return false; // càd n'est pas disponible 
    
    }
    }
    public void rendre (int num_id)
    {
    abonne a=GetAbonne(num_id);
    ouvrage o=GetOuvrage(a.getOuvrage().getTitre());// recuperer l ouvrage 
    o.setExiste(true);// rendre l'ouvrage disponible
    a.setOuvrage(null);// supprimer l'emprunt
    
    }
    public void info()
    {
    for(int i=0;i<nombre_ouvrage;i++)
    {
        System.out.println(ouvrages[i]);// Rq : on a déja implementer la méthode tostring() qui permet l'affichage
    
    }
    for (int i=0;i<nombre_abonne;i++)
    {
    if (abonnes[i].getOuvrage()!=null)
    {
    System.out.println(abonnes[i]);// Rq: on a déja implementer la methode tostring()pour l'abonne
    
    }
    
    
    }
    
    
    
    }
    
    
    public ouvrage[] getOuvrages()
    {
        return ouvrages;
    }

    public abonne[] getAbonnes() {
        return abonnes;
    }

    public void setOuvrages(ouvrage[] ouvrages) {
        this.ouvrages = ouvrages;
    }

    public void setAbonnes(abonne[] abonnes) {
        this.abonnes = abonnes;
    }
    
    
    
}
