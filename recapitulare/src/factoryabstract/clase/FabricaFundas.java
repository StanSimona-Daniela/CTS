package factoryabstract.clase;

public class FabricaFundas implements Factory{
    @Override
    public Jucator creeaza(String nume, int numar) {
        return new Fundas(nume, numar);
    }
}
