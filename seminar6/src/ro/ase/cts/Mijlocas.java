package ro.ase.cts;

public class Mijlocas extends Jucator{

    public Mijlocas(String nume, int nrTricou) {
        super(nume, nrTricou);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mijlocas{");
        sb.append('}').append(super.toString());
        return sb.toString();
    }
}
