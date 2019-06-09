package edu.dp.problems;

/**
 * Problem stmnt : to find number of ways can climb stair case which has n
 * number of stairs with 1 step or 2 step or 3 step climbing at a time
 */

public class ClimbStairs {

	// This approach is slow and it will take time exponentially for n=40 itself it will keep on calculating for 1 hr
	public int getNumberOfWaysNaiveApproach(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		if (n == 3)
			return 4;
		return (getNumberOfWaysNaiveApproach(n - 1) + getNumberOfWaysNaiveApproach(n - 2) + getNumberOfWaysNaiveApproach(n - 3));
	}

	// This approach is faster and will run on O(N) time linear one
	public long getNumberOfWaysDPApproach(int n) {
		
		long st[] = new long[n + 1];
		st[1] = 1;
		st[2] = 2;
		st[3] = 4;
		for (int i = 4; i <= n; i++)
			st[i] = st[i - 1] + st[i - 2] + st[i - 3];

		return st[n];
	}

	public static void main(String[] args) {
		ClimbStairs cs = new ClimbStairs();
		int numOfStairs = 5;
		System.out.println("num of ways---naive approach = " + cs.getNumberOfWaysNaiveApproach(numOfStairs));
		numOfStairs = 5;
		System.out.println("num of ways---DP approach = " + cs.getNumberOfWaysDPApproach(numOfStairs));

	}

}
