package jan22;

public class Reverse_with_trailing {
	public static void main(String[] args) {
        int[] testNumbers = {2100, 405, 100, 123, 0};
        for (int num : testNumbers) {
            System.out.println("Original: " + num + " -> Reversed: " + reverseNumberWithZeros(num));
        }
    }
	public static int reverseNumberWithZeros(int n) {
	        int reversed = 0; 
	        int numZeros = 0; // To count trailing zeros

	        // Count trailing zeros
	        while (n % 10 == 0 && n != 0) {
	            numZeros++;
	            n /= 10; // Remove trailing zeros
	        }

	        // Reverse the remaining number
	        while (n != 0) {
	            int digit = n % 10; // Extract the last digit
	            reversed = reversed * 10 + digit; // Build the reversed number
	            n /= 10; // Remove the last digit
	        }

	        // Add back the trailing zeros
	        while (numZeros > 0) {
	            reversed *= 10;
	            numZeros--;
	        }

	        return reversed;
	    }

	    
	

}
