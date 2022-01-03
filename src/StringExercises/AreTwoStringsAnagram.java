package StringExercises;

import java.util.Arrays;
import java.util.Locale;

public class AreTwoStringsAnagram {

    public static void main(String[] args) {
        System.out.println(areAnagram("Josip", "Pisoj"));
    }

    static boolean areAnagram(String s1, String s2){

        // Strings need to go to lover case in case first char of 2 words is capital
        s1 = s1.toLowerCase(Locale.ROOT);
        s2 = s2.toLowerCase(Locale.ROOT);

        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        int s1Length = str1.length;
        int s2Length = str2.length;

        // If length of 2 string is not same, they can't be anagrams
        if(s1Length != s2Length){
            return false;
        }
        Arrays.sort(str1);
        Arrays.sort(str2);

        //After arrays are sorted we check if chars match each other, if not, they are not anagrams
        for (int i = 0; i < s1Length; i++)
            if (str1[i] != str2[i])
                return false;

        return true;
    }
}
