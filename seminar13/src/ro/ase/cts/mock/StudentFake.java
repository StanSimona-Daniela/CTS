package ro.ase.cts.mock;

import ro.ase.cts.clase.IStudent;

import java.util.List;

public class StudentFake implements IStudent {

    String valoareGetNume;
    List<Integer> aloareGetNote;
    float valoareCAlculeazaMedie;
    int valoareGetNota;
    boolean valoareAreRestante;

    public String getValoareGetNume() {
        return valoareGetNume;
    }

    public void setValoareGetNume(String valoareGetNume) {
        this.valoareGetNume = valoareGetNume;
    }

    public List<Integer> getAloareGetNote() {
        return aloareGetNote;
    }

    public void setAloareGetNote(List<Integer> aloareGetNote) {
        this.aloareGetNote = aloareGetNote;
    }

    public float getValoareCAlculeazaMedie() {
        return valoareCAlculeazaMedie;
    }

    public void setValoareCAlculeazaMedie(float valoareCAlculeazaMedie) {
        this.valoareCAlculeazaMedie = valoareCAlculeazaMedie;
    }

    public int getValoareGetNota() {
        return valoareGetNota;
    }

    public void setValoareGetNota(int valoareGetNota) {
        this.valoareGetNota = valoareGetNota;
    }

    public boolean isValoareAreRestante() {
        return valoareAreRestante;
    }

    public void setValoareAreRestante(boolean valoareAreRestante) {
        this.valoareAreRestante = valoareAreRestante;
    }

    @Override
    public String getNume() {
        return this.valoareGetNume;
    }

    @Override
    public void setNume(String nume) {

    }

    @Override
    public List<Integer> getNote() {
        return this.aloareGetNote;
    }

    @Override
    public void adaugaNota(int nota) {

    }

    @Override
    public float calculeazaMedie() {
        return this.valoareCAlculeazaMedie;
    }

    @Override
    public int getNota(int index) {
        return this.valoareGetNota;
    }

    @Override
    public boolean areRestante() {
        return this.valoareAreRestante;
    }
}
