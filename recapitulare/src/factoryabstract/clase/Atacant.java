package factoryabstract.clase;

public class Atacant extends Jucator{
    public Atacant(String nume, int numar) {
        super(nume, numar);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Atacant{");
        sb.append('}').append(super.toString());
        return sb.toString();
    }
}
