package factoryabstract.clase;

public class Portar extends Jucator {
    public Portar(String nume, int numar) {
        super(nume, numar);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Portar{");
        sb.append('}').append(super.toString());
        return sb.toString();
    }
}
