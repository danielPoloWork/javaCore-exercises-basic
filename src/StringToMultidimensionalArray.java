/*
 * v1.1.1 - Two methods in one.
 */
import java.util.Arrays;

public class StringToMultidimensionalArray {

  public static void main(String[] args) {
    String sentence = args[0].trim();

    int blanksAmount = doCountBlank(sentence);

    String[][] cleanedSentenceArray = new String[3][sentence.length() - blanksAmount];
    String[][] blanksArray = new String[3][blanksAmount];

    setCleanedSentenceArrayAndBlanksArray(cleanedSentenceArray, blanksArray, args[0]);

    System.out.println(Arrays.deepToString(cleanedSentenceArray));
    System.out.println(Arrays.deepToString(blanksArray));
  }

  private static int doCountBlank(String sentenceArg) {
   int counter = 0;
   for (int a = 0, b = 0; a < sentenceArg.length(); a++) {
     boolean isBlank = (sentenceArg.charAt(a) == ' ');
     if (isBlank) {
       counter++;
     }
   }
   return counter;
  }

  private static void setCleanedSentenceArrayAndBlanksArray(String[][] sentenceArrayArg, String[][] blanksArrayArg, String sentenceArg) {
    for (int a = 0, b = 0, c = 0; a < sentenceArg.length(); a++) {
      boolean isBlank = (sentenceArg.charAt(a) == ' ');
      if (isBlank) {
        blanksArrayArg[0][b] = " ";
        blanksArrayArg[1][b] = "" + a;
        blanksArrayArg[2][b] = "" + sentenceArg.codePointAt(a);
        b++;
      } else {
        sentenceArrayArg[0][c] = "" + sentenceArg.charAt(a);
        sentenceArrayArg[1][c] = "" + a;
        sentenceArrayArg[2][c] = "" + sentenceArg.codePointAt(a);
        c++;
      }
    }
  }
}