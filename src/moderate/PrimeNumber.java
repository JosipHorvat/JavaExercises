package moderate;

public class PrimeNumber {

    public static void main(String[] args) {

        System.out.println(isPrime(10));
    }

    static boolean isPrime(Integer n){
        boolean isPrime = true;
        for (int i = n -1; i> 1; i--){
            if(n % i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }
}
