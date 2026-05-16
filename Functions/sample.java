public class SqrtX {

    public int mySqrt(int x) {

        if(x == 0) {
            return 0;
        }

        int left = 1;
        int right = x;
        int ans = 0;

        while(left <= right) {

            int mid = left + (right - left) / 2;

            if(mid <= x / mid) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}



public class AddDigits {

    public int addDigits(int num) {

        while(num >= 10) {

            int sum = 0;

            while(num > 0) {
                sum += num % 10;
                num = num / 10;
            }

            num = sum;
        }

        return num;
    }
}



public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        if(x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while(x != 0) {

            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        return original == reversed;
    }
}



public class PlusOne {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
            return digits;
            
            digits[i]= 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;    
    }
}


  
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) {
            return false;
        }
        while(n % 2 == 0) {
            n = n / 2;
        }
        return n == 1;
    
}
}
