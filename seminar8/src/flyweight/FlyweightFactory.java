package flyweight;

import java.util.HashMap;
import java.util.Map;
//manager care gestioneaza, avem un map.. cu cheie string
public class FlyweightFactory {
    private Map<String, FlyweightAbstract> clienti;

    public FlyweightFactory() {
        this.clienti = new HashMap<>();
    }

    //cauta dupa cheie, nu creeaza nou ob ci il iau din map si returrnez, altfel il creez
    public FlyweightAbstract getClient(String nrTelefon){
         FlyweightAbstract client = clienti.get(nrTelefon);
         if(client == null){ //zi mi numele si mail ul
             client= new Client("Gigel", nrTelefon, "orice@gmail.com");
             clienti.put(nrTelefon, client);
         }
         return client;
    }
}
