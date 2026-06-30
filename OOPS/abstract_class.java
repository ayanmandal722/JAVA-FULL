
public class abstract_class {
    public static void main(String[] args) {
        
        Chicken ch = new Chicken();
        ch.walk();

        ch.eat();
    }    
}

abstract class Animal{    //class has to be abstract to make any abstract method inside it
    void eat(){
        System.out.println("Animal eats");
}
    abstract void walk();    //abstact method dont need any implementation inside it
}

//here walk is abstract so all the class which extends animal must have to keep the walk function

class Dog extends Animal{
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {
    void walk(){
        System.out.println("walks on 2 legs");
    }
}

