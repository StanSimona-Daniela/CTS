package builder.clase;

public class BuilderRezervare implements AbstractBuilder{

    Rezervare rezervare=null;
    @Override
    public Rezervare buil() {
        return rezervare;
    }

    public BuilderRezervare() {
        this.rezervare = new Rezervare(0, false,false,
                false,false,"Rock");
    }

    public BuilderRezervare(int cod ) {
        this.rezervare = new Rezervare(cod, false,false,
                false,false,"Oarecare");
    }
    public BuilderRezervare setCodRezervare(int codRezervare) {
        this.rezervare.setCodRezervare(codRezervare);
        return this;
    }

    public BuilderRezervare setAreMancareInclusa(boolean areMancareInclusa) {
        this.rezervare.setAreMancareInclusa(areMancareInclusa);
        return this;
    }

    public BuilderRezervare setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.setAreScaunErgonomic(areScaunErgonomic);
        return this;
    }

    public BuilderRezervare setAreBauturiRacoritoare(boolean areBauturiRacoritoare) {
        this.rezervare.setAreBauturiRacoritoare(areBauturiRacoritoare);
        return this;
    }

    public BuilderRezervare setAreMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata) {
        this.rezervare.setAreMuzicaAmbientalaPersonalizata(areMuzicaAmbientalaPersonalizata);
        return this;
    }

    public BuilderRezervare setGenMuzical(String genMuzical) {
        this.rezervare.setGenMuzical(genMuzical);
        return this;
    }


}
