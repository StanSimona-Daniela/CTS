package ro.ase.cts.tests;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.cts.categories.TesteUrgente;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.mock.StudentDummy;
import ro.ase.cts.mock.StudentFake;
import ro.ase.cts.mock.StudentStub;

import static org.junit.Assert.*;

public class GrupaTestWithMocks {
    private static Grupa grupa;
    @Test
    @Category({TesteUrgente.class, TesteUrgente.class})

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


    @Test
    public void testGetPromovabilitate(){
        Grupa grupa = new Grupa(1088);
        StudentStub studentStub = new StudentStub();
        grupa.adaugaStudent(studentStub);
        assertEquals(0, grupa.getPromovabilitate(), 0.01);
    }

    @Test
    public void testGetPromovabilitateB(){
        Grupa grupa = new Grupa(1088);
        for(int i=0; i<7; i++) {
            StudentFake studentFake = new StudentFake();
            studentFake.setValoareAreRestante(false);
            grupa.adaugaStudent(studentFake);
        }
        for(int i=0; i<3; i++) {
            StudentFake studentFake = new StudentFake();
            studentFake.setValoareAreRestante(true);
            grupa.adaugaStudent(studentFake);
        }

        assertEquals(0.7, grupa.getPromovabilitate(), 0.01);
    }



}