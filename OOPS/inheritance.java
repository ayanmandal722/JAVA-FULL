package OOPS;

public class inheritance {
    public static void main(String[] args) {
        Fish Shark = new Fish();

        Shark.eat();
    }
}


//Base class

class Animal{
    String color;

    void eat(){
        System.out.println("animal eats");
    }

    void walk(){
        System.out.println("animal can jump");
    }
}

//derived class

class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("fish can swim");
    }
}
