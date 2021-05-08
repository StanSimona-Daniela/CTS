package ro.ase.cts.classes;

public abstract class ComandaAbstracta {
    private Executant executant;
    private float suma;


    public ComandaAbstracta(Executant executant, float suma) {
        this.executant = executant;
        this.suma = suma;
    }

    public Executant getExecutant() {
        return executant;
    }

    public void setExecutant(Executant executant) {
        this.executant = executant;
    }

    public float getSuma() {
        return suma;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }

    public abstract void executa();


}
