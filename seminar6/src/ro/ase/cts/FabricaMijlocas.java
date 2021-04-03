package ro.ase.cts;

public class FabricaMijlocas implements FabricaJucatori {
    @Override
    public Jucator creazaJucator(String nume, int nrTricou) {
        return new Mijlocas(nume, nrTricou);
    }
}
