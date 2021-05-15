package ro.ase.cts.Strategy;

//mai multe metode plata ce se realizeaza la runtime (clientul decide atunci la RUNTIME)
//stabileste functionalizati, nu adauga ca decorator!!
public class Main {
    public static void main(String[] args) {

        Client client= new Client("Simona", new PlataCash());
        client.platesteNota(200);
        client.setPlata(new PlataCard()); //setare la runtime
        client.platesteNota(100.5f);

        client.setPlata(new PlataBonuriMasa());
        client.platesteNota(10000.7f);
    }
}
