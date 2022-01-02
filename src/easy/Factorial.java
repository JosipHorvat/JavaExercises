package easy;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(  factorial(5));
    }
     static Integer factorial(Integer n){
        int factorialSum = n;
        for (int i = n -1; i > 0 ; i--){
            factorialSum = factorialSum * i;
        }
        return factorialSum;
     }
}
