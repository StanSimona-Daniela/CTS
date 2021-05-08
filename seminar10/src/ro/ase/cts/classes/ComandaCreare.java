package ro.ase.cts.classes;

public class ComandaCreare extends ComandaAbstracta{
    public ComandaCreare(Executant executant, float suma) {
        super(executant, suma);
    }

    @Override
    public void executa() {
        super.getExecutant().creeazaCont(super.getSuma());
    }
}
