import java.math.BigInteger;

public class PE020 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		int sumOfDigits = 0;
		int n = 100;
		BigInteger number = factorial(n);

		// convert to string
		String numberAsString = number.toString();
		// traverse every character in the string array and calculate value
		for (char a : numberAsString.toCharArray()) {
			sumOfDigits = sumOfDigits + Character.getNumericValue(a);
		}

		System.out.println("Answer: " + sumOfDigits);

		long endTime = System.nanoTime();
		System.out.printf("Total Time: %.6f seconds\n",
				((endTime - startTime) / 1000000000.0));

	};

	public static BigInteger factorial(int n) {
		BigInteger product = BigInteger.ONE;
		if (n < 0) {
			return new BigInteger("-1");
		}
		/* Chain Multiply from 'n' to '1' */
		for (int c = n; c > 0; c--) {
			product = product.multiply(BigInteger.valueOf(c));
		}
		return product;
	};
}
