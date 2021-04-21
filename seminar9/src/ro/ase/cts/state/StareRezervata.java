package ro.ase.cts.state;

import ro.ase.cts.State2.Masa;
import ro.ase.cts.State2.Stare;
import ro.ase.cts.State2.StareLibera;

public class StareRezervata  implements Stare {
    @Override
    public void modificaStare(Masa masa) {
        if(masa.getState() instanceof StareLibera){
            System.out.println("Masa cu nr " + masa.getNrMasa()+ " a fost rezervata");
            masa.setState(this);
        }else
        {
            System.out.println("masa nu poate fi rezervata");
        }
    }
}
