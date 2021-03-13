package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class Readable {

    protected String fileName;

    public Readable(String fileName) {
        this.fileName = fileName;
    }

    public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;

    public void readAplicant(Scanner scanner, Aplicant aplicant){
        String nume = scanner.next();
        String prenume = scanner.next();
        int varsta = scanner.nextInt();
        int punctaj = scanner.nextInt();
        int nr = scanner.nextInt();
        String[] denumiriProiecte = new String[5];
        for (int i = 0; i < nr; i++)
            denumiriProiecte[i] = scanner.next();
        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setDenumiriProiecte(denumiriProiecte,nr);
    }

}
