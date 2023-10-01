package stack_Assignments;

import java.util.Stack;

public class DailyTemperatures {
	public int[] dailyTemperatures(int[] temperatures) {
		int n = temperatures.length;
		int[] result = new int[n];
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < n; i++) {
			while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
				int j = stack.pop();
				result[j] = i - j;
			}
			stack.push(i);
		}

		return result;
	}

	public static void main(String[] args) {
		DailyTemperatures solution = new DailyTemperatures();

		int[] temperatures1 = { 73, 74, 75, 71, 69, 72, 76, 73 };
		int[] temperatures2 = { 30, 40, 50, 60 };
		int[] temperatures3 = { 30, 60, 90 };

		int[] result1 = solution.dailyTemperatures(temperatures1);
		int[] result2 = solution.dailyTemperatures(temperatures2);
		int[] result3 = solution.dailyTemperatures(temperatures3);

		for (int num : result1) {
			System.out.print(num + " ");
		}
		System.out.println();

		for (int num : result2) {
			System.out.print(num + " ");
		}
		System.out.println();

		for (int num : result3) {
			System.out.print(num + " ");
		}
	}
}
