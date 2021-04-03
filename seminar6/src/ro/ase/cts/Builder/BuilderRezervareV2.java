package ro.ase.cts.Builder;

public class BuilderRezervareV2 implements AbstractBuilder{
    private int codRezervare;
    private boolean areMancareInclusa;
    private boolean areScaunErgonomic;
    private boolean areBauturiRacoritoare;
    private boolean areMuzicaAmbientalaPersonalizata;
    private String genMuzical;

    @Override
    public Rezervare build() {
        return new Rezervare(codRezervare, areMancareInclusa, areScaunErgonomic,
                areBauturiRacoritoare, areMuzicaAmbientalaPersonalizata, genMuzical);
    }

    public BuilderRezervareV2 setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
        return this;
    }

    public BuilderRezervareV2 setAreMancareInclusa(boolean areMancareInclusa) {
        this.areMancareInclusa = areMancareInclusa;
        return this;
    }

    public BuilderRezervareV2 setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
        return this;
    }

    public BuilderRezervareV2 setAreBauturiRacoritoare(boolean areBauturiRacoritoare) {
        this.areBauturiRacoritoare = areBauturiRacoritoare;
        return this;
    }

    public BuilderRezervareV2 setAreMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata) {
        this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
        return this;
    }

    public BuilderRezervareV2 setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
        return this;
    }

    public BuilderRezervareV2() {
        codRezervare = 1000;
        genMuzical= "Rock";
    }
}
