package String;

public class charecter_print_of_string {
    
    public static void PrintChar(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");   //charAt(i) means to print the element of i index
        }
    }
    public static void main(String[] args) {
        
        String str = "hello";

        PrintChar(str);
    }
}
