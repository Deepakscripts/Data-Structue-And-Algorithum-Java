public class Multiinr {
    public static void main(String[] args) {
        Shark s1 = new Shark();
        s1.swim();
        s1.breathe();

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

class Shark extends Fish {
    int fins;

    void herbs() {
        System.out.println("herbs");
    }
}


