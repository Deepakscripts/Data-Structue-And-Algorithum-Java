public class inheritance {
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.color = "red";
        System.out.println(f1.color);
        f1.fins = 10;
        System.out.println(f1.fins);
        f1.eat();
        f1.breathe();
        f1.swim();

    }
}

/* BASE CLASS */
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathe");
    }
}

/* DERIVIED CLASS */
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims");
    }
}
