public class SumOfDigits {

    public int sumDigits(int n) {

        int sum = 0;

        while(n > 0) {

            sum += n % 10;
            n = n / 10;
        }

        return sum;
    }
}



public class CountDigits {

    public int countDigits(int n) {

        int count = 0;

        while(n > 0) {
            n = n / 10;
            count++;
        }

        return count;
    }
}




import java.util.*;

public class FizzBuzz {

    public List<String> fizzBuzz(int n) {

        List<String> result = new ArrayList<>();

        for(int i = 1; i <= n; i++) {

            if(i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            }
            else if(i % 3 == 0) {
                result.add("Fizz");
            }
            else if(i % 5 == 0) {
                result.add("Buzz");
            }
            else {
                result.add(String.valueOf(i));
            }
        }

        return result;
    }
}



public class NumberOfSteps {

    public int numberOfSteps(int num) {

        int steps = 0;

        while(num > 0) {

            if(num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }

            steps++;
        }

        return steps;
    }

}




public class StarPattern {

    public static void main(String[] args) {

        int n = 5;

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
