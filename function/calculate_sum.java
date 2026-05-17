
import java.util.*;


public class calculate_sum {
    public static void CalculateSum(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("Sum is : " +sum);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        CalculateSum(num1,num2);
    }   
}

// // here is another code of returning integer type function

// import java.util.*;


// public class calculate_sum {
//     public static int CalculateSum(int num1, int num2){
//         int addition = num1 + num2;
//         return addition;            
//     }
                              // //returning addition as integer



//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter numbers : ");
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();

//         int sum = CalculateSum(num1 , num2);   //additon value is calling here and storing in sum
//         System.out.println("Sum is : " +sum);
//     }
// }
