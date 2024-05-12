import java.util.ArrayList;
public class slide21{
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Mice");
        animals.add("Turtle");

        System.out.println(animals.isEmpty());
        System.out.println(animals.set(3,"Elephant"));
        System.out.println(animals.get(2));
        System.out.println(animals.contains("Flower"));
        System.out.println(animals.size());
        System.out.println(animals.indexOf("Cat"));
        System.out.println(animals);
    }
}
