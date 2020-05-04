 public class Carre{
     
           //Attributs Instances
            private double longueur; 
          //Attributs classe ou Attributs static
            private static String unite;
          

            //Constructeur => methode instance concrete
              public Carre(){
			}

              //metiers=>UC
		public abstract double demiPerimetre() ;

                public double perimetre(){
                     longueur *2;
                }
                public double surface(){
                 longueur * longueur;
                }
                public double diagonale(){
                sqrt(pow(longueur,2)+pow(longueur,2));
                }
              
  }