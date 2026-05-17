//write a code to print the sum of odd and even numbers of given integers


import java.util.*;
public class sum_of_odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int option;
        int even_sum = 0;
        int odd_sum = 0;
        do{
            System.out.println("Enter the number : ");
            number = sc.nextInt();
            
            if(number % 2 == 0){
                even_sum += number;
            }
            else{
                odd_sum += number;
            }

            System.out.println("Do you want to continue.press 1 for continue or any other number for result");
            option = sc.nextInt();
        } while(option == 1);

        System.out.println("Sum of even number is : " +even_sum);
        System.out.println("Sum of odd number is : " +odd_sum);
    }
}
