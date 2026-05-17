package String;
import java.util.*;
public class string_basics {
    
    public static void main(String[] args) {
        
        String str = "abcd";
        String str2 = new String("hello");    //line 7 and 6 defines same thing
        
        Scanner sc = new Scanner(System.in);

        //String name = sc.next();
        //System.out.println(name);
                    //next sirf dene pe string me first word sirf print hoga .if input is "Tony Stark" then output will be only "Tony".

        String name1 = sc.nextLine();
        System.out.println(name1);
                    //to print the whole string we have to use 'nextLine'.so for input of "Tony Stark" it will give "Tony Stark"
    }
}
