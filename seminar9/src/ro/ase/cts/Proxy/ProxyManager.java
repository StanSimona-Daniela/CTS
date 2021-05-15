package ro.ase.cts.Proxy;
//conditionare rezervari
//funcionalitatea exista, dar trebuie conditionata
//adaugare niv intermediar cu conditia impusa


//proxy - has a cu entitate + implementeaza tipul abstract
public class ProxyManager implements Rezervabil{
    private ManagerRezervari managerRezervari;
    private int nrMinimPersoane;

    public ProxyManager(ManagerRezervari managerRezervari, int nrMinimPersoane) {
        this.managerRezervari = managerRezervari;
        this.nrMinimPersoane=nrMinimPersoane;
    }

    //in proxi pun filtrul
    //apelam functionalitatea existenta, daca este respectata conditia
    @Override
    public void rezerva(int nrPersoane) {
        if(nrPersoane>this.nrMinimPersoane){
            this.managerRezervari.rezerva(nrPersoane);
        }else {
            System.out.println("Realizarea nu se poate realiza, puteti veni fara rezervare!");
        }
    }
}
