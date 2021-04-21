package ro.ase.cts.State2;

public class StareLibera implements Stare{

    @Override
    public void modificaState(Masa masa) {
        if(!(masa.getStare() instanceof StareLibera)){
            System.out.println("Masa cu nr " + masa.getNrMasa()+ " a fost eliberata");
            masa.setStare(this);
        }else
        {
            System.out.println("masa nu poate fi eliberata");
        }
    }
}
