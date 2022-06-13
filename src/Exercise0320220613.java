import java.util.Arrays;

public class Exercise0320220613 {
    /*
     * EXERCISE 04 - 2022/06/13 - Start: 13:39, End: 22:05
     *
     * Find the average value or values that comes closest to the average among all the values in the array and display
     * the results on the screen.
     */

    // MAIN ------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        // ARRAY TEST  -------------------------------------------------------------------------------------------------
        // switch the array you want to test
        //int[] array             = {2, 8, 14, 16, 25, 25, 37, 33, 41, 49};              // Array 01
        //int[] array             = {1, 50, 100, 200, 300, 500, 700, 800, 900, 1000};    // Array 02
        int[] arrayValues       = {99, 200, 300, 400, 600, 700, 800, 900, 1000, 1};    // Array 03
        //int[] arrayValues       = {50, -10, 20, 15, 15, -5, -25, -60, 90, -100};         // Array 04

        // DECLARATION  ------------------------------------------------------------------------------------------------
        int[] belowValues       = new int[arrayValues.length];    // empty array to store values below average
        int[] equalValues       = new int[arrayValues.length];    // empty array to store values equals to average
        int[] aboveValues       = new int[arrayValues.length];    // empty array to store values above average
        int bv                  = 0;                              //loop counter for belowValues[]
        int ev                  = 0;                              //loop counter for equalValues[]
        int av                  = 0;                              //loop counter for aboveValues[]
        int belowCounter        = 0;
        int equalCounter        = 0;
        int aboveCounter        = 0;
        int smallestValue       = Integer.MAX_VALUE;
        int largestValue        = Integer.MIN_VALUE;
        int sum                 = 0;
        boolean exit            = false;

        // find average, sum, smaller and larger numbers ---------------------------------------------------------------
        for (int a = 0; a < arrayValues.length; a++) {
            if (arrayValues[a] < smallestValue) { smallestValue = arrayValues[a];}
            if (arrayValues[a] > largestValue) { largestValue = arrayValues[a];}

            sum += arrayValues[a];
        }

        int average = (sum / arrayValues.length);

        //System.out.println(smallestValue + " is the smallest number in the array.");
        //System.out.println(largestValue + " is the largest number in the array.");
        //System.out.println(sum      + " is the sum of the numbers in the array.");
        //System.out.println(average  + " is the average between the array numbers.");

        // fill the arrays with limit numbers --------------------------------------------------------------------------
        for (int b = 0; b < arrayValues.length; b++) {
            belowValues[b] = Integer.MIN_VALUE;
            equalValues[b] = 0;
            aboveValues[b] = Integer.MAX_VALUE;
        }

        //System.out.println("Below array values: " + Arrays.toString(belowValues));
        //System.out.println("Equal array values: " + Arrays.toString(equalValues));
        //System.out.println("Above array values: " + Arrays.toString(aboveValues));

        // assign values below, above and equal to average numbers -----------------------------------------------------
        for (int c = 0; c < arrayValues.length; c++) {
            if (arrayValues[c] < average) {
                belowValues[bv] = arrayValues[c];
                bv++;
            }
            if (arrayValues[c] == average) {
                equalValues[ev] = arrayValues[c];
                ev++;
                exit = true;
            }
            if (arrayValues[c] > average) {
                aboveValues[av] = arrayValues[c];
                av++;
            }
        }

        //System.out.println("Values below the average number: " + Arrays.toString(belowValues));
        //System.out.println("Values equal the average number: " + Arrays.toString(equalValues));
        //System.out.println("Values above the average number: " + Arrays.toString(aboveValues));

        // find the nearest and/or equal average numbers ---------------------------------------------------------------
        int belowAverageValue = smallestValue;
        int equalAverageValue = 0;
        int aboveAverageValue = largestValue;

        for (int d = 0; d < arrayValues.length; d++) {
            if ((belowValues[d] > belowAverageValue) && (belowValues[d] < average)) {
                belowAverageValue = belowValues[d];
            }
            if (equalValues[d] == average) {
                equalAverageValue = equalValues[d];
            }
            if ((aboveValues[d] > average) && (aboveValues[d] < aboveAverageValue)) {
                aboveAverageValue = aboveValues[d];
            }
        }

        //System.out.println("Closest value below the average number: " + belowAverageValue);
        //System.out.println("Values like the average number: "         + equalAverageValue);
        //System.out.println("Closest value above the average number: " + aboveAverageValue);

        // count the numbers of nearest and/or equal average numbers ---------------------------------------------------
        for (int e = 0; e < arrayValues.length; e++) {
            if (arrayValues[e] == belowAverageValue) {
                belowCounter++;
            }
            if (arrayValues[e] == equalAverageValue) {
                equalCounter++;
            }
            if (arrayValues[e] == aboveAverageValue) {
                aboveCounter++;
            }
        }

        //System.out.println(belowCounter + " values are close below the average number " + average + ".");
        //System.out.println(equalCounter + " values are like the average number "        + average + ".");
        //System.out.println(aboveCounter + " values are close above the average number " + average + ".");

        // compare the results with the average to find the difference -------------------------------------------------
        int belowDiff = (average - (belowAverageValue));
        int aboveDiff = (aboveAverageValue - (average));

        //System.out.println("The difference between the average number and the below value is " + belowDiff);
        //System.out.println("The difference between the average number and the above value is " + aboveDiff);

        // output ------------------------------------------------------------------------------------------------------
        if (!exit) {
            if (belowDiff == aboveDiff) {
                System.out.println("The closest values are " + belowAverageValue + " (counted: " + belowCounter + ") and " + aboveAverageValue + " (counted: " + aboveCounter + ") between the average number " + average + ".");
            }
            if (belowDiff < aboveDiff) {
                System.out.println("The closest value is "   + belowAverageValue + " (below the average number " + average + "). Counted: " + belowCounter + ".");
            }
            if (belowDiff > aboveDiff) {
                System.out.println("The closest value is "   + aboveAverageValue + " (above the average number " + average + "). Counted: " + aboveCounter + ".");
            }
        } else {
            System.out.println("The average value is " + equalAverageValue + ". Counted: " + equalCounter + ".");
        }

        System.out.println(smallestValue + " is the smallest array number.");
        System.out.println(largestValue  + " is the largest array number.");
        System.out.println(sum           + " is the sum of the array numbers.");
    }
}