package graphAssignment;

import java.util.Arrays;

public class FindJudgeTown {
	public static int findJudge(int n, int[][] trust) {
		int count = 0;
		int x[] = new int[n + 1];
		int y[] = new int[n + 1];
		Arrays.fill(x, 0);
		Arrays.fill(y, 0);
		for (int i = 0; i < trust.length; i++) {
			x[trust[i][0]] = 1;
		}
		for (int i = 1; i <= n; i++) {
			if (x[i] != 0)
				count++;
			if (x[i] == 0)
				y[i] = 1;
		}
		if (count == n)
			return -1;
//		for (int i = 1; i <= n; i++)
//			System.out.println(y[i]);
		int jud = 0;
		for (int i = 1; i <= n; i++) {
			if (y[i] == 1)
				jud = i;
		}
		int c = 0;
		for (int i = 0; i < trust.length; i++) {
			if (trust[i][1] == jud)
				c++;
		}
		if (c == n - 1)
			return jud;
		return -1;

	}

	public static void main(String[] args) {
		int n1 = 2;
		int[][] trust1 = { { 1, 2 } };
		int result1 = findJudge(n1, trust1);
		System.out.println(result1);

//		 int n2 = 3;
//		 int[][] trust2 = {{1, 3}, {2, 3}};
//		 int result2 = findJudge(n2, trust2);
//		 System.out.println(result2); 
//		 
//		 int n3 = 3;
//		 int[][] trust3 = {{1, 3}, {2, 3}, {3, 1}};
//		 int result3 = findJudge(n3, trust3);
//		 System.out.println(result3); 

	}
}
