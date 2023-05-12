package TwoPointer;

import java.util.Arrays;
// Two pointer
public class SumClosest3 {
    public int threeSumClosest(int[] nums, int target) {
       Arrays.sort(nums); // sort the array in non-decreasing order
       int closestSum = Integer.MAX_VALUE; // initialize closestSum to a large value

       for(int i = 0 ; i<nums.length - 2; i++){
           // initialize two pointers
           int j = i+1, k = nums.length - 1;

           while (j < k){
               // calculate the current sum
               int sum = nums[i] + nums[j] + nums[k];
               if(Math.abs(sum - target) < Math.abs(closestSum - target)){
                   closestSum = sum;
               }
               if(sum > target){
                   // if the sum is greater than target, decrement k
                   k--;
               }else {
                   // if the sum is less than or equal to target, increment j
                   j++;
               }
           }
       }

       return closestSum;

    }

    public static void main(String[] args) {
        int[] arr = {2,4,1,5,3};
        Arrays.sort(arr);
        System.out.println(arr[1]);


    }
}
