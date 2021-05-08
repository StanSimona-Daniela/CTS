package factoryabstract.program;

import factoryabstract.clase.FabricaAtacant;
import factoryabstract.clase.FabricaFundas;
import factoryabstract.clase.Factory;
import factoryabstract.clase.Jucator;

public class Main {

    private static void creeaza(Factory factory, String nume, int numar){
        Jucator jucator = factory.creeaza(nume, numar);
        System.out.println(jucator);
    }

    public static void main(String[] args) {
         creeaza(new FabricaAtacant(), "Simona", 120);
        creeaza(new FabricaFundas(), "Daniela", 150);

    }
}
