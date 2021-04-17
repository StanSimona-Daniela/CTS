package flyweight;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare(1, 1);
        Rezervare rezervare2 = new Rezervare(2, 1);
        Rezervare rezervare3 = new Rezervare(3, 1);

        FlyweightFactory flyweightFactory = new FlyweightFactory();

       flyweightFactory.getClient("123456").printeazaRezervare(rezervare1);

       flyweightFactory.getClient("987654").printeazaRezervare(rezervare2);

       flyweightFactory.getClient("123456").printeazaRezervare(rezervare3);


    }
}
