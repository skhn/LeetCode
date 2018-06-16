public class p66 {

    public static void main(String[] args) {
        int[] b = {9,9};
        int[] a = plusOne(b);

    }

    public static int[] plusOne(int[] digits) {
        String something = "";
        for(int digit = 0; digit < digits.length; digit++) {
            something += Integer.toString(digits[digit]);
        }

        long c = Integer.parseInt(something);
        c++;
        String[] ansarr = Long.toString(c).split("");
        int[] ans = new int[ansarr.length];

        for(int i = 0; i < ansarr.length; i++) {
            ans[i] = Integer.parseInt(ansarr[i]);
            System.out.println(ans[i]);
        }
        return ans;
    }
}
