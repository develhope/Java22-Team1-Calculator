//import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

//BONUS Ricreare tutti i metodi precedenti (tranne la potenza) permettendo di lavorare
// con una lista di numeri anzichè essere limitati solo a 2 numeri in ingresso.
// Tutti i metodi dovranno restituire i risultati come per i metodi limitati a 2 valori in ingresso.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Programma Calcolatrice: ");

        System.out.println("Scegli quanti numeri usare");
        int numElementi = sc.nextInt();

        double[] numeri = new double[numElementi];

        for (int i = 0; i < numeri.length; i++) {
            System.out.println("Scegli il numero " + (i + 1) + " di " + numElementi);
            numeri[i] = sc.nextDouble();
        }

        System.out.println(Arrays.toString(numeri));

        System.out.println("Scegli l'operazione da effettuare:");
        System.out.println("Premi + per la somma");
        System.out.println("Premi - per la sottrazione");
        System.out.println("Premi / per la divisione");
        System.out.println("Premi * per la moltiplicazione");
        System.out.println("Premi % per conoscere il modulo:");
        System.out.println("Premi $ per sapere se i numeri sono pari o dispari:");

        String scelta = sc.next();

        double[][] evensAndOdds = oddOrEven(numeri);

        boolean isAllowed = false;

        String[] allowedChar = {"%", "+", "-", "/", "^", "*"};

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

        switch (scelta) {
            case "+":
                System.out.println("La somma dei numeri: " + Arrays.toString(numeri) + " = " + addizione(numeri));
                break;
            case "-":
                System.out.println("La sottrazione dei numeri: " + Arrays.toString(numeri) + " = " + sottrazione(numeri));
                break;
            case "/":
                System.out.println("La divisione dei numeri: " + Arrays.toString(numeri) + " quoziente = " + divisione(numeri));
                break;
            case "*":
                System.out.println("La moltiplicazione dei numeri: " + Arrays.toString(numeri) + " = " + moltiplicazione(numeri));
                break;
            case "%":
                System.out.println("Il modulo della divisione dei numeri: " + Arrays.toString(numeri) + "=" + modulo(numeri));
                break;
            case "$":
                System.out.println("I numeri pari sono: " + Arrays.toString(evensAndOdds[0]) + " ed i numeri dispari sono: " + Arrays.toString(evensAndOdds[1]));
                break;
        }

    }

    public static double addizione(double[] num) {
        double somma = num[0];
        for (int i = 1; i < num.length; i++) {
            somma += num[i];
        }
        return somma;
    }

    public static double[][] oddOrEven(double[] num) {
        double[] evens = new double[0];
        double[] odds = new double[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                double[] temp = new double[evens.length + 1];
                System.arraycopy(evens, 0, temp, 0, evens.length);

                temp[evens.length] = num[i];

                evens = temp;
            } else {
                double[] temp1 = new double[odds.length + 1];
                System.arraycopy(odds, 0, temp1, 0, odds.length);

                temp1[odds.length] = num[i];

                odds = temp1;
            }

        }
        double[][] together = {evens, odds};
        return together;
    }

    public static double moltiplicazione(double[] num) {
        double molt = num[0];
        for (int i = 1; i < num.length; i++) {
            molt *= num[i];
        }
        return molt;
    }

    public static double sottrazione(double[] num) {
        double sottr = num[0];
        for (int i = 1; i < num.length; i++) {
            sottr -= num[i];
        }
        return sottr;
    }

    public static double divisione(double[] num) {
        double div = num[0];
        for (int i = 1; i < num.length; i++) {
            div /= num[i];
        }
        return div;
    }

    public static double modulo(double[] num) {
        double mod = num[0];
        for (int i = 1; i < num.length; i++) {
            mod %= num[i];
        }
        return mod;
    }


}



