package ro.ase.cts.State2;

public class StareRezervata  implements Stare {
    @Override
    public void modificaState(Masa masa) {
        if(masa.getStare() instanceof StareLibera){
            System.out.println("Masa cu nr " + masa.getNrMasa()+ " a fost rezervata");
            masa.setStare(this);
        }else
        {
            System.out.println("masa nu poate fi rezervata");
        }
    }
}
