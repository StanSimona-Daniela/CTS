package ro.ase.cts.observer.clase;

public class ManagerSala extends Subiect{

    private String numeSala;

    public ManagerSala(String numeSala) {
        this.numeSala = numeSala;
    }
    public void anuntaMeci(String tipMeci){
       super.trimiteNotificare(this.numeSala + " va gazdui un meci de " + tipMeci);
    }

}
