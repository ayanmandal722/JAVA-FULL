package OOPS;

public class Object_and_class {
    public static void main(String[] args) {
        pen p1 = new pen();  //calling the class to make a new space in heap memory as pen
        p1.setColor("Blue"); //setting color to color in class pen
        System.out.println(p1.Color);

        p1.Tip = 5;
        System.out.println(p1.Tip);
    
    }
}

class pen{
    String Color;
    int Tip;

    void setColor(String newColor){
        Color = newColor;
    }

    void setTip(int newTip){
        Tip = newTip;
    }

    
}
