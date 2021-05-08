package ro.ase.cts.clase;

public class  Facade {
    //ia toata treaba care este facuta picolo si masa
    public static boolean esteMasaPregatita(Masa masa) {
        if (OperatoriMese.esteLibera(masa.getNrMasa())) { //daca masa e libera, picolo face verificarea
            Picolo picolo1 = new Picolo("Gigel");
            if (picolo1.esteDebarasataMasa(masa.getNrMasa())) {
                if (picolo1.esteAranjata(masa.getNrMasa())) {
                    return true;
                }
            }
        }
        return false;
    }
}
