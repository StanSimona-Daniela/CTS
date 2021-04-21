package ro.ase.cts.Strategy;

public class Main {
    public static void main(String[] args) {

        Client client= new Client("Simona", new PlataCash());
        client.platesteNota(200);
        client.setPlata(new PlataCard());
        client.platesteNota(100.5f);

        client.setPlata(new PlataBonuriMasa());
        client.platesteNota(10000.7f);
    }
}
