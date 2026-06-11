package OOPS;

public class Constructor {
    public static void main(String args[]){
        student s1 = new student("Ayan");
        System.out.println(s1.name);
    }
    
}
 class student{
    String name;
    student(String name){
        this.name = name;
    }
 }

