package ro.ase.cts.factory.clase;

public class FactorySingleton {
    private static FactorySingleton factorySingleton = null;

    public static synchronized FactorySingleton getInstance(){
        if(FactorySingleton.factorySingleton == null){
            FactorySingleton.factorySingleton = new FactorySingleton();
        }
        return FactorySingleton.factorySingleton;
    }

    private FactorySingleton() {
    }

    public PersonalMedical create(TipPersonal tip, String nume, float salariu) {
        switch (tip) {
            case MEDIC: {
                Medic medic = new Medic(nume, salariu);
                return medic;
            }
            case ASISTENT: {
                Asistent asistent = new Asistent(nume, salariu);
                return asistent;
            }
            case BRANCARDIER: {
                Brancardier brancardier = new Brancardier(nume, salariu);
                return brancardier;
            }
            default: throw new IllegalArgumentException("tip incorect");
        }
    }
}
