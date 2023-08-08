import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        class Solution {
            public int[] twoSum(int[] numbers, int target) {
                int p1, p2;
                int curr;
                p1 = 0;
                p2 = numbers.length - 1;

                while(p1 < numbers.length) {
                    curr = numbers[p1] + numbers[p2];
                    if(curr == target) {
                        return new int[]{p1 + 1, p2 + 1};
                    }

                    if(curr < target) {
                        p1++;
                    } else {
                        p2--;
                    }
                }


                return new int[]{};
            }
        }

        return new int[]{};
    }
}
//public class Optimal {
//
//    public int[] twoSum(int[] nums, int target) {
//        int l = 0, r = nums.length - 1;
//
//        while (nums[l] + nums[r] != target) {
//            if (nums[l] + nums[r] < target) l++;
//            else r--;
//        }
//
//        return new int[]{l + 1, r + 1};
//    }
//
//}