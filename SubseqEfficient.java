import java.io.*;

public class SubseqEfficient {

    static boolean insubseq(String text, String patt, int text_len, int patt_len) {
        int patt_index = 0;
        for (int text_index = 0; text_index < text_len && patt_index < patt_len; text_index++) {

            if (text.charAt(text_index) == patt.charAt(patt_index)) {
                patt_index++;

            }
        }
        return patt_index == patt_len;

    }

    public static void main(String[] args) {
        String a = "ABCDEF", b = "ADE";

        boolean c = insubseq(a, b, a.length(), b.length());

        System.out.println(c);

    }

}
