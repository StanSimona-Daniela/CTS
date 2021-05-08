package factoryabstract.clase;

public class Fundas  extends Jucator{
    public Fundas(String nume, int numar) {
        super(nume, numar);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fundas{");
        sb.append('}').append(super.toString());
        return sb.toString();
    }
}
