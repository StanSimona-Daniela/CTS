package ro.ase.cts;

public class Fundas extends Jucator{
    public Fundas(String nume, int nrTricou) {
        super(nume, nrTricou);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fundas{");
        sb.append('}').append(super.toString());
        return sb.toString();
    }
}
