package alghoritms.easy;

import alghoritms.konstante.Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUpperCaseLambdaStream {

    public static void main(String[] args) {
//        System.out.println(upperCase(Lista.stringList()));
//        System.out.println(Lista.randomChar());
        System.out.println(upperCase3(Lista.stringList()));
    }

    static List<String> upperCase(List<String> list){
        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    static List<String> upperCase2(List<String> list){
        list.replaceAll(String::toUpperCase);

        return list;
    }

    static List<String> upperCase3(List<String> list){
        List<String> upper = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
        upper.add(list.get(i).toUpperCase());
        }
        return upper;
        }

}
