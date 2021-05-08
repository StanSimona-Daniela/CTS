package ro.ase.cts.classes;

public class Executant {

    private float sold;
    private String detinator;

    public Executant(String detinator) {
        this.detinator = detinator;
    }

    public float getSold() {
        return sold;
    }

    public void setSold(float sold) {
        this.sold = sold;
    }

    public String getDetinator() {
        return detinator;
    }

    public void setDetinator(String detinator) {
        this.detinator = detinator;
    }

    public void creeazaCont(float sold){
        System.out.println("S-a constituit contul cu suma de " + sold);
        this.sold = sold;
    }

    public void retragere(float sumaRetrasa){
        if(sumaRetrasa<= this.sold) {
            this.sold -= sumaRetrasa;
            System.out.println("Sa retras suma de " + sumaRetrasa);
        }
        else {
            System.out.println("Fonduri insuficiente");
        }
    }

    public void depunere(float suma){
        this.sold+= suma;
        System.out.println("S-a depus suma de " + suma);
    }
}
