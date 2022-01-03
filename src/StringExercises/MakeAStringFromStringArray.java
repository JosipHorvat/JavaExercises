package StringExercises;

import konstante.Lista;

import java.util.Arrays;
import java.util.Collections;

public class MakeAStringFromStringArray {

    public static void main(String[] args) {
        //sort(Lista.names);
        reverseSort(Lista.names);
        System.out.println(changeArrayTo1String(Lista.names));
        System.out.println(containsSpecifiedSeqOfChars(changeArrayTo1String(Lista.names), "Josip"));
    }

    static String changeArrayTo1String(String[] arr){
        String s = "";
        for(int i = 0; i< arr.length; i++){
            s = s+arr[i] + " ";
        }
        return s;
    }

    static void sort(String[] arr){
        Arrays.sort(arr);
    }
    static void reverseSort(String[] arr){
        Arrays.sort(arr,Collections.reverseOrder());
    }

    static boolean containsSpecifiedSeqOfChars(String s, String s2){
       if(s.contains(s2)) {
           return true;
       }
           return false;
    }

}
