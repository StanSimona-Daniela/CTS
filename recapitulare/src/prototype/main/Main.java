package prototype.main;

import prototype.clase.Reteta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> cantitati = new ArrayList<>();
        List<Integer> cantitati2 = new ArrayList<>();
        List<String> denumiri = new ArrayList<>();
        cantitati.add(3);
        cantitati2.add(10);
        denumiri.add("Denumirea1");
        Reteta reteta1= new Reteta(cantitati,denumiri);
        Reteta reteta2=(Reteta) reteta1.copiaza();
        System.out.println(reteta1);
        reteta2.setCantitati(cantitati2);
        System.out.println(reteta2);

    }
}
