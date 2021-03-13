package Program;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Giraffe g1 = new Giraffe("girafa1");
        Giraffe g2 = new Giraffe("girafa2");

        zoo.Add(g1);
        zoo.Add(g2);

        zoo.feedAllAnimmals();
        //

    }
}
