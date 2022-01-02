package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {

    public static void main(String[] args) {
        String s = "Josip";
     //   System.out.println(reverse2(s));
     //   System.out.println(reverseListIterator(s));
        System.out.println(reversBySwappingVariables(s));
    }

    static String reverse(String s){
        StringBuilder builder = new StringBuilder(s);
        return builder.reverse().toString();
    }

    static String reverse2(String s){
      char[] a = s.toCharArray();
      String reverse = "";
      for(int i = a.length-1; i >= 0; i--){
          reverse += a[i];
      }
      return reverse;
    }

    static String reverseListIterator(String s){
        char[] charList = s.toCharArray();
        List<Character> list = new ArrayList<>();
        String reverse = "";
        for (char c : charList){
            list.add(c);
        }
         Collections.reverse(list);
        ListIterator li = list.listIterator();
        while (li.hasNext()){

            reverse += li.next();
        }
        return reverse;
    }

    static String reversBySwappingVariables(String s){
        char[] temp = s.toCharArray();
        int left, right;
        String reverse = "";
        right = temp.length -1;
        for (left = 0; left<right; left++, right--){
            char t = temp[left];
            temp[left] = temp[right];
            temp[right]= t;
        }
        for (char c : temp){
            reverse += c;
        }
        return reverse;
    }
}
