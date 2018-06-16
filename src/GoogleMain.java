import java.util.*;

public class GoogleMain {


    public String solution(String S) {
        // write your code in Java SE 8

        Set<Integer> set = new HashSet<>();

        List<Integer> list = new ArrayList<>();


        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == ':') continue;
            set.add(Character.getNumericValue(S.charAt(i)));
        }

        for (int i : set) {
            list.add(i);
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }

        Arrays.sort(arr);

        String ansRev = "";
        boolean flag = false;
        for (int i = S.length() - 1; i >= 0; i--) {

            if (S.charAt(i) == ':') continue;

            if (flag) {
                ansRev += arr[S.charAt(i)];
                continue;
            }

            if (Character.getNumericValue(S.charAt(i)) <= arr[0]) {
                ansRev += arr[arr.length - 1];
            } else {
                int prev = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (Character.getNumericValue(S.charAt(i)) > arr[j]) {
                        prev = j;
                    } else {
                        ansRev += arr[prev];
                        flag = true;
                        break;
                    }
                }
            }
        }

        String ans = "";
        for (int i = ansRev.length() - 1; i >= 0; i--) {
            if (i == 2) {
                ans += ansRev.charAt(i);
                ans += ':';
            } else {
                ans += ansRev.charAt(i);
            }
        }
        return ans;
    }
}
