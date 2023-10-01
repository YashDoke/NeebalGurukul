package stack_Assignments;

import java.util.Stack;

public class BaseballGame {
	public int calPoints(String[] ops) {
		Stack<Integer> stack = new Stack<>();

		for (String op : ops) {
			if (op.equals("+")) {
				int top = stack.pop();
				int newTop = top + stack.peek();
				stack.push(top);
				stack.push(newTop);
			} else if (op.equals("D")) {
				stack.push(2 * stack.peek());
			} else if (op.equals("C")) {
				stack.pop();
			} else {
				stack.push(Integer.parseInt(op));
			}
		}

		int sum = 0;
		for (int score : stack) {
			sum += score;
		}

		return sum;
	}

	public static void main(String[] args) {
		BaseballGame game = new BaseballGame();
		String[] ops1 = { "5", "2", "C", "D", "+" };
		System.out.println(game.calPoints(ops1));
		String[] ops2 = { "5", "-2", "4", "C", "D", "9", "+", "+" };
		System.out.println(game.calPoints(ops2));
		String[] ops3 = { "1", "C" };
		System.out.println(game.calPoints(ops3));
	}
}
