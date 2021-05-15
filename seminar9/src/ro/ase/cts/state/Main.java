package ro.ase.cts.state;

//13 B CONDITIONEAZA TRECEREA DIN STARI
//daca vine o noua stare, fac modificari daor in context.. nu in clasele concrete
//contextul se folosetse de state = MASA are acele stari cu cele 3 metoca nuntate ca actiuni
public class Main {
    public static void main(String[] args) {
        Masa masa1 = new Masa(1);
        masa1.cerereEliberare();

        masa1.cerereRezervare();
        masa1.cerereOcupare();
        masa1.cerereRezervare();

        masa1.cerereEliberare();

    }
}
