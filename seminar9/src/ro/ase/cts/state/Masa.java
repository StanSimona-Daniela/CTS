package ro.ase.cts.state;

public class Masa {
    private int nrMasa;
    private State state;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
        this.state = new Libera();
    }
    public void cerereRezervare(){
        if(this.state instanceof Libera){
            System.out.println("Masa cu codul " + this.nrMasa + " a fost rezervata.");
            this.state= new Rezervata();
        }else {
            System.out.println("Masa nu poate fi rezervata.");
        }
    }

    public void cerereOcupare(){
        if(!(this.state instanceof Ocupata)){
            System.out.println("Masa cu codul " + this.nrMasa + " a fost ocupata.");
            this.state= new Ocupata();
        }else {
            System.out.println("Masa nu poate fi ocupata.");
        }
    }

    public void cerereEliberare(){
        if(!(this.state instanceof Libera)){
            System.out.println("Masa cu codul " + this.nrMasa + " a fost eliberata.");
            this.state= new Libera();
        }else {
            System.out.println("Masa nu poate fi eliberata.");
        }
    }

}
