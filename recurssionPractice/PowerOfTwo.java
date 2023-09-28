package recurssionPractice;

public class PowerOfTwo {
	
	static boolean isPowerOfTwo(int n) {
		if(n==1 || n==2) {
			return true;
		}
    if(n<=0||(n%2)!=0) {
		return false;
	}else {
		
		n/=2;
		return isPowerOfTwo(n);
    
	}
}


	

//	static boolean isPowerTwo(int n) {
//		if(n<=0) {
//			return false;
//		}
//		while(n>1&&(n%2)==0) {
//			n/=2;
//		}return (n==1||n%2==0)?true:false;
//	}
	
	
	
public static void main(String[] args) {
	System.out.println(isPowerOfTwo(1));
}
}
