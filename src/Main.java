import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programma calcolatrice: ");

        System.out.println("Inserisci il primo numero:");
        int x=sc.nextInt();

        System.out.println("Inserisci il secondo numero");
        int y=sc.nextInt();

        System.out.println("Scegli l' operazione da effettuare:");
        System.out.println("Premi 1 per la somma");
        System.out.println("Premi 2 per la sottrazione");
        System.out.println("Premi 3 per la divisione");
        System.out.println("Premi 4 per la moltiplicazione");
        int scelta = sc.nextInt();

        switch (scelta){
            case 1:
              int somma= x+y;
                System.out.println("la somma e' : "+ somma);
               break;
            case 2:


        }



    }

}
