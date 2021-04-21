package ro.ase.cts.Program;

import ro.ase.cts.Proxy.ManagerRezervari;
import ro.ase.cts.Proxy.ProxyManager;

public class Main {
    public static void main(String[] args) {
        ManagerRezervari managerRezervari = new ManagerRezervari("AAA");
        managerRezervari.rezerva(2);
        ProxyManager proxyManager= new ProxyManager(managerRezervari, 4);
        proxyManager.rezerva(2);

        proxyManager.rezerva(6);
    }
}