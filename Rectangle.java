public class Rectange{



 //Attributs Instances
            private double largeur;
		private double longueur 
          //Attributs classe ou Attributs static
	    private static String unite;

            //Constructeur => methode instance concrete
              public Rectange(){
				}
               
              //Getters  methodes instances concretes
           
              public double getLargeur(){
                return this.largeur;
             }
		  public double getLongueur(){
                return this.longueur;
             }
             //setters  methodes instances concretes
              public double setLargeur(double largeur){
                 this.largeur=largeur;
              }
		 public double setLongueur(double longueur){
                 this.longueur=longueur;
              }
             
              //Getters Setters  methodes static concretes
	 public static String getUnite(){
          return unite;
     	}

	     public static void setUnite(String unite){
            Figure.unite=unite;
     }
		
            

              //metiers=>UC
              //Redefinition
                public double demiPerimetre(){
                     longueur + largeur;
                }
              
                public double surface(){
                  longueur * largeur;
                }
                public double diagonale(){
                  return sqrt(pow(longueur,2)+pow(largeur,2));
                }
              }