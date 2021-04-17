package ro.ase.cts.composite;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentaAbstracta{
    private String numeSectiune;
    private ArrayList<ComponentaAbstracta> listaComponente= new ArrayList<>();

    public Sectiune(String numeSectiune) {
        this.numeSectiune = numeSectiune;
    }

    @Override
    public void printElement() {
        System.out.println("Sectiunea " + this.numeSectiune);
        for (ComponentaAbstracta componentaAbstracta: listaComponente) {
            componentaAbstracta.printElement();
        }
    }

    @Override
    public void adaugaNod(ComponentaAbstracta componentaAbstracta) {
        if(componentaAbstracta!= null){
            listaComponente.add(componentaAbstracta);

        }
    }

    @Override
    public void stergeNod(ComponentaAbstracta componentaAbstracta) {
        if(componentaAbstracta!= null) {
            listaComponente.remove(componentaAbstracta);
        }
    }

    @Override
    public ComponentaAbstracta getNod(int pozitie) {
        if(pozitie>=0 && pozitie< listaComponente.size()){
            return listaComponente.get(pozitie);
        }
        throw new IndexOutOfBoundsException();
    }
}
