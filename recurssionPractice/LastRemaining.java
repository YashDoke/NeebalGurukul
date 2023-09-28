package recurssionPractice;

public class LastRemaining {
	

	static  int lastRemainingRecursive(int remaining, boolean left, int step, int head, int n) {
	    if (remaining == 1) {
	        return head;
	    }

	    if (left || remaining % 2 == 1) {
	        head = head + step;
	    }

	    remaining = remaining / 2;
	    step = step * 2;
	    left = !left;

	    return lastRemainingRecursive(remaining, left, step, head, n);
	}
public static void main(String[] args) {
	System.out.println(lastRemainingRecursive(9, true, 1, 1, 1));
}
}
