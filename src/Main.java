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
        double x=sc.nextDouble();

        System.out.println("Inserisci il secondo numero");
        double y=sc.nextDouble();


        switch (scelta){
            case 1:
                System.out.println("La somma dei numeri: " + x + " + " + y + " = " + somma(x,y));
                break;
            case 2:
                System.out.println("La sottrazione dei numeri: " + x + " - " + y + " = " + (x,y));
                break;
            case 3:
                System.out.println("La divisione dei numeri: " + x + " / " + y + " = " + (x,y));
                break;
            case 4:
                System.out.println("La moltiplicazione dei numeri: " + x + " * " + y + " = " + (x,y));
                break;
            case 5:
                System.out.println("I numeri sono: ");
                break;
            case 6:
                System.out.println("L' elevazione alla potenza dei numeri: " + x + " di " + y + " = " +(x,y));
                break;
        }
    }
    public static double somma(double x, double y){
        return x + y;
    }
}
