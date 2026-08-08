// Superclass (Parent class)
 class Animal {
    public void sound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass (Child class)
 class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();
        myDog.bark();
    }
}
