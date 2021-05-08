package builder.program;

import builder.clase.BuilderRezervare;
import builder.clase.Rezervare;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Rezervare builderRezervare = new BuilderRezervare().setCodRezervare(10).
                setAreBauturiRacoritoare(true).setAreMuzicaAmbientalaPersonalizata(true).setGenMuzical("AAAA").buil();
        System.out.println(builderRezervare);
    }
}
