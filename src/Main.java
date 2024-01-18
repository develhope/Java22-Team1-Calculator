import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programma calcolatrice: ");

        System.out.println("Inserisci il primo numero:");
        double num1=sc.nextInt();

        System.out.println("Inserisci il secondo numero");
        double num2=sc.nextInt();

        System.out.println("Scegli l' operazione da effettuare:");
        System.out.println("Premi 1 per la somma");
        System.out.println("Premi 2 per la sottrazione");
        System.out.println("Premi 3 per la divisione");
        System.out.println("Premi 4 per la moltiplicazione");
        int scelta = sc.nextInt();






    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

}


// commento