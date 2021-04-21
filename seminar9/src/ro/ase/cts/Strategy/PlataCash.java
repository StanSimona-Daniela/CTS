package ro.ase.cts.Strategy;

public class PlataCash implements Payable{
    @Override
    public void pay(float suma) {
        System.out.println("A folosit o plata cash in valoare de " + suma +" lei");
    }
}
