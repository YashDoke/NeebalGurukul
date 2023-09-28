package recurssionTest;

public class PredictWinner {
static int findWinner(int nums[], int L, int R) {
	if(L==R) {
		return nums[L];
	}
	int leftNum = nums[L]-findWinner(nums,L+1,R);
	int rightNum = nums[R]-findWinner(nums,L,R-1);
	
	return leftNum>rightNum?leftNum:rightNum;
}
	public static void main(String[] args) {
		int nums[] = {1,5,2};
//		int nums[] = {1,5,233,7};
//		int nums[] = {1,2,3,5};
//		int nums[] = {1,3,3,1};
		int L = 0;
		int R = nums.length-1;
		if(findWinner(nums,L,R)>=0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}
}
