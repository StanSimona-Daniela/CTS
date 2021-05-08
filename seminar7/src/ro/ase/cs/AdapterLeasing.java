package ro.ase.cs;

public class AdapterLeasing implements Creditable {
   private Leasing leasing;
   //adapter de ob => am deja ob creat pe care trebuie sa l adaptez
   //Adapter pt obiecte
   //ref la cls care trebuie adaptata HAS A si va extinde cls la care vrem sa adaptam

    public AdapterLeasing(Leasing leasing) {
        this.leasing = leasing;
    }

    @Override
    public void crediteaza() {
        this.leasing.oferaLeasing();
    }
}
