package ro.ase.cts.clase;

public class Masa {
    private int nrMasa;
    private int nrLocuri;

    public Masa(int nrMasa, int nrLocuri) {
        this.nrMasa = nrMasa;
        this.nrLocuri = nrLocuri;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }
}
