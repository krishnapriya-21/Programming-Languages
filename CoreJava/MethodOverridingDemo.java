// Base class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog overrides sound()
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass Cat overrides sound()
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Subclass Cow overrides sound()
class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Cow moos");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        // Reference type is Animal, but actual objects differ
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Cow();

        a1.sound();  // Dog barks
        a2.sound();  // Cat meows
        a3.sound();  // Cow moos
    }
}