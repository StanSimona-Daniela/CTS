package ro.ase.cts.clase;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ro.ase.cts.mock.StudentDummy;

import static org.junit.Assert.*;

public class GrupaTestWithMocks {
    private static Grupa grupa;
    @Test
    public void adaugaStudent(){
        Grupa grupa = new Grupa(1086);
        StudentDummy studentDummy = new StudentDummy();

        grupa.adaugaStudent(studentDummy);
        assertEquals(1, grupa.getStudenti().size());
    }
    @Test
    public void adaugaBoundaryStudentSuperior(){

        assertEquals(35, grupa.getStudenti().size());
    }

    @BeforeClass
    public static void creareGrupa(){
       grupa= new Grupa(1086);
        for(int i=0; i<35; i++){
            StudentDummy studentDummy = new StudentDummy();
            grupa.adaugaStudent(studentDummy);
        }
    }



    @Test(expected = IllegalArgumentException.class)
    public void adaugaStudentExceptie(){

        StudentDummy studentDummy = new StudentDummy();
        this.grupa.adaugaStudent(studentDummy);
    }
}