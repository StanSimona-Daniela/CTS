package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader extends Readable{

    public StudentiReader(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.fileName));
        input.useDelimiter(",|\n");
        List<Aplicant> aplicanti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
          Student student = new Student();
          super.readAplicant(input, student);

            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();

          student.setAn_studii(an_studii);
          student.setFacultate(facultate);

          aplicanti.add(student);
        }
        input.close();
        return aplicanti;
    }
}
