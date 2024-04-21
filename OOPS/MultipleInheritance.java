public class MultipleInheritance {
    public static void main(String[] args) {
        Cow c1 = new Cow();
        c1.eat();
        c1.eat1();
    }
}

interface Herbivore {
    void eat();
}

interface Carnivore {
    void eat1();
}

class Cow implements Herbivore, Carnivore {
    public void eat() {
        System.out.println("Cow eats plants only");
    }

    public void eat1() {
        System.out.println("Cow eats plants only");
    }

}
