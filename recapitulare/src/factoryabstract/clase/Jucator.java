package factoryabstract.clase;

public abstract class Jucator {
    private String nume;
    private int numar;

    public Jucator(String nume, int numar) {
        this.nume = nume;
        this.numar = numar;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Jucator{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", numar=").append(numar);
        sb.append('}');
        return sb.toString();
    }
}
