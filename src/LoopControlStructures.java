import java.util.Arrays;

public class LoopControlStructures {

    public static void main(String[] args) {
        /** LOOP CONTROL STRUCTURES: WHILE */
        int a =0;

        while (a < 5) {
            System.out.println("Switch loop a index: " + a);
            a++;
        }

        /* while (true) {
            break;
        } loop infinito */

        /** LOOP CONTROL STRUCTURES: FOR */
        for (int b = 0; b < 5; b++) {
            System.out.println("For loop b index: " + b);
        }

        int[] arrayInts1 = new int[10];

        for (int c = 0; c < arrayInts1.length; c++) {
            arrayInts1[c] = c + 1;
            System.out.println("For loop c index: " + arrayInts1[c]);
        }

        System.out.println("Array values: " + Arrays.toString(arrayInts1));

        /** LOOP CONTROL STRUCTURES: FOR EACH */
        int sumInts = 0;
        int[] arrayInts2 = new int[10];

        // for each
        for (int d: arrayInts2) {
            System.out.println("For loop d index: " + d);
            sumInts += d;
        }

        System.out.println("sumInts ==> " + sumInts);
    }
}