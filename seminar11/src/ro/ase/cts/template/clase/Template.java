package ro.ase.cts.template.clase;

public abstract class Template {

    public final void intraPeStadion(){
        seAsazaLaCoada();
        prezintaBilet();
        seFaceControlCorporal();
        seOcupa();
    }
    public abstract void seAsazaLaCoada();
    public abstract void prezintaBilet();
    public abstract void seFaceControlCorporal();
    public abstract void seOcupa();
}
