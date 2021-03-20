package ro.ase.cts;

import ro.ase.cts.Clase.Parlament;
import ro.ase.cts.Clase.ParlamentLazy;

public class Main {
    public static void main(String[] args) {
//        Parlament parlament1 = new Parlament("Romania", 123, 4, "Undeva");
//        Parlament parlament2 = new Parlament("Bulgara", 456, 14, "In Bulgaria");

        Parlament parlament1= Parlament.getInstance();
        Parlament parlament2= Parlament.getInstance();

        System.out.println(parlament1.toString());
        System.out.println(parlament2.toString());
        System.out.println("-----------------------------------");

        parlament1.setTara("Romania");
        parlament2.setNrParlamentari(300);
        System.out.println(parlament1.toString());
        System.out.println(parlament2.toString());
        System.out.println("======================================");

        ParlamentLazy parlamentLazy1 = ParlamentLazy.getInstance("Serbia", 400, 8, "Sediul Serbiei");
        ParlamentLazy parlamentLazy2 = ParlamentLazy.getInstance("UK", 500, 2, "Sediul UK");

        System.out.println(parlamentLazy1.toString());
        System.out.println(parlamentLazy2.toString());
    }
}
