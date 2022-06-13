import java.util.Arrays;

public class NotPrimitiveDatatype {
    /**
     * String
     * Array[]
     * Matrix[][]
     * Object
     */

    public static void main(String[] args) {
        /** ARRAY */
        int[] a;
        a = new int[10];

        int[] b = new int[10];

        int[] c = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}; // Se possibile non utilizzare questo metodo
        //c.length; //torna la lunghezza dell'array = 11

        int[] d = {5, 4, 3, 2, 1, 6, 7, 8, 9, 10, 11};

        //Come assegnare un valore
        a[0] = 10;

        // Array class
        Arrays.sort(c); // sort = ordinamento ASC
        Arrays.sort(d);
        System.out.println(d.toString()); // ritorna un allocazione di memoria
        System.out.println(Arrays.toString(d)); // ritorna l'array

        /** MATRIX */
        int[][] e = new int[2][2];
        e[0][0] = 10;
        int[][] f = {
                {0, 1},
                {0, 2}
        };

        /** STRING */
    }
}