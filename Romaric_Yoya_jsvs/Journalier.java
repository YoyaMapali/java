public class Journalier extends Employee {
    private int forfait;
    private int duree;


    public Journalier(){
    }
r
    public Journalier(String nomComplet,
         int id ,int forfait,int duree ){
    
        super(nomCo,id)
       this.forfait=forfait;
       this.duree=duree;
    }
     //redefinition de la methode affiche()

     @Override
     public String affiche(){
     //super signifie personne
     //this signifie etudiant
        return super.affiche() +" forfait : "+forfait 
                      +" duree "+duree;
     }
 
}