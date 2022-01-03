package alghoritms.easy;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(  search(5, new Integer[]{1,2,3,4,5,6,7}));
    }

    static int search(Integer n, Integer[] list){

        Integer index = -1;
        for(int i = 0; i< list.length; i++){
            if (n.equals(list[i])){
                index = i;
                break;
            }
        }
        return index;
    }
}
