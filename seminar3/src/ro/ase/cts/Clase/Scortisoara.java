package ro.ase.cts.Clase;

public class Scortisoara {
    private int calorii;
    private String producator;
    private double lipideSaturate;

    private static Scortisoara scortisoara = null;

    public static  synchronized Scortisoara getInstance(int calorii, String producator, double lipideSaturate){
        if(scortisoara == null){
            scortisoara = new Scortisoara(calorii, producator, lipideSaturate);
        }
        return scortisoara;
    }
    private Scortisoara() {
        this.calorii = 0;
        this.producator= "";
        this.lipideSaturate = 0.0;
    }

    private Scortisoara(int calorii, String producator, double lipideSaturate) {
        this.calorii = calorii;
        this.producator = producator;
        this.lipideSaturate = lipideSaturate;
    }

    public void setCalorii(int calorii) {
        this.calorii = calorii;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public void setLipideSaturate(double lipideSaturate) {
        this.lipideSaturate = lipideSaturate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Scortisoara{");
        sb.append("calorii=").append(calorii);
        sb.append(", producator='").append(producator).append('\'');
        sb.append(", lipideSaturate=").append(lipideSaturate);
        sb.append('}');
        return sb.toString();
    }
}
