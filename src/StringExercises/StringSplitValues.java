package StringExercises;

import java.util.ArrayList;
import java.util.List;

public class StringSplitValues {

    public static void main(String[] args) {

        String s = "id,name,age,act.,room,dep.\n1,Jack,68,T,13,8\n17,Betty,28,F,15,7";
        String c = "age";
        System.out.println(findMaxValue(s,c));
    }
    static int findMaxValue(String S, String C) {
        int indexColumn = 0;

        List<Integer> max = new ArrayList<>();

        String[] arr = S.split("\\n");

        String[] columns = arr[0].split(",");

        for (int i =0; i< columns.length; i++){
            if(columns[i].equals(C)){
                indexColumn = i;
                break;
            }
        }
        for(int i = 1; i< arr.length; i++){
            String[] row = arr[i].split(",");
            max.add( Integer.parseInt(row[indexColumn]));
        }

        return max.stream().mapToInt(i -> i).max().orElse(0) ;
    }
}
