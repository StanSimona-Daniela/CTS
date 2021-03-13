package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviReader extends Readable{

    public EleviReader(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.fileName));
        input.useDelimiter(",|\n");
        List<Aplicant> aplicanti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Elev elev = new Elev();
            super.readAplicant(input, elev);

            int clasa = input.nextInt();
            String tutore = input.next();

            elev.setClasa(clasa);
            elev.setNumeTutore(tutore);
            aplicanti.add(elev);
        }

        input.close();
        return aplicanti;
    }
}
