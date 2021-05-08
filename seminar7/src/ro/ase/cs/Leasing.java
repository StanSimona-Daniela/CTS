package ro.ase.cs;

public class Leasing { //nu pot modifica nimic aici !! important
    private String numeClient;
    private int suma;

    public Leasing(String numeClient, int suma) {
        this.numeClient = numeClient;
        this.suma = suma;
    }

    public void oferaLeasing(){
        System.out.println("pentru clientul " + this.numeClient + "a fost oferit un leasing de " + this.suma);
    }
}
