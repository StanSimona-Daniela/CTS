package composite;

public class Main {
    public static void main(String[] args) {
        Sectiune bauturi = new Sectiune("bauturi");
        Sectiune desert = new Sectiune("desert");

        Produs cola= new Produs("Cola");
        Produs tiramisu= new Produs("Tiramisu");
        Produs frappe= new Produs("Frappe");

        Sectiune meniu =new Sectiune("Meniu");
        meniu.adaugaNod(bauturi);
        meniu.adaugaNod(desert);


        bauturi.adaugaNod(cola);
        bauturi.adaugaNod(frappe);
        desert.adaugaNod(tiramisu);

        meniu.printElement();
        System.out.println("------");


        desert.adaugaNod(frappe);
        bauturi.stergeNod(frappe);
        meniu.printElement();
    }
}
