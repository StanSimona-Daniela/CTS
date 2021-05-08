package singleton.program;

import singleton.clase.Parlament;
import singleton.clase.ParlamentLazy;

public class Main {
    public static void main(String[] args) {

        Parlament parlament1 = Parlament.getInstance();
        Parlament parlament2 = Parlament.getInstance();

        parlament1.setDurataMandat(100);
        parlament2.setTara("Romania");
        System.out.println(parlament1.toString());
        System.out.println(parlament2.toString());
        System.out.println("====================");

        ParlamentLazy parlamentLazy = ParlamentLazy.getInstance("Italia", 4, 100, "denumireee");
        ParlamentLazy parlamentLazy1 = ParlamentLazy.getInstance("Spania", 5, 600, "ABC");
        parlamentLazy.setTara("Orice tara");
        System.out.println(parlamentLazy.toString());
        System.out.println(parlamentLazy1.toString());

    }
}
