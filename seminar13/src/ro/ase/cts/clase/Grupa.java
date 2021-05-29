package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Grupa {
    private List<IStudent> studenti;
    private int nrGrupa;

    public List<IStudent> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<IStudent> studenti) {
        this.studenti = studenti;
    }

    public void setNrGrupa(int nrGrupa) {
        this.nrGrupa = nrGrupa;
    }

    public int getNrGrupa() {
        return nrGrupa;
    }

    public Grupa(int nrGrupa){
        if(nrGrupa < 1000 || nrGrupa> 1100)
        {
            throw  new IllegalArgumentException();
        }

        this.nrGrupa=nrGrupa;
        studenti=new ArrayList<>();

    }

    public void importaStudenti(List<IStudent> studenti){
        this.studenti.addAll(studenti);
    }

    public void adaugaStudent(IStudent student){
        studenti.add(student);
    }

    public IStudent getStudent(int index){
        if(index>=0 && index< studenti.size()){
            return studenti.get(index);
        }
        throw new IndexOutOfBoundsException();
    }

    public float getPromovabilitate(){
        int nrRestantieri=0;
        for(IStudent student:studenti){
            if(student.areRestante()){
                nrRestantieri++;
            }
        }
        return studenti.size()/nrRestantieri;
    }



}