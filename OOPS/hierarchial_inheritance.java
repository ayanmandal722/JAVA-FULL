
public class hierarchial_inheritance {
    public static void main(String[] args) {
        Bird parrot = new Bird();
        parrot.fly();
        parrot.eat();
    }
}
class Animal{
    String Colour;

    void eat(){
        System.out.println("can eat");
    }
    void breathe(){
        System.out.println("can breathe");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("can swim");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("can fly");
    }
}

class Mammals extends Animal{
    void walk(){
        System.out.println("can walk");
    }
}
