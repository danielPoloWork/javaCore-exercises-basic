import java.util.Scanner;

public class FindSmallestNumber {

    public static void main(String[] args) {
        int amountOfNumbers = getAmountOfNumbers();
        int[] numbers = getNumbers(amountOfNumbers);
        int smallestNumber = getSmallestNumber(numbers);

        System.out.println("The smallest number is: " + smallestNumber);
    }

    static int getAmountOfNumbers() {
        Scanner objectScanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to add?");

        return objectScanner.nextInt();
    }

    static int[] getNumbers(int arrayLength) {
        int[] arrayNumbers = new int[arrayLength];
        Scanner objectScanner = new Scanner(System.in);

        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.println("Type a number:");
            arrayNumbers[i] = objectScanner.nextInt();
        }
        return arrayNumbers;
    }

    static int getSmallestNumber(int[] numbers) {
        int smallestNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            int temp = numbers[i];

            if ( temp < smallestNumber){
                smallestNumber = temp;
            }
        }
        return smallestNumber;
    }
}
