public class CheckIfRotations {

    public static void main(String args[]) {
        String word = "ABAB", pat = "ABBA";
        String txt = word + word;
        int flag = 0;
        int patlen = pat.length();
        int txtlen = txt.length();
        int i, j;
        for (i = 0; i <= txtlen - patlen; i++) {
            for (j = 0; j < patlen; j++) {
                if (pat.charAt(j) != txt.charAt(i + j))

                    break;
            }
            if (j == patlen) {
                flag++;
                break;
            }

        }
        if (flag != 0) {
            System.out.println("FOUND");
        } else {
            System.out.println("NOT FOUND");
        }
    }
}
