package Recursion;

public class dublicate_charecter {
    public static void main(String[] args) {
        String str = "ayan mandal";
        StringBuilder newStr = new StringBuilder("");
        removeDublicate(str , 0 , newStr , new boolean[26]);
    }

    public static void removeDublicate(String str , int idx , StringBuilder newStr , boolean map[]){

        
        //base case
        if(idx == str.length()){
            System.out.print(newStr);
            return ;
        }


        //dublicate check
        char currChar = str.charAt(idx);

        

        //already exist
        if((currChar == ' ') || map[currChar -'a'] == true){
            removeDublicate(str , idx+1 , newStr , map);
        }

        //not exist in unique string
        else{
            map[currChar - 'a'] = true;

            removeDublicate(str , idx+1 , newStr.append(currChar) , map);
        }
    }
}
