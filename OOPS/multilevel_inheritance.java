package OOPS;

public class multilevel_inheritance {
    public static void main(String[] args) {
        
        Dog dobby = new Dog();

        dobby.eat();


    }
}

class Animals{
    String Color;

    void eat(){
        System.out.println("can eats");
    }
}
 class Mammal extends Animals{
    int legs;
 }

 class Dog extends Mammal{
    String breed;

    void bark(){
        System.out.println("can bark");
    }
 }