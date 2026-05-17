import java.util.*;

public class total_cost {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();
        float total_cost = A + B + C;
        float gst = (118 * total_cost)/100;
        System.out.println(total_cost);
        System.out.println(gst);
    }
}
