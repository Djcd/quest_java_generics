package fruit;

public class Fruit {

    public String getName() {
        return name;
    }

    private String name;

    private int sugar;

    public Fruit(String name, int sugar) {
        this.name = name;
        this.sugar = sugar;
    }
}
