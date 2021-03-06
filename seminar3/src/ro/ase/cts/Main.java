package ro.ase.cts;

import ro.ase.cts.Clase.Parlament;
import ro.ase.cts.Clase.ParlamentLazy;
import ro.ase.cts.Clase.Scortisoara;

//SINGLETON ->
//CONSTRUCTORI PRIVATI, REFERINTA NULA CATRE OB UNIC, METODA STATICA ce intoarce CONEXIUNEA

public class Main {
    public static void main(String[] args) {
//        Parlament parlament1 = new Parlament("Romania", 123, 4, "Undeva");
//        Parlament parlament2 = new Parlament("Bulgara", 456, 14, "In Bulgaria");

        //pointeaza ambele catre aceelasi obiect => NU E OK, PT CA UTILIZATORUL ARE IMPRESIA CA POATE CREEA 2 REFERINTE

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

        System.out.println("======================================");
        Scortisoara scortisoara1 = Scortisoara.getInstance(20, "p1", 4.4);
        Scortisoara scortisoara2 = Scortisoara.getInstance(30, "p2", 5.4);
        System.out.println(scortisoara1.toString());
        System.out.println(scortisoara2.toString());
    }
}
