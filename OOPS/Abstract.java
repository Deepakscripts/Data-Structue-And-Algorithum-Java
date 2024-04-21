public class Abstract {
    public static void main(String[] args) {
        Mustang ecoboost = new Mustang();
        ecoboost.Legs();
        ecoboost.eat();
    }
}

abstract class Animal {

    Animal() {
        System.out.println("Anmial Constructor is called");
    }

    abstract void Legs();/* THIS IS A ABSTRACT FNX */

    void eat() {
        System.out.println("Anmail eats food");
    }
}

class Horse extends Animal {

    Horse() {
        System.out.println("Horse Constructor is called");
    }

    void Legs() {
        System.out.println("Horse has 4 legs");
    }
}

class Mustang extends Horse {

    Mustang() {
        System.out.println("Hosre constructor is called");
    }

}