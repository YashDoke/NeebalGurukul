package practice;
import java.util.Arrays;
public class Question1 {
public static void main(String[] args) {
	 int arr[] = {8,5,4,6,9,7,20,7,30,1,6};
//	 int [] arr= {1,2,3,4};
	 
	 
		int n= arr.length;
		int x= n/2 ;
		int y= n-x;
		int odd[]= new int[x];
		int even[]= new int[y];
		int res[]= new int[n];
		
	for( int i =0 ,j=0,k=0; i<arr.length ;i++) {
		if (i %2==0) {
			even[k++]= arr[i];
			
		}
		else {
			odd[j++]=arr[i];
		}
			
		}
	Arrays.sort(even);
	Arrays.sort(odd);
	for(int i=0,j=odd.length-1,k=0;i<n ;i++) {
		
		if (i%2==0) {
			res[i]= even[k];
			k++;
		}
		else {
			res[i]=odd[j];
			j--;
		}
	}
	for (int i = 0; i < res.length; i++) {
		System.out.print(res[i]+" ");
	}
}
}
