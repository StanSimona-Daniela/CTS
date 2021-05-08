package ro.ase.cts.chain.clase;

public class ContCurent extends  Cont{
    public ContCurent(float sold) {
        super(sold);
    }

    @Override
    public void realizeazaPlata(float suma) {
        if(super.getSold()>= suma){
            System.out.println("se realizeaza plata din contul curent in suma de " + suma);
            super.setSold(super.getSold()-suma);
        }else if(super.getSuccesorCont()!= null){
                super.getSuccesorCont().realizeazaPlata(suma);
            }
        else {
                System.out.println("Nu se poate realiza plata");
        }
    }
}
