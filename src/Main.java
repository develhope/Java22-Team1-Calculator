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
        System.out.println("Premi n per elevare il primo numero alla potenza del secondo:");
        String scelta = sc.next();

        System.out.println("Inserisci il primo numero:");
        double num1=sc.nextDouble();

        System.out.println("Inserisci il secondo numero");
        double num2=sc.nextDouble();


        switch (scelta){
            case "+":
                System.out.println("La somma dei numeri: " + num1 + " + " + num2 + " = " + somma(num1,num2));
                break;
            case "-":
                System.out.println("La sottrazione dei numeri: " + num1 + " - " + num2 + " = " + subtraction(num1,num2));
                break;
            case "/":
                System.out.println("La divisione dei numeri: " + num1 + " / " + num2 + " = " + (num1,num2));
                break;
            case "*":
                System.out.println("La moltiplicazione dei numeri: " + num1 + " * " + num2 + " = " + (num1,num2));
                break;
            case "%":
                System.out.println("I numeri sono: ");
                break;
            case "n":
                System.out.println("L' elevazione alla potenza dei numeri: " + num1 + " di " + num2 + " = " +(num1,num2));
                break;
        }
    }
    public static double somma(double num1, double num2){
        return num1 + num2;
    }
}
