package OOPS;

public class Copy_constructor {
    public static void main(String[] args) {

        student s1 = new student();

        s1.marks[0] = 78;
        s1.marks[1] = 34;
        s1.marks[2] = 45;

        student s2 = new student(s1);

        System.out.println("Marks of s2:");

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class student {

    int marks[];

    // Default Constructor
    student() {
        marks = new int[3];
    }

    // Copy Constructor (Shallow Copy)
    student(student s1) {
        this.marks = s1.marks;
    }
}


//run in terminal manually