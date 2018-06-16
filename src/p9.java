public class p9 {

    public static void main(String[] args) {
        isPalindrome(2147483647);
    }

    public static boolean isPalindrome(int x) {
        if(x < 0) return false;
        if(x/10 == 0 && x%10 == x) return true;

        int cnt = 0;
        int temp = x;
        while(temp / 10 != 0) {
            temp /= 10;
            cnt++;
        }
        temp = x;
        int ans = 0;
        while(cnt >=0) {
            ans += (Math.pow(10,cnt--) * (temp %10));
            System.out.println("ans = " + ans + "cnt = " + cnt);
            temp /= 10;
            System.out.println("temp after divide = " + temp);
        }
        System.out.println(ans);
        System.out.println(100%10);
        return ans == x;
    }
}