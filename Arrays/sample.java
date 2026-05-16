import java.util.*;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {

            if(set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}


public class MaximumSubarray {

    public int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];

        for(int i = 1; i < nums.length; i++) {

            currentSum = Math.max(nums[i], currentSum + nums[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}



public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        int index = 0;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        while(index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}



import java.util.*;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if(map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }
}






public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices) {

            if(price < minPrice) {
                minPrice = price;
            }

            int profit = price - minPrice;

            if(profit > maxProfit) {
                maxProfit = profit;
            }
        }
