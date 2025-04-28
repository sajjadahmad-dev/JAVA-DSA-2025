public class EvenDigit {
    public static void main(String[] args) {
        int[] nums = {12, 345, 24, 6, 7896};  // Array of numbers
        System.out.println(findNumbers(nums)); // Print the result
    }

    // Function to find how many numbers have even digits
    public static int findNumbers(int[] nums) {
        int answersrr = 0;
        for (int num : nums) {
            int digits = countDigits(num);  // Count the digits
            if (digits % 2 == 0) {
                answers++;
            }
        }
        return answers;
    }

    // Function to count digits in a number
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
