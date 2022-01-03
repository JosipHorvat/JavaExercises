package alghoritms.easy;

import alghoritms.konstante.Lista;

import java.util.List;

public class LargestIntegerInAList {

    public static void main(String[] args) {


        System.out.println(maximum(Lista.IntegerArr()));
        System.out.println(maximum2( Lista.list()));
    }

    static Integer maximum(Integer[] list){
        int largest = 0;
        for (int i : list){
            if(i>largest){
                largest = i;
            }
        }
        return largest;
    }

    static Integer maximum2(List<Integer> list){
        List<Integer> arrayList = list;
        int largest = arrayList.stream()
                .max(Integer::compareTo)
                .get();
        return largest;
    }
}
