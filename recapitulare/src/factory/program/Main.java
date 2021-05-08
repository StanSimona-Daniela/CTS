package factory.program;

import factory.clase.Factory;

import factory.clase.PersonalMedical;
import factory.clase.TipPersonal;

public class Main {
    public static void main(String[] args) {

        Factory factory= new Factory();
        PersonalMedical medic= factory.create("anaa", 100, TipPersonal.MEDIC);
        PersonalMedical asistent= factory.create("asistent", 100, TipPersonal.ASISTENT);

        System.out.println(medic.toString());
        System.out.println(asistent.toString());



    }
}
