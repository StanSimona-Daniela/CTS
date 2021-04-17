package flyweight;

public class Rezervare {
    private int nrRezervare;
    private int nrMasa;

    public Rezervare(int nrRezervare, int nrMasa) {
        this.nrRezervare = nrRezervare;
        this.nrMasa = nrMasa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nrRezervare=").append(nrRezervare);
        sb.append(", nrMasa=").append(nrMasa);
        sb.append('}');
        return sb.toString();
    }
}
