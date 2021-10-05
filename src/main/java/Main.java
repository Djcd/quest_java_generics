import fruit.Apple;
import fruit.Banana;
import fruit.Fruit;
import fruit.Pear;

public class Main {
    public static void main(String[] args) {
        int capacity = 5;
        FixedSizeListGeneric<Apple> appleGeneric;
        FixedSizeList appleNonGeneric;

        appleGeneric = new FixedSizeListGeneric<>(capacity);
        appleNonGeneric = new FixedSizeList(capacity);


        appleGeneric.add(new Apple("Apple1", 5));
        appleNonGeneric.add(new Apple("Apple2", 10));

        Apple a1 = appleGeneric.get(0);
        Apple a2 = (Apple) appleNonGeneric.get(0);

        System.out.println(a1.getName());
        System.out.println(a2.getName());

        FixedSizeListGeneric<Fruit> fruits = new FixedSizeListGeneric<>(5);
        fruits.add(new Apple("Apple3", 2));
        fruits.add(new Pear("Pear1",20));
        fruits.add(new Banana("Banana1", 40));

        Fruit fruit1;
        Fruit fruit2;
        Fruit fruit3;

        fruit1 = fruits.get(0);
        System.out.println(fruit1.getName());

        fruit2 = fruits.get(1);
        System.out.println(fruit2.getName());

        fruit3 = fruits.get(2);
        System.out.println(fruit3.getName());
    }
}