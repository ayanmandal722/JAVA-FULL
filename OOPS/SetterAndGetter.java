package OOPS;

public class SetterAndGetter {
    public static void main(String[] args) {
        pen p1 = new pen(); 
        p1.setColor("Blue");
        System.out.println(p1.getColor());
    
    }
    }

class pen{
    private String Color;

    String getColor(){
        return this.Color;
    }

    void setColor(String newColor){
        this.Color = newColor;
    }

    
}       //run via terminal

