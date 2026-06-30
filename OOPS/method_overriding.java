//parent and child class both have same function with different defination

public class method_overriding {
    public static void main(String[] args) {
        Deer deer = new Deer();
        deer.eat();
    }

}

class Animal{
    void eat(){
        System.out.println("eats everything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}