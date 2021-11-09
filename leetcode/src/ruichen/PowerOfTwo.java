package ruichen;

public class PowerOfTwo {

	// #231 https://leetcode.com/problems/power-of-two/
	// Bit Manipulation, Math
	// TC = O(1), SC = O(1)
	// #326 PowerOfThree: Brute Force, #342 PowerOfFour: Solution 2

	class Solution1 {
		public boolean isPowerOfTwo(int n) {
			if (n < 1) {
				return false;
			}
			int numOnes = 0;
			for (int i = 0; i < 32; i++) {
				numOnes += (n >> i) & 1;
			}
			return numOnes == 1;
		}
	}

	class Solution2 {
		public boolean isPowerOfTwo(int n) {
			// n          0 0 1 0 0 0
			// n-1        0 0 0 1 1 1
			// n & (n-1)  0 0 0 0 0 0
			return n > 0 && (n & (n - 1)) == 0;
		}
	}

}
