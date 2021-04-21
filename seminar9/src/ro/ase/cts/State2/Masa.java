package ro.ase.cts.State2;

import ro.ase.cts.state.StareOcupata;
import ro.ase.cts.state.StareRezervata;
import ro.ase.cts.state.State;

public class Masa {
    private int nrMasa;
    private Stare state;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;

    }

     void setState(Stare state) {
        this.state = state;
    }

    public Stare getState() {
        return state;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public void ocupaMasa(){
        StareOcupata stareOcupata = new StareOcupata();
        stareOcupata.modificaStare(this);
    }
    public void elibereazaMasa(){
        StareLibera stareLibera= new StareLibera();
        stareLibera.modificaStare(this);
    }
    public void rezervaMasa(){
        StareRezervata stareRezervata= new StareRezervata();
        stareRezervata.modificaStare(this);
    }

}
