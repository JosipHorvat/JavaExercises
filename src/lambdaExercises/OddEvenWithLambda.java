package lambdaExercises;

import lambdaExercises.functionalInterface.EvenOdd;
import lambdaExercises.functionalInterface.IsEvenOdd;
import lambdaExercises.functionalInterface.PrintVoid;
import lambdaExercises.functionalInterface.PrintWithParameter;

import java.util.function.Predicate;

public class OddEvenWithLambda {

    public static void main(String[] args) {
        // Anonymous class impl.
        EvenOdd evenOdd = new EvenOdd() {
            @Override
            public void check(int a) {
                if (a % 2 == 0) {
                    System.out.println("Number is even");
                } else {
                    System.out.println("Number is odd");
                }
            }
        };
        evenOdd.check(3);

        // Lambda simple
        EvenOdd eo = (int a) -> {
            if (a % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }
        };

        // Lambda bit shorter
        EvenOdd e = a -> {
            if (a % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }
        };
       e.check(54);

        // Lambda && ternary
        PrintWithParameter p = (int b) -> {
            String s = (b % 2 == 0) ? "Number is even" : "Number is odd";
            return s;
        };
        System.out.println(p.printWithParameter(6));

        // boolean type
        IsEvenOdd isEvenOdd = (int i) -> (i % 2 == 1);
        PrintVoid pv = () -> System.out.println(isEvenOdd.isOdd(6));
        pv.print();


    }
 }



