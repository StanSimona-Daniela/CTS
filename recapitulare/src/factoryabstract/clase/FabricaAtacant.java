package factoryabstract.clase;

public class FabricaAtacant implements Factory{
    @Override
    public Jucator creeaza(String nume, int numar) {
        return new Atacant(nume, numar);
    }
}
