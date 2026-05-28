//given a man is moving 1 unit to different direction .we have to find the shortest path from the origin.
//if the man goes north then east then again east then south then west  now how much he is far from origin
//N - North , S - South , E - East , W - West


package String;

public class shortest_path_compass {

    public static float position(String str , int x,int y){
        int x1 = x;
        int y1 = y;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == 'N'){
                y++;
            }
            else if(str.charAt(i) == 'S'){
                y--;
            }
            else if(str.charAt(i) == 'E'){
                x++;
            }
            else if(str.charAt(i) == 'W'){
                x--;
            }
        }
        
        return (float)Math.sqrt(((x1-x)*(x1-x))+((y1-y)*(y1-y)));

        
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        int x = 0;
        int  y = 0;
        System.out.println(position(str,x,y));
    }
}
