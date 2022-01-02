package moderate;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

//    Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
//    For numbers which are multiples of both three and five return 'FizzBuzz'.
//    For numbers that are neither, return the input number.

    public static void main(String[] args) {
      //  System.out.println(fizzBuzzInForLoop(100));
        System.out.println(fizzToString(fizzBuzzInForLoop(20)));
    }

    static String fizzBuzz(Integer i) {
        String result = "";
        if(i % 3 == 0){
            result += "Fizz";
        }
        if(i % 5 == 0){
            result += "Buzz";
        }
        if(result.equals("")){
            result = i.toString();
        }
        return result;
    }


    static List fizzBuzzInForLoop(int n){
        String result = "";
        List l = new ArrayList();
        for (int i = 0; i<=n; i++){
            result = "";
            if(i % 3 == 0){
                result += "Fizz";
                l.add(result);
            }
            if(i % 5 == 0){
                result += "Buzz";
                l.add(result);
            }
            if(result.equals("")){
                result += n;
                l.add(result);
            }
        }
        return l;
    }

    static String fizzToString(List<String> l){
        String s = "";
        for(int i = 0; i< l.size(); i++){
            s += l.get(i) + " ";
            if(i % 10 == 0){
                s+= "\n";
            }
        }
        return s;
    }

}
