import java.util.Arrays;

public class StringToMultidimensionalArray {

  public static void main(String[] args) {
    String[][] valueArray = new String[2][args[0].length()];

    for (int a = 0; a < 2; a++) {
      for (int b = 0; b < args[0].length(); b++) {
        if (a == 0) {
          valueArray[a][b] = "" + args[0].charAt(b);
        } else {
          valueArray[a][b] = "" + args[0].codePointAt(b);
        }
      }
    }

    System.out.println(Arrays.deepToString(valueArray));
  }
}