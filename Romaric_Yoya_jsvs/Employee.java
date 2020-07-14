public abstract class Employee implements Iservice{
    
        private String  nomCo;
        private int id;
        
        public Employe(String nomCo){
            this.nomCo = nomCo;
            
            
        }
     public String getNomC() { return nomCo;}
        public int getId() { return id;}

        
        public Employee(int id){
            //Initialisé ID
        }
}

@Override
public String affiche(){
return "Id: "+id+" Nom et Prenom : "+nomCo;
}



static void ajoutEmployee()
{
String rep;
do
{
oe = new Employee();
oe.saisirValeur();
Employee.add(oe);

System.out.println("Voulez vous ajouter un autre employe oui/non: ");
rep = sc.next();

}while(rep.equals("oui"));
}

