package ro.ase.cts.State2;

public class StareOcupata implements Stare {
    @Override
    public void modificaState(Masa masa) {
        if(!(masa.getStare() instanceof StareOcupata)){
            System.out.println("Masa cu nr " + masa.getNrMasa()+ " a fost ocupata");
            masa.setStare(this);
        }else
        {
            System.out.println("masa nu poate fi ocupata");
        }
    }
}
