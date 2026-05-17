// Given a non-negative integers representing bars where width of each bar is 1.compute how much water can be trapped after raining.
// Given the bar height =[4,2,0,6,3,2,5]


package DSA_questions;


public class trapped_water {
    
    public static int trapped(int height[]){
        
        //left max height
        int left_max[] = new int[height.length]; 
        left_max[0] = height[0];
        for(int i = 1;i<height.length;i++){
            left_max[i] = Math.max(height[i],left_max[i-1]);
        }
        
        //right max height
        int right_max[] = new int[height.length];
        right_max[height.length - 1] = height[height.length -1];
        for(int i =height.length-2;i>=0;i--){
            right_max[i] = Math.max(height[i],right_max[i+1]);
        }
        
        int trapped_water = 0;
        int width = 1;

        //minimum of left max height and right max height = water level
        for(int i = 0;i<height.length;i++){
            int water_level = Math.min(left_max[i] , right_max[i]);

            //trapped water = (water level - bar level)*width 

            trapped_water += (water_level - height[i]) * width;

        }
        return trapped_water;

          
    }


    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        trapped(height);
        System.out.println("trapped water : " +trapped(height));
    }

}
