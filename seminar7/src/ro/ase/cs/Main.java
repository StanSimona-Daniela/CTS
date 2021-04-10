package ro.ase.cs;

public class Main {

    public static void printeazaInformatiiCredit(Creditable credit){
        credit.crediteaza();
    }

    public static void main(String[] args) {
        Leasing leasing = new Leasing("Bogdan", 10000);
//        printeazaInformatiiCredit(leasing);
        AdapterLeasing adapterLeasing = new AdapterLeasing(leasing);
        adapterLeasing.crediteaza();
        System.out.println("---------------");
        printeazaInformatiiCredit(adapterLeasing);


        System.out.println("***************");
        System.out.println("ADAPTER DE CLASE");

        //dezavantaj =>
        AdapterLeasingClase adapterLeasingClase = new AdapterLeasingClase("gigel", 123456);
        printeazaInformatiiCredit(adapterLeasingClase);
    }
}
