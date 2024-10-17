class Animal {
    public void sound() {
        System.out.println("animal make sound");
    }
}

class Dog extends Animal {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        System.out.println("Dog barks");
    }
}
class cat extends Animal {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        System.out.println("Dog barks");
    }
}