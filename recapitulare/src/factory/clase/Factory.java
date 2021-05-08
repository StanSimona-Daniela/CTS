package factory.clase;

public class Factory {
    public  PersonalMedical create(String nume, int salariu, TipPersonal tip){
        switch (tip){
            case MEDIC : return  new Medic(nume, salariu);
            case ASISTENT: return new Asistent(nume, salariu);
            case BRANCARDIER: return new Brancardier(nume, salariu);
            default: throw new IllegalArgumentException("gresit!");
        }
    }
}
