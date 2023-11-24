import java.io.*;

class NaivePattern {
    public static void main(String[] args) {
        String txt = "ABCABCD", pat = "ABCD";

        int patlen = pat.length();
        int txtlen = txt.length();
        int i, j;
        for (i = 0; i <= txtlen - patlen; i++) {
            for (j = 0; j < patlen; j++) {
                if (pat.charAt(j) != txt.charAt(i + j))

                    break;
            }
            if (j == patlen) {
                System.out.println(i + " ,");
            }

        }

    }
}
