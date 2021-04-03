package ro.ase.cts;

public class FabricaPortar implements FabricaJucatori{
    @Override
    public Jucator creazaJucator(String nume, int nrTricou) {
        return new Portar(nume,nrTricou);
    }
}
