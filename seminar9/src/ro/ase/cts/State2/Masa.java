package ro.ase.cts.State2;

public class Masa {
    private int nrMasa;
    private Stare stare;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
        this.stare = new StareLibera();
    }

     void setStare(Stare stare) {
        this.stare = stare;
    }

    public Stare getStare() {
        return stare;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public void ocupaMasa(){
        StareOcupata stareOcupata = new StareOcupata();
        stareOcupata.modificaState(this);
    }
    public void elibereazaMasa(){
        StareLibera stareLibera= new StareLibera();
        stareLibera.modificaState(this);
    }
    public void rezervaMasa(){
        StareRezervata stareRezervata= new StareRezervata();
        stareRezervata.modificaState(this);
    }

}
