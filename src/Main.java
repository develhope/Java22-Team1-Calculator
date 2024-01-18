import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programma calcolatrice: ");

        System.out.println("Inserisci il primo numero:");
        double x=sc.nextDouble();

        System.out.println("Inserisci il secondo numero");
        double y=sc.nextDouble();

        System.out.println("Scegli l' operazione da effettuare:");
        System.out.println("Premi 1 per la somma");
        System.out.println("Premi 2 per la sottrazione");
        System.out.println("Premi 3 per la divisione");
        System.out.println("Premi 4 per la moltiplicazione");
        int scelta = sc.nextInt();
        switch (scelta){
            case 1:
                System.out.println("La somma dei numeri: " + x + " + " + y + " = " + somma(x,y));
                break;
            case 2:

        }
    }
    public static double somma(double x, double y){
        double add = x + y;
        return add;
    }

}
