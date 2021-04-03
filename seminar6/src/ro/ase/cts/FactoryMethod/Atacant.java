package ro.ase.cts.FactoryMethod;

public class Atacant extends Jucator{
    public Atacant(String nume, int nrTricou) {
        super(nume, nrTricou);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Atacant{");
        sb.append('}').append(super.toString());
        return sb.toString();
    }



}
