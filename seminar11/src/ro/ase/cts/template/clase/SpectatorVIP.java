package ro.ase.cts.template.clase;

public class SpectatorVIP extends Template {
    private String nume;
    private String nrLoja;

    public SpectatorVIP(String nume, String nrLoja) {
        this.nume = nume;
        this.nrLoja = nrLoja;
    }

    @Override
    public void seAsazaLaCoada() {
    }

    @Override
    public void prezintaBilet() {
        System.out.println(this.nume + " prezinta biletul pt loja");
    }

    @Override
    public void seFaceControlCorporal() {
        System.out.println(this.nume + " se face controlul corporal" );

    }

    @Override
    public void seOcupa() {
        System.out.println(this.nume+ "  ocupa loc in loja " + this.nrLoja);

    }
}
