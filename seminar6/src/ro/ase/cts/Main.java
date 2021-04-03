package ro.ase.cts;

public class Main {

    public static void afiseazaInformatiiJucatori(FabricaJucatori fabrica, String nume, int nrTricou){
        Jucator jucator = fabrica.creazaJucator(nume, nrTricou);
        System.out.println(jucator.toString());

    }

    public static void main(String[] args) {
        afiseazaInformatiiJucatori(new FabricaAtacant(),"Popescu",15);
        afiseazaInformatiiJucatori(new FabricaPortar(), "Ionescu", 17);
        afiseazaInformatiiJucatori(new FabricaMijlocas(), "Gorgescu", 11);
    }
}
