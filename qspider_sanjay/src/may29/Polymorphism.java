package may29;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    // Overriding the sound() method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class Polymorphism {
    public static void main(String[] args) {
        Animal a = new Animal();  // Upcasting
        
        
        a.sound();  // Outputs: Dog barks
        
        
    }
}
