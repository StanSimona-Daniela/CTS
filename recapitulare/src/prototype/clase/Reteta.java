package prototype.clase;

import java.util.ArrayList;
import java.util.List;

public class Reteta implements AbstractPrototype{
    private List<Integer> cantitati;
    private List<String> denumiri;

    public Reteta(List<Integer> cantitati, List<String> denumiri) {
        this.cantitati = cantitati;
        this.denumiri = denumiri;
    }

    public Reteta() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("cantitati=").append(cantitati);
        sb.append(", denumiri=").append(denumiri);
        sb.append('}');
        return sb.toString();
    }

    public List<Integer> getCantitati() {
        return cantitati;
    }

    public void setCantitati(List<Integer> cantitati) {
        this.cantitati = cantitati;
    }

    public List<String> getDenumiri() {
        return denumiri;
    }

    public void setDenumiri(List<String> denumiri) {
        this.denumiri = denumiri;
    }

    @Override
    public AbstractPrototype copiaza() {
        Reteta copy= new Reteta();
        copy.cantitati = new ArrayList<>();
        copy.cantitati.addAll(this.cantitati);
        copy.denumiri = new ArrayList<>();
        copy.denumiri.addAll(this.denumiri);
        return copy;
    }
}


