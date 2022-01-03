package alghoritms.StringExercises;

public class IsStringPalindrome {

    public static void main(String[] args) {
        System.out.println(isStringPalindrome("anavolimilovana"));
    }

    static boolean isStringPalindrome(String s){
        boolean palindrome = true;
        for (int i = 0; i<(s.length()/2); i++){
            if(s.charAt(i)!= s.charAt(s.length()-1-i)){
                palindrome = false;
                break;
            }
        }
        return palindrome;
    }
}
