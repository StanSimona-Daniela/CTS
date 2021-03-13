package Program;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private Zookeeper zookeper;
    private List<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
        this.zookeper = new Zookeeper("Gigel");
    }

    public Zoo(Zookeeper zookeper, List<Animal> animals) {
        this.zookeper = zookeper;
        this.animals = animals;
    }

    public void Add(Animal animal) {
        this.animals.add(animal);
    }
//
    public void feedAllAnimmals() {
        for ( Animal a : animals) {
            zookeper.feed(a);
        }
    }
}
