package ro.ase.cts.classes;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
    private List<ComandaAbstracta> listaComenzi = new ArrayList<>(); //lista gestionata ca pe o coada

    public void adaugaComanda(ComandaAbstracta comandaAbstracta){
        this.listaComenzi.add(comandaAbstracta);
    }

    public void executaComanda(){
        if(this.listaComenzi.size()!= 0) {
            this.listaComenzi.get(0).executa();
            this.listaComenzi.remove(0);
        }else {
            throw new IndexOutOfBoundsException();
        }

    }
}
