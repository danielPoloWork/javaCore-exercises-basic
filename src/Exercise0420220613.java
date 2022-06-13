import java.util.Arrays;

public class Exercise0420220613 {
    /*
     * EXERCISE 04 - 2022/06/13 - Start: 13:39, End: 22:05
     *
     * Find the average value or values that comes closest to the average among all the values in the array and display
     * the results on the screen. Made with Functions/Methods.
     */

    // ARRAY TEST  -----------------------------------------------------------------------------------------------------
    // switch the array you want to test
    //static int[] array          = {2, 8, 14, 16, 25, 25, 37, 33, 41, 49};                                               // Array 01
    //static int[] array          = {1, 50, 100, 200, 300, 500, 700, 800, 900, 1000};                                     // Array 02
    static int[] arrayValues    = {99, 200, 300, 400, 600, 700, 800, 900, 1000, 1};                                     // Array 03
    //static int[] arrayValues    = {50, -10, 20, 15, 15, -5, -25, -60, 90, -100};                                        // Array 04

    // DECLARATION  ----------------------------------------------------------------------------------------------------
    static int[] belowValues       = new int[arrayValues.length];                                                       // empty array to store values below average
    static int[] equalValues       = new int[arrayValues.length];                                                       // empty array to store values equals to average
    static int[] aboveValues       = new int[arrayValues.length];                                                       // empty array to store values above average
    static int belowCounter        = 0;
    static int equalCounter        = 0;
    static int aboveCounter        = 0;
    static boolean exit            = false;

    // MAIN ------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        int sum         = getSum();                                                                                     // Method 01
        //System.out.println("MAIN_METHOD_01_sum ==> " + sum);
        int average     = getAverage(sum);                                                                              // Method 02
        //System.out.println("MAIN_METHOD_02_average ==> " + average);
        int smallest    = getSmallest();                                                                                // Method 03
        //System.out.println("MAIN_METHOD_03_smallest ==> " + smallest);
        int largest     = getLargest();                                                                                 // Method 04
        //System.out.println("MAIN_METHOD_04_largest ==> " + largest);

        setAverageArrays();                                                                                             // Method 05
        setAverageNumbers(average);                                                                                     // Method 06

        int belowValue = smallest;
        int equalValue = 0;
        int aboveValue = largest;

