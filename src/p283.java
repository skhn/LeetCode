public class p283 {

    /*

    Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.

     */

    public static void main(String[] args) {

        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void moveZeroes(int[] nums) {


        int i = 0, j = 1;

        while(j < nums.length) {
            if(nums[i] == 0) {
                if(nums[j] != 0) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                    i++; j++;
                } else {
                    j++;
                    continue;
                }
            } else {
                i++;
                j++;
                continue;
            }
        }

    }
}
