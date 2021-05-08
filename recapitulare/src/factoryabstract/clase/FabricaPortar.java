package factoryabstract.clase;

public class FabricaPortar implements Factory{
    @Override
    public Jucator creeaza(String nume, int numar) {
        return new Portar(nume, numar);
    }
}
