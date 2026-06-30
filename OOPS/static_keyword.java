public class static_keyword {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "Ayan";
        s1.SchoolName = "KDHS";

        Student s2 = new Student();
        s2.name = "Akash";

        System.out.println(s2.SchoolName);

    }
}

class Student{

    String name;
    int roll;

    static String SchoolName;

    void setSchoolName(String name){
        this.name = name;
    }

    String getSchoolName(){
        return this.name;
    }
}
