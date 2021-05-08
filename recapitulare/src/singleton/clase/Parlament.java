package singleton.clase;

public class Parlament {
    private String tara;
    private int nrParlamentari;
    private int durataMandat;
    private String denumireSediu;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Parlament{");
        sb.append("tara='").append(tara).append('\'');
        sb.append(", nrParlamentari=").append(nrParlamentari);
        sb.append(", durataMandat=").append(durataMandat);
        sb.append(", denumireSediu='").append(denumireSediu).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public void setNrParlamentari(int nrParlamentari) {
        this.nrParlamentari = nrParlamentari;
    }

    public void setDurataMandat(int durataMandat) {
        this.durataMandat = durataMandat;
    }

    public void setDenumireSediu(String denumireSediu) {
        this.denumireSediu = denumireSediu;
    }

    public static void setParlament(Parlament parlament) {
        Parlament.parlament = parlament;
    }

    private static Parlament parlament = new Parlament();

    public static Parlament getInstance(){
        return parlament;
    }

    private Parlament() {
        this.tara= "Tara";
        this.nrParlamentari=0;
        this.durataMandat=0;
        this.denumireSediu= " denumireSediu";

    }

    private Parlament(String tara, int nrParlamentari, int durataMandat, String denumireSediu) {
        this.tara = tara;
        this.nrParlamentari = nrParlamentari;
        this.durataMandat = durataMandat;
        this.denumireSediu = denumireSediu;
    }
}
