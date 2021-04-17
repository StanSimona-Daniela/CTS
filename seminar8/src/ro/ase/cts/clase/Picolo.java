package ro.ase.cts.clase;

 class Picolo {

    private String nume;

    public Picolo(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
    public boolean esteAranjata(int nrMasina){
        return nrMasina%5==0;
    }

    public boolean esteDebarasataMasa(int nrMasina){
        return nrMasina%3==0;
    }
}
