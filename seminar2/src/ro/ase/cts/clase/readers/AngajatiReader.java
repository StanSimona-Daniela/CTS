package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends Readable{

    public AngajatiReader(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.fileName));
        input.useDelimiter(",");
        List<Aplicant> aplicant = new ArrayList<Aplicant>();

        while (input.hasNext()) {
          Angajat angajat = new Angajat();
          super.readAplicant(input, angajat);

            int salariu = input.nextInt();
            String ocupatie = input.next();

            angajat.setOcupatie(ocupatie);
            angajat.setSalariu(salariu);
            aplicant.add(angajat);
        }
        input.close();
        return aplicant;
    }
}
