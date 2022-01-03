package moderate;

import konstante.Lista;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    public static void main(String[] args) {

        System.out.println(isPrime(10));
        System.out.println(primeNumbers(Lista.intArr()));
    }

    static boolean isPrime(Integer n){
        boolean isItPrime = true;
        if(n <= 1)
        {
            isItPrime = false;
            return isItPrime;
        }
        else
        {
            for (int i = 2; i<= n/2; i++)
            {
                if ((n % i) == 0)
                {
                    isItPrime = false;

                    break;
                }
            }

            return isItPrime;
        }
    }


    static List primeNumbers(int[] numbers){
        List<Integer>  primeNumbers = new ArrayList<>();
        for(int i =0; i< numbers.length; i++){
            if(isPrime(numbers[i])){
               primeNumbers.add(numbers[i]);
            }
        }
        return primeNumbers;
    }




}
