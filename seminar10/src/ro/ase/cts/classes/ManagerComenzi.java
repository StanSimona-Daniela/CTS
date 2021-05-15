package ro.ase.cts.classes;

import java.util.ArrayList;
import java.util.List;
//ca la banca: o sa intre in coada tranzactia mea, dar dupa ce e impachetata => List<ComandaAbstracta>
//o ia din lista si o executa
//picolo ia comanda, o scrie pe hartie si o duce la bucatar = in coada
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
