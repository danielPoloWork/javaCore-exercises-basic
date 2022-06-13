public class Exercise0120220613 {
    /*
     * Scrivere un algoritmo che faccia la somma di tutti i numeri contenuti in un array di dimensione finita
     */
    public static void main(String[] args) {
        int[] array = {2, 8, 14, 16, 25, 25, 37, 33, 41, 49};
        int sum = 0;

        for (int a : array) {
            sum += a;
        }

        System.out.println("Sum: " + sum);
    }
}