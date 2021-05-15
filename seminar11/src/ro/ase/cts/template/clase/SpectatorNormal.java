package ro.ase.cts.template.clase;

public class SpectatorNormal extends Template{
    private String nume;

    public SpectatorNormal(String nume) {
        this.nume = nume;
    }

    @Override
    public void seAsazaLaCoada() {
        System.out.println(this.nume+ "  s a asezat la coada.");
    }

    @Override
    public void prezintaBilet() {
        System.out.println(this.nume+ " a prezentat biletul.");
    }

    @Override
    public void seFaceControlCorporal() {
        System.out.println( "Se controleaza coportal spectatorul "+ this.nume + " .");

    }

    @Override
    public void seOcupa() {
        System.out.println(this.nume+ " si a ocupat locul la tribuna.");
    }
}
