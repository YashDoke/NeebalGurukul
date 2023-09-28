package recurssionPractice;

import java.util.ArrayList;
import java.util.List;

public class DifferentWaysToAddParentheses {
	public List<Integer> diffWaysToCompute(String expression) {
		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < expression.length(); i++) {
			char c = expression.charAt(i);
			if (c == '+' || c == '-' || c == '*') {
				String leftExpr = expression.substring(0, i);
				String rightExpr = expression.substring(i + 1);

				List<Integer> leftResults = diffWaysToCompute(leftExpr);
				List<Integer> rightResults = diffWaysToCompute(rightExpr);

				for (int left : leftResults) {
					for (int right : rightResults) {
						int value = 0;
						switch (c) {
						case '+':
							value = left + right;
							break;
						case '-':
							value = left - right;
							break;
						case '*':
							value = left * right;
							break;
						}
						result.add(value);
					}
				}
			}
		}

		// If there are no operators left in the expression, it's a single number.
		// Parse it and add it to the result.
		if (result.isEmpty()) {
			result.add(Integer.parseInt(expression));
		}

		return result;
	}

	

	public static void main(String[] args) {
		DifferentWaysToAddParentheses solution = new DifferentWaysToAddParentheses();
		String expression1 = "2-1-1";
		String expression2 = "2*3-4*5";

		List<Integer> result1 = solution.diffWaysToCompute(expression1);
		List<Integer> result2 = solution.diffWaysToCompute(expression2);

		System.out.println(result1); // Output: [0, 2]
		System.out.println(result2); // Output: [-34, -10, -14, -10, 10]
	}
}
