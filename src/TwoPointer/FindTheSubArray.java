package TwoPointer;

import java.util.Arrays;

// Two pointer
public class FindTheSubArray {

    public int[] sumArray(int[] arr, int target) {
        // two pointer initialized from starting of array
        int start = 0, end = 0;
        // Store the sum of two pointer value
        int carry_sum = arr[0];

        // start loop and run until the end pointer
        // is less then array length
        while (end < arr.length) {

            // 1 if we found the target value on first position the return start or end index
            // 0 , 0
            if (carry_sum == target) {
                return new int[]{start, end};
            }
            // checking  the carry_sum is less then target value
            // if yes then increase the counter of end array
            // and add end indexed value in carray sum
            if (carry_sum < target) {
                end++;
                if (end < arr.length) {
                    carry_sum += arr[end];
                }
            }
            // if not then subtract start index value from carray_sum
            // then increase the count of start index
            else {
                carry_sum -= arr[start];
                start++;
            }
        }

        // if the sum array not found in to the array return
        // array with -1 and -1 value
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        FindTheSubArray findTheSubArray = new FindTheSubArray();
        System.out.println(Arrays.toString(findTheSubArray.sumArray(new int[]{2, 5, 3,}, 8)));

    }
}
