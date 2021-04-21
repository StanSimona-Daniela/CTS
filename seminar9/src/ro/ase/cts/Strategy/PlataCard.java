package ro.ase.cts.Strategy;

public class PlataCard implements Payable{
    @Override
    public void pay(float suma) {
        System.out.println("A folosit o plata card in valoare de " + suma +" lei");
    }
}
