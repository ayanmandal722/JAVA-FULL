public class studentClass {
    static class student { // Made the inner class static
        String name;
        int r_no;
        double percentage;
    }

    public static void fun(student x) {
        System.out.println(x.name);
    }

    public static void main(String[] args) {
        student s1 = new student(); // No need for an outer class instance now
        s1.name = "ayan";
        s1.r_no = 76;
        s1.percentage = 92.8;
        System.out.println(s1.name);
        s1.name = "rahul";
        System.out.println(s1.name);
    }
}