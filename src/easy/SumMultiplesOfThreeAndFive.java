package easy;

public class SumMultiplesOfThreeAndFive {

    public static void main(String[] args) {
        System.out.println(sum(20));
    }
    static Integer sum(Integer n){
        Integer sum = 0;

        for(int i = 0; i<=n; i++){
            if(i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }
        return sum;
   }
}
