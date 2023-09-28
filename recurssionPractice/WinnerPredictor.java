package recurssionPractice;

public class WinnerPredictor {
	 static int canPlayer1Win(int[] nums, int left, int right) {
	        if (left == right) {
	            return nums[left];
	        }
	        
	        int chooseLeft = nums[left] - canPlayer1Win(nums, left + 1, right);
	        int chooseRight = nums[right] - canPlayer1Win(nums, left, right - 1);
	        
	        return Math.max(chooseLeft, chooseRight);
	    }
public static void main(String[] args) {
	int []nums = {1,5,233,3};
	System.out.println(canPlayer1Win(nums, 0, nums.length - 1) >= 0);
}
}
