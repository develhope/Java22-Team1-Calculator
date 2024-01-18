import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Programma Calcolatrice: ");

        System.out.println("Scegli l' operazione da effettuare:");
        System.out.println("Premi 1 per la somma");
        System.out.println("Premi 2 per la sottrazione");
        System.out.println("Premi 3 per la divisione");
        System.out.println("Premi 4 per la moltiplicazione");

        System.out.println("Premi 5 per sapere se sono numeri pari o dipari:");
        System.out.println("Premi 6 per elevare il primo numero alla potenza del secondo:");
        int scelta = sc.nextInt();

        System.out.println("Inserisci il primo numero:");
        double num1=sc.nextDouble();

        System.out.println("Inserisci il secondo numero");
        double num2=sc.nextDouble();

        double [] divisione = division (num1,num2);
        double quoziente = divisione[0];
        double resto = divisione[1];

        switch (scelta){
            case 1:
                System.out.println("La somma dei numeri: " + num1 + " + " + num2 + " = " + sum(num1,num2));
                break;
            case 2:
                System.out.println("La sottrazione dei numeri: " + num1 + " - " + num2 + " = " + subtraction(num1,num2));
                break;
            case 3:
                System.out.println("La divisione dei numeri: " + num1 + " / " + num2 + " : " + " quoziente = " + quoziente + " resto = " + resto);
                break;
            case 4:
                System.out.println("La moltiplicazione dei numeri: " + num1 + " * " + num2 + " = " + multiplication(num1,num2));
                break;
            case 5:
                System.out.println("I numeri sono: ");
                break;
            case 6:
                System.out.println("L' elevazione alla potenza dei numeri: " + num1 + " di " + num2 + " = ");
                break;
        }
    }
    public static double sum(double num1, double num2){
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double[] division (double num1, double num2) {
        double quoziente = num1 / num2;
        double resto = num1 % num2;

        return new double[]{quoziente, resto};
    }
    public static double multiplication (double num1, double num2){
        return num1 * num2;
    }
}