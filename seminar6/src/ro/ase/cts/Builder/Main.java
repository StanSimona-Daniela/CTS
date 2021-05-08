package ro.ase.cts.Builder;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare= new Rezervare(12, false, true, false,
                false, "rock");

        BuilderRezervare builderRezervare = new BuilderRezervare()
                .setAreMancareInclusa(true)
                .setCodRezervare(1)
                .setAreMuzicaAmbientalaPersonalizata(true)
                .setAreMuzicaAmbientalaPersonalizata(true).setGenMuzical("Rock");
        Rezervare rezervare1 = builderRezervare.build();


        //mai bn
        Rezervare rezervare2 = new BuilderRezervare()
                .setCodRezervare(2)
                .setAreScaunErgonomic(true)
                .build();

        //ma folosesc de primul buildRezervare, pointeaaz la aceeasi zona de memorie
        // => buildrevervareV2 in care sa apelez constr in build, va aveam atributele din rezervare, nu mai are instanta
        Rezervare rezervare3 = builderRezervare
                .setCodRezervare(4)
                .build();

        BuilderRezervareV2 builderRezervareV2 = new BuilderRezervareV2()
                .setAreMancareInclusa(true)
                .setAreScaunErgonomic(true)
                .setAreBauturiRacoritoare(true);

        Rezervare rezervare4 = builderRezervareV2.setCodRezervare(10).build();
        Rezervare rezervare5 = builderRezervareV2.setCodRezervare(11).build();//=> 3 0b cu tot cii builer

        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());
        System.out.println(rezervare4.toString());
        System.out.println(rezervare5.toString());

    }
}
