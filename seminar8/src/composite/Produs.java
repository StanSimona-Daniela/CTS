package composite;

public class Produs implements ComponentaAbstracta{
    private String numeProdus;

    public Produs(String numeProdus) {
        this.numeProdus = numeProdus;
    }

    @Override
    public void printElement() {
        System.out.println("Prdusul "+this.numeProdus);
    }

    @Override
    public void adaugaNod(ComponentaAbstracta componentaAbstracta) {
        throw new UnsupportedOperationException();

    }

    @Override
    public void stergeNod(ComponentaAbstracta componentaAbstracta) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ComponentaAbstracta getNod(int pozitie) {
        throw new UnsupportedOperationException();
    }
}
