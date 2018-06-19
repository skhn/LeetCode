public class p33 {

    public static void main(String[] args) {

    }

    public int search(int[] nums, int target) {

        if(nums.length == 0) return -1;
        int pointer = funcHalf(nums, 0, nums.length - 1);

        int a = bSearch(nums, target, 0, pointer);
        int b = bSearch(nums, target, pointer+1, nums.length-1);

        if(b > a) return b;
        return a;
    }

    public int funcHalf(int[] nums, int init, int fin) {


        if(init == fin) return fin;


        int a = funcHalf(nums,init, (init + fin)/2);

        //System.out.println("a --- > " + a);

        int b = funcHalf(nums, ((init + fin)/2) + 1, fin);

        //System.out.println("b --- > " + b);




        if(nums[a] > nums[b]) {
            //System.out.println("\n\nreturning a --- > " + a);
            return a;
        }

        //System.out.println("\n\nreturning b --- > " + b);
        return b;
    }

    public int bSearch(int[] nums, int target, int init, int fin) {

        while(init < fin) {

            System.out.println("\n\ninit   ---> " + init );
            System.out.println("\n\nfin   ---> " + fin );
            if(nums[(init + fin)/2] == target) return (init + fin)/2;
            else if(nums[(init + fin)/2] > target) {
                fin = (init + fin)/2;
            } else init = (init + fin)/2 + 1;
        }
        if(init == fin && nums[init] == target) return init;
        return -1;
    }

}
