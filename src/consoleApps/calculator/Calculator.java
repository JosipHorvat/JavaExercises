package consoleApps.calculator;

import alghoritms.konstante.Lista;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        mainMenu();
    }

    private static double algorithms(double a, double b, String c) {
        String s = "";
        if (c.equals("*") || c.equals("X") || c.equals("x")) {
            return a * b;
        }
        if (c.equals("/")) {
            if (a == 0.0 || b == 0) {
                return 0;
            }
            return a / b;
        }
        if (c.equals("-")) {
            return a - b;
        }
        if (c.equals("+")) {
            return a + b;
        }
        if (c.equals("%")) {
            return a % b;
        } else {
            System.out.println("Wrong input");
            return 0;
        }
    }

    private static String[] values(String s) {
        String[] values = s.split(" ");
        return values;
    }

    private static void calculate() {
        Scanner input = new Scanner(System.in);
        String calculate = input.nextLine();
        String[] s = values(calculate);

        try {
            double a = Double.parseDouble(s[0]);
            String b = s[1];
            double c = Double.parseDouble(s[2]);
            System.out.println(algorithms(a, c, b));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(Lista.WARNING_MESSAGE);
            calculate();
        } catch (NumberFormatException e) {
            System.out.println(Lista.WARNING_MESSAGE);
            calculate();
        }

    }

    private static void mainMenu() {
        Lista.OPTIONS_MENU();
        option();
    }

    private static void option() {
        Scanner input = new Scanner(System.in);
        while (true) {
            String i = input.nextLine();
            if (i.equals("1")) {
                String s = "This is simple calculator " +
                        "and it can do addition \n subtraction, multiplication, division, and modular forms. " +
                        "\n in pattern  11 + 11 followed by enter";
                System.out.println(s);
                System.out.println("\n Press 2 to calculate, anything else to quit");
                i = input.nextLine();

            }
            if (i.equals("2")) {
                System.out.println("Please insert your values:");
                calculate();
            } else {
                break;
            }
        }
    }

}
