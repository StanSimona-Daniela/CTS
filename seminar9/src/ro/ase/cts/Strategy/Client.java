package ro.ase.cts.Strategy;

public class Client {
    private String nume;
    private Payable plata;

    public Client(String nume, Payable plata) {
        this.nume = nume;
        this.plata = plata;
    }

    public void setPlata(Payable plata) {
        this.plata = plata;
    }   //la runtime seteze modul de plata
    public void platesteNota(float suma){
        System.out.println("Clientul " + this.nume +" are de realizat o plata.");
        this.plata.pay(suma);
    }

}
