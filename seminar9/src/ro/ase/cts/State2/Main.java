package ro.ase.cts.State2;

public class Main {
    public static void main(String[] args) {
        Masa masa1= new Masa(1);
        masa1.elibereazaMasa();
        masa1.ocupaMasa();

//        masa1.setState(new StareLibera());  O FAC DEFAULT
        masa1.rezervaMasa();
        masa1.elibereazaMasa();
        masa1.rezervaMasa();

    }
}
