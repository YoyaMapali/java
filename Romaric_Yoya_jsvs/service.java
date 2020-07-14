public class service implements IService {

    private static int next = 0;
    private int id = 0;
    private String libel;

    private Service[] services;


    public Service(String libel){
        
        Service.next += 1;
        this.id = Service.next;
        this.libel = String.valueOf(Service.next);
    }

    public void affiche(){

    }


    public void AjouterService(Service service){
        
        services[this.id - 1] = service;

    }

    public void listerService(){

        for(Service service : service){
            
            service.affiche();
        }
    }

}