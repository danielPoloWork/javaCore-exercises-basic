import java.util.Scanner;
import java.util.stream.IntStream;

public class CaesarCipher {
    public static String nativePhrase = "";
    public static String encryptedPhrase = "";
    public static String decryptedPhrase = "";
    public static String stringAsciiChars = new String(IntStream.rangeClosed(32, 126).toArray(), 0,95 );
    public static final String ENCRYPTION_ASCII_CHARS = stringAsciiChars + " !\"";
    public static final String DECRYPTION_ASCII_CHARS = "|}~" + stringAsciiChars;
    public static final int ENCRYPTION_KEY = 3;

    public static void main(String[] args) {
        String nativePhrase = getPhrase();
        String encryptedPhrase = getEncrypt(nativePhrase);
        String decryptedPhrase = getDecrypt(encryptedPhrase);

        System.out.println("The native phrase is: " + nativePhrase);
        System.out.println("The encrypted phrase is: " + encryptedPhrase);
        System.out.println("The decrypted phrase is: " + decryptedPhrase);
    }

    static String getPhrase() {
        Scanner objectScanner = new Scanner(System.in);

        System.out.println("Enter the phrase:");
        nativePhrase = objectScanner.nextLine();
        objectScanner.close();

        return nativePhrase;
    }

    static String getEncrypt(String nativePhrase) {
        char[] arrayAsciiChars = ENCRYPTION_ASCII_CHARS.toCharArray();

        for (int i = 0; i < nativePhrase.length(); i++) {
            int indexNativePhraseChar = nativePhrase.charAt(i);
            int indexAsciiChar = ENCRYPTION_ASCII_CHARS.indexOf(indexNativePhraseChar);
            int indexEncryptedAsciiChar = indexAsciiChar + ENCRYPTION_KEY;
            encryptedPhrase += arrayAsciiChars[indexEncryptedAsciiChar];
        }
        return encryptedPhrase;
    }

    static String getDecrypt(String encryptedPhrase) {
        char[] arrayAsciiChars = DECRYPTION_ASCII_CHARS.toCharArray();

        for (int i = 0; i < encryptedPhrase.length(); i++) {
            int indexEncryptedPhraseChar = encryptedPhrase.charAt(i);
            int indexAsciiChar = DECRYPTION_ASCII_CHARS.indexOf(indexEncryptedPhraseChar);
            int indexDecryptedAsciiChar = indexAsciiChar - ENCRYPTION_KEY;
            decryptedPhrase += arrayAsciiChars[indexDecryptedAsciiChar];
        }
        return decryptedPhrase;
    }
}
