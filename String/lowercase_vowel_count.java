//Count how many times lowercase vowels occurred in a String entered by the user.


package String;

public class lowercase_vowel_count {

    public static int countVowel(String str){
        String vowel = "aeiou";
        int count  = 0;
        for(int i = 0;i<vowel.length();i++){
            for(int j = 0;j<str.length();j++){
                if(vowel.charAt(i) == str.charAt(j) && Character.isLowerCase(str.charAt(j))){
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        String str = "Ayan";
        System.out.println(countVowel(str));
    }
}
