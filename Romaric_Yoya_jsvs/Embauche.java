public class Embauche extends Employee  {

    private int salaire;
    private int datEm;


    public Embauche(){
    }
r
    public Embauche(String nomComplet,
         int id ,int salaire,int datEm ){
    
        super(nomCo,id)
       this.salaireait=salaire;
       this.datEm=datEm;
    }

     @Override
     public String affiche(){
    
        return super.affiche() +" salaire : "+salaire 
                      +" date "+datEm
}

