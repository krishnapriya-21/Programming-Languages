// Base class
class Animal3 {
    void sound3() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog overrides sound()
class Dog3 extends Animal3 {
    @Override
    void sound3() {
        System.out.println("Dog barks");
    }
}

// Subclass Cat overrides sound()
class Cat3 extends Animal3 {
    @Override
    void sound3() {
        System.out.println("Cat meows");
    }
}

// Subclass Cow overrides sound()
class Cow3 extends Animal3 {
    @Override
    void sound3() {
        System.out.println("Cow moos");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        // Reference type is Animal, but actual objects differ
        Animal3 a1 = new Dog3();
        Animal3 a2 = new Cat3();
        Animal3 a3 = new Cow3();

        a1.sound3();  // Dog barks
        a2.sound3();  // Cat meows
        a3.sound3();  // Cow moos
    }
}