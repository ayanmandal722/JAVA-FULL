//given a string convert each the first letter of each word to UpperCase

package String;

public class convert_to_UpperCase {

    public static String UpperCase(String str){
        StringBuilder sb = new StringBuilder(" ");
        // made an empty stringbuilder to store all charecter one by one

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        //for first letter

        for(int i = 1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                //finding space means to get next word

                sb.append(str.charAt(i));
                //appends the space
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
                //appends the next letter by making to Uppercase
            }

            else{
                sb.append(str.charAt(i));
            }
            
        }
        return sb.toString();
        //converting StringBuilder to String

        
    }

    public static void main(String[] args) {
        String str = "hi, i am ayan";
        System.out.println(UpperCase(str));
    }
}
