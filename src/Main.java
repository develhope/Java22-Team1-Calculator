import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Programma Calcolatrice: ");
        System.out.println("Scegli l' operazione da effettuare:");
        System.out.println("Premi + per la somma");
        System.out.println("Premi - per la sottrazione");
        System.out.println("Premi / per la divisione");
        System.out.println("Premi * per la moltiplicazione");
        System.out.println("Premi % per sapere se sono numeri pari o dipari:");
        System.out.println("Premi ^ per elevare il primo numero alla potenza del secondo:");
        String scelta = sc.next();

        String[] allowedChar = {"%", "+", "-", "/", "^", "*"};

        boolean isAllowed = false;

        for (String allowed : allowedChar) {
            if (scelta.equals(allowed)) {
                isAllowed = true;
                break;
            }
        }
        if (!isAllowed) {
            System.out.println("Character was not allowed");
            return;
        }

        if (scelta.equals("%")) {
            System.out.println("Inserisci il numero");
            int num3 = sc.nextInt();
            oddOrEven(num3);
            return;
        }

        System.out.println("Inserisci il primo numero:");
        double num1 = sc.nextDouble();

        System.out.println("Inserisci il secondo numero");
        double num2 = sc.nextDouble();

        double[] divisione = division(num1, num2);
        double quoziente = divisione[0];
        double resto = divisione[1];

        switch (scelta) {
            case "+":
                System.out.println("La somma dei numeri: " + num1 + " + " + num2 + " = " + sum(num1, num2));
                break;
            case "-":
                System.out.println("La sottrazione dei numeri: " + num1 + " - " + num2 + " = " + subtraction(num1, num2));
                break;
            case "/":
                System.out.println("La divisione dei numeri: " + num1 + " / " + num2 + " : " + " quoziente = " + quoziente + " resto = " + resto);
                break;
            case "*":
                System.out.println("La moltiplicazione dei numeri: " + num1 + " * " + num2 + " = " + multiplication(num1, num2));
                break;
            case "^":

                System.out.println("L' elevazione alla potenza dei numeri: " + num1 + " di " + num2 + " = " + exponentiation(num1, num2));
                break;
        }
    }


    public static double sum(double num1, double num2) {
        return num1 + num2;

    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double[] division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("warning: number not divisible by zero");
            return new double[]{0, 0};
        }
        double quoziente = num1 / num2;
        double resto = num1 % num2;

        return new double[]{quoziente, resto};
    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static double exponentiation(double base, double exponent) {
        double result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }


        return result;
    }


    public static void oddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println("Number " + num + " is even");
        } else {
            System.out.println("Number " + num + " is odd");
        }
    }
}
//