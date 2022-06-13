public class Exercise0220220613 {
    /*
     * Trovare la media dei valori contenuti nell'array e stamparlo a schermo.
     */
    public static void main(String[] args) {
        int[] array = {2, 8, 14, 16, 25, 25, 37, 33, 41, 49};
        int sum = 0;

        for (int a : array) {
            sum += a;
        }

        int average = (sum / array.length);
        System.out.println("Average value: " + average);
    }
}