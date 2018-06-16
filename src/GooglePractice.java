public class GooglePractice {

    // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

        public String solution(String S, int K) {
            // write your code in Java SE 8
            int charCount = 0;

            for(int i =0; i < S.length(); i++) {
                if(S.charAt(i) != '-') {
                    charCount++;
                }
            }

            StringBuffer br = new StringBuffer();
            int spacing = charCount%K;
            int whileLoop = 0;
            while(spacing-- > 0) {
                br.append(Character.toUpperCase(S.charAt(whileLoop++)));
            }

            int cntr = K;
            for(int i = 0; i < charCount - charCount%K; i ++) {
                if(cntr == 0) {
                    br.append('-');
                    cntr = K;
                }
                br.append(Character.toUpperCase(S.charAt(i)));
                cntr--;
            }
            return br.toString();
        }

}