        int belowAverage = getBelowAverage(average, belowValue);                                                        // Method 07
        //System.out.println("MAIN_METHOD_07_belowAverage ==> " + belowAverage);
        int equalAverage = getEqualAverage(average, equalValue);                                                        // Method 08
        //System.out.println("MAIN_METHOD_08_equalAverage ==> " + equalAverage);
        int aboveAverage = getAboveAverage(average, aboveValue);                                                        // Method 09
        //System.out.println("MAIN_METHOD_09_aboveAverage ==> " + aboveAverage);
        int belowAmount  = getBelowAmount(belowAverage);                                                                // Method 10
        //System.out.println("MAIN_METHOD_10_belowAmount ==> " + belowAmount);
        int equalAmount  = getEqualAmount(equalAverage);                                                                // Method 11
        //System.out.println("MAIN_METHOD_11_equalAmount ==> " + equalAmount);
        int aboveAmount  = getAboveAmount(aboveAverage);                                                                // Method 12
        //System.out.println("MAIN_METHOD_12_aboveAmount ==> " + aboveAmount);
        outputPrint(sum, average, smallest, largest, belowAverage, equalAverage, aboveAverage, belowAmount, equalAmount, aboveAmount);  // Method 13
    }

    // METHOD 01 -------------------------------------------------------------------------------------------------------
    // find sum
    static int getSum() {
        int sumValue = 0;

        for (int a = 0; a < arrayValues.length; a++) {
            sumValue += arrayValues[a];
        }

        return sumValue;
    }

    // METHOD 02 -------------------------------------------------------------------------------------------------------
    // find average
    static int getAverage(int sumParameter) {
        int averageValue = (sumParameter / arrayValues.length);

        return averageValue;
    }

    // METHOD 03 -------------------------------------------------------------------------------------------------------
    // find smallest number
    static int getSmallest() {
        int smallestValue = Integer.MAX_VALUE;

        for (int a = 0; a < arrayValues.length; a++) {
            if (arrayValues[a] < smallestValue) { smallestValue = arrayValues[a];}
        }

        return smallestValue;
    }

    // METHOD 04 -------------------------------------------------------------------------------------------------------
    // find largest number
    static int getLargest() {
        int largestValue = Integer.MIN_VALUE;

        for (int a = 0; a < arrayValues.length; a++) {
            if (arrayValues[a] > largestValue) { largestValue = arrayValues[a];}
        }

        return largestValue;
    }


    // METHOD 05 -------------------------------------------------------------------------------------------------------
    // fill the arrays with limit numbers
    static void setAverageArrays() {
        for (int b = 0; b < arrayValues.length; b++) {
            belowValues[b] = Integer.MIN_VALUE;
            equalValues[b] = 0;
            aboveValues[b] = Integer.MAX_VALUE;
        }

        //System.out.println("METHOD 05 ==> " + "Below array values: " + Arrays.toString(belowValues));
        //System.out.println("METHOD 05 ==> " + "Equal array values: " + Arrays.toString(equalValues));
        //System.out.println("METHOD 05 ==> " + "Above array values: " + Arrays.toString(aboveValues));
    }

    // METHOD 06 -------------------------------------------------------------------------------------------------------
    // assign values below, above and equal to average numbers
    static void setAverageNumbers(int averageParameter) {
        int bv = 0; //loop counter for belowValues[]
        int ev = 0; //loop counter for equalValues[]
        int av = 0; //loop counter for aboveValues[]

        for (int c = 0; c < arrayValues.length; c++) {
            if (arrayValues[c] < averageParameter) {
                belowValues[bv] = arrayValues[c];
                bv++;
            }
            if (arrayValues[c] == averageParameter) {
                equalValues[ev] = arrayValues[c];
                ev++;
                exit = true;
            }
            if (arrayValues[c] > averageParameter) {
                aboveValues[av] = arrayValues[c];
                av++;
            }
        }

        //System.out.println("METHOD 06 ==> " + "Values below the average number: " + Arrays.toString(belowValues));
        //System.out.println("METHOD 06 ==> " + "Values equal the average number: " + Arrays.toString(equalValues));
        //System.out.println("METHOD 06 ==> " + "Values above the average number: " + Arrays.toString(aboveValues));
    }

    // METHOD 07 -------------------------------------------------------------------------------------------------------
    // find the closest number below the average
    static int getBelowAverage(int averageParameter, int belowValueParameter) {
        for (int d = 0; d < arrayValues.length; d++) {
            if ((belowValues[d] > belowValueParameter) && (belowValues[d] < averageParameter)) {
                belowValueParameter = belowValues[d];
            }
        }

        return belowValueParameter;
    }

    // METHOD 08 -------------------------------------------------------------------------------------------------------
    // find the equal average number
    static int getEqualAverage(int averageParameter, int equalValueParameter) {
        for (int d = 0; d < arrayValues.length; d++) {
            if (equalValues[d] == averageParameter) {
                equalValueParameter = equalValues[d];
            }
        }

        return equalValueParameter;
    }

    // METHOD 09 -------------------------------------------------------------------------------------------------------
    // find the closest number above the average
    static int getAboveAverage(int averageParameter, int aboveValueParameter) {
        for (int d = 0; d < arrayValues.length; d++) {
            if ((aboveValues[d] > averageParameter) && (aboveValues[d] < aboveValueParameter)) {
                aboveValueParameter = aboveValues[d];
            }
        }

        return aboveValueParameter;
    }

    // METHOD 10 -------------------------------------------------------------------------------------------------------
    // count the numbers of closest below average
    static int getBelowAmount(int belowAverageParameter) {
        for (int a = 0; a < arrayValues.length; a++) {
            if (arrayValues[a] == belowAverageParameter) {
                belowCounter++;
            }
        }

        return belowCounter;
    }

    // METHOD 11 -------------------------------------------------------------------------------------------------------
    // count the numbers of equals average
    static int getEqualAmount(int equalAverageParameter) {
        for (int a = 0; a < arrayValues.length; a++) {
            if (arrayValues[a] == equalAverageParameter) {
                equalCounter++;
            }
        }

        return equalCounter;
    }

    // METHOD 12 -------------------------------------------------------------------------------------------------------
    // count the numbers of closest above average
    static int getAboveAmount(int aboveAverageParameter) {
        for (int a = 0; a < arrayValues.length; a++) {
            if (arrayValues[a] == aboveAverageParameter) {
                aboveCounter++;
            }
        }

        return aboveCounter;
    }

    // METHOD 13 -------------------------------------------------------------------------------------------------------
    // compare the results with the average to find the difference and print the result
    static void outputPrint(int sumParameter, int averageParameter, int smallestParameter, int largestParameter, int belowAverageParameter, int equalAverageParameter, int aboveAverageParameter, int belowAmountParameter, int equalAmountParameter, int aboveAmountParameter) {
        int belowDiff = (averageParameter - (belowAverageParameter));
        int aboveDiff = (aboveAverageParameter - (averageParameter));

        //System.out.println("METHOD 13 ==> " + "The difference between the average number and the below value is " + belowDiff);
        //System.out.println("METHOD 13 ==> " + "The difference between the average number and the above value is " + aboveDiff);

        if (!exit) {
            if (belowDiff == aboveDiff) {
                System.out.println("The closest values are " + belowAverageParameter + " (counted: " + belowAmountParameter + ") and " + aboveAverageParameter + " (counted: " + aboveAmountParameter + ") between the average number " + averageParameter + ".");
            }
            if (belowDiff < aboveDiff) {
                System.out.println("The closest value is " + belowAverageParameter + " (below the average number " + averageParameter + "). Counted: " + belowAmountParameter + ".");
            }
            if (belowDiff > aboveDiff) {
                System.out.println("The closest value is " + aboveAverageParameter + " (above the average number " + averageParameter + "). Counted: " + aboveAmountParameter + ".");
            }
        } else {
            System.out.println("The average value is " + equalAverageParameter + ". Counted: " + equalAmountParameter + ".");
        }

        System.out.println(smallestParameter + " is the smallest array number.");
        System.out.println(largestParameter  + " is the largest array number.");
        System.out.println(sumParameter      + " is the sum of the array numbers.");
    }
}
