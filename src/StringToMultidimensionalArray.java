/*
 * v1.1.0
 */
import java.util.Arrays;

public class StringToMultidimensionalArray {

  public static void main(String[] args) {
    String sentence = args[0].trim();

    int blanksAmount = doCountBlank(sentence);

    String[][] cleanedSentenceArray = new String[3][sentence.length() - blanksAmount];
    String[][] blanksArray = new String[3][blanksAmount];

    setCleanedSentenceArray(cleanedSentenceArray, sentence);
    setBlanksArray(blanksArray, sentence);

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

  private static void setCleanedSentenceArray(String[][] cleanedSentenceArrayArg, String sentenceArg) {
    for (int a = 0, b = 0; a < sentenceArg.length(); a++) {
      boolean isNotBlank = (sentenceArg.charAt(a) != ' ');
      if (isNotBlank) {
        cleanedSentenceArrayArg[0][b] = "" + sentenceArg.charAt(a);
        cleanedSentenceArrayArg[1][b] = "" + a;
        cleanedSentenceArrayArg[2][b] = "" + sentenceArg.codePointAt(a);
        b++;
      }
    }
  }

  private static void setBlanksArray(String[][] blanksArrayArg, String sentenceArg) {
    for (int a = 0, b = 0; a < sentenceArg.length(); a++) {
      boolean isBlank = (sentenceArg.charAt(a) == ' ');
      if (isBlank) {
        blanksArrayArg[0][b] = " ";
        blanksArrayArg[1][b] = "" + a;
        blanksArrayArg[2][b] = "" + sentenceArg.codePointAt(a);
        b++;
      }
    }
  }
}