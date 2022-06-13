public class PrimitiveDatatype {
    /**
     *
     * 0 0 0 0 0 0 0 0
     *
     * 1 0 0 0 0 0 0 0 (negativo)
     *
     */
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE + 1;
        // int c = 9999999999;
        // int d = 2147483648;
        int e = 2147483647 + 1;
        System.out.println(a);

        char f = 'f';
        int g  = 1;
        int h  = g + f;
        System.out.println(h);

        int i  = 23;
        byte j = (byte) i;
        System.out.println(j);

        float k = 23.2f;
        int l   = (int) f;
        System.out.println(l); // Class cast exception. Non dovrebbe succedere perchè non vogliamo perdere informazioni.

        double m = 23.2798;
        int n = (int) m;
        System.out.println(n); // Class cast exception. Non dovrebbe succedere perchè non vogliamo perdere informazioni.

        // Math.floor(xyz);

        int o = 10;
        Integer p = o;

        char q = 'q';
        Character r = q;

        boolean s = true;
        boolean t = false;
        // Possiamo usare !, &&, ||
        // boolean u = 1; Non si possono usare i numeri
        System.out.println(s && t); // &&(s, t) ==> &&(true, t) ==> &&(true, false) ==> false
        //short circuit. Ottimo per ottimizzare il codice.
        System.out.println(t && s); // &&(t, s) ==> &&(false, s) ==> false


    }
}