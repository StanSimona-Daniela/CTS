package ro.ase.cts.state;

import ro.ase.cts.State2.Masa;
import ro.ase.cts.State2.Stare;
import ro.ase.cts.State2.StareLibera;

public class StareOcupata implements Stare {
    @Override
    public void modificaStare(Masa masa) {
        if(!(masa.getState() instanceof StareOcupata)){
            System.out.println("Masa cu nr " + masa.getNrMasa()+ " a fost ocupata");
            masa.setState(this);
        }else
        {
            System.out.println("masa nu poate fi ocupata");
        }
    }
}
