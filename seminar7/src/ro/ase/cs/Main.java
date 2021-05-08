package ro.ase.cs;

public class Main {

    public static void printeazaInformatiiCredit(Creditable credit){
        credit.crediteaza();
    }  //interfata = LAPTOP

    public static void main(String[] args) {
        Leasing leasing = new Leasing("Bogdan", 10000);   //miniSDCard
//        printeazaInformatiiCredit(leasing);
        AdapterLeasing adapterLeasing = new AdapterLeasing(leasing);  //pun Adaptersdk in laptop
        adapterLeasing.crediteaza();
        System.out.println("---------------");
        printeazaInformatiiCredit(adapterLeasing);


        System.out.println("***************");
        System.out.println("ADAPTER DE CLASE");

        //avantaj => creez direct acel obiect, direct acel adapter.. si lui ii dau atributele si el creeaza ob
        //ascunde interactiunea cu Leasing
        //adapteaza intreaga clasa si nu trebuie sa mai creez ob ala
        //dezavantaj: nu putem adapta ceva deja existent, pt ca noi il creem aici
        //dezavantaj: daca avem clasa abstracta in contexyul actula, nu putem sa avem mostenire multipla: pe care vrem sa o adaptam + ..
        //interfata: de cls sau ob
        //cls abstracta => adapter de ob
        AdapterLeasingClase adapterLeasingClase = new AdapterLeasingClase("gigel", 123456);
        printeazaInformatiiCredit(adapterLeasingClase);
    }
}
