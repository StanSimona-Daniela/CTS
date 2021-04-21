package ro.ase.cts.State2;

import ro.ase.cts.state.Libera;

public class StareLibera implements Stare{

    @Override
    public void modificaStare(Masa masa) {
        if(!(masa.getState() instanceof StareLibera)){
            System.out.println("Masa cu nr " + masa.getNrMasa()+ " a fost eliberata");
            masa.setState(this);
        }else
        {
            System.out.println("masa nu poate fi eliberata");
        }
    }
}
