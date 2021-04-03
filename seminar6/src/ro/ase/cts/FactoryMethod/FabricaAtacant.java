package ro.ase.cts.FactoryMethod;

public class FabricaAtacant implements FabricaJucatori{
    @Override
    public Jucator creazaJucator(String nume, int nrTricou) {
        return new Atacant(nume, nrTricou);
    }
}
