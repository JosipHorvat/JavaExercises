package alghoritms.easy;

import alghoritms.konstante.Lista;

import java.util.List;

public class AverageValueLambda {

    public static void main(String[] args) {

        System.out.println(average(Lista.list()));
        System.out.println(averageWithoutStreams(Lista.list()));
        System.out.println(averageWithoutStreams(Lista.intArr()));

    }

    static Double average(List<Integer> list){
        return list.stream()
                .mapToInt(i -> i)
                .average()
                .getAsDouble();
    }

    static double averageWithoutStreams(List<Integer> list){
        Integer sum = 0;
        if(!list.isEmpty()){
            for(Integer number : list){
                sum += number;
            }
            return sum.doubleValue() / list.size();
        }
        return sum;
    }

    static double  averageWithoutStreams(int[] arr){
        double sum = 0;
        if(arr.length > 0){
            for(int i =0; i< arr.length; i++){
                sum+= arr[i];
            }
            return sum /arr.length;
        }
        return sum;
    }
}
