package ro.ase.cts.tests;

import org.junit.Test;
import ro.ase.cts.clase.Grupa;

import static org.junit.Assert.*;

public class GrupaTest {

    @Test
    public void testConstructorRight(){
        Grupa grupa = new Grupa(1086);
        assertEquals(1086, grupa.getNrGrupa());
    }

    @Test
    public void testConstructorLimitaInferioara(){
        Grupa grupa = new Grupa(1010);
        assertEquals(1010, grupa.getNrGrupa());
    }

    @Test
    public void testConstructorLimitaSuperioara(){
        Grupa grupa = new Grupa(1100);
        assertEquals(1100, grupa.getNrGrupa());
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testConstructorException(){
        Grupa grupa = new Grupa(900);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testConstructorException2(){
        Grupa grupa = new Grupa(1200);
    }
    @Test(timeout = 500)
    public void testConstructorPerformance(){
        Grupa grupa = new Grupa(1086);

    }
    @Test
    public void testConstructorRange(){
        Grupa grupa1 = new Grupa(1001);
        assertEquals(1001, grupa1.getNrGrupa());
        Grupa grupa = new Grupa(1099);
        assertEquals(1099, grupa.getNrGrupa());
    }
    @Test
    public void testConstructorExistence(){
        Grupa grupa = new Grupa(1041);
        assertNotNull(grupa.getStudenti());
    }


}