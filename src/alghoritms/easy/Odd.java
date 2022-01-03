package alghoritms.easy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Odd {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i<=100; i++){
            l.add(i);
        }

        System.out.println( oddNumbersInList(l));
        System.out.println(biggestOddNumberInAList(l));
        System.out.println(biggestOddNumberInAList2(l));
    }


    static List oddNumbersInList(List<Integer> numbers){
        List<Integer> odd = new ArrayList<>();
        for (int i = 0; i< numbers.size(); i++){
            if(numbers.get(i) % 2 ==1 ){
                odd.add(i);
            }
        }
        return odd;
    }

    static int biggestOddNumberInAList(List<Integer> numbers){
        List<Integer> odd = new ArrayList<>();
        int biggestOdd = 1;

        for (int i = 0; i< numbers.size(); i++){
            if(numbers.get(i) % 2 ==1 ){
                odd.add(i);
            }
        }

        for(int i = 0; i<odd.size(); i++){
            if(odd.get(i) > biggestOdd){
                biggestOdd = odd.get(i);
            }
        }
        return biggestOdd;
    }

    static int biggestOddNumberInAList2(List<Integer> numbers){
        Iterator<Integer> it = numbers.iterator();
        int max = 0;
        while (it.hasNext()){
            int num = it.next();

            if(num% 2 == 1){
                if(num> max){
                    max = num;
                }
            }
        }
        return max;
    }
}


