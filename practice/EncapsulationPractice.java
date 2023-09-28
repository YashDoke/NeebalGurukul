package practice;

//class Employee{
//	private int empId = 2;
//	private int basicSal=2000;
//	private int incentive =200;
//	private int phone= 0;
//	
//	private void countSal() {
//		System.out.println(basicSal+incentive);
//	}
//}

public class EncapsulationPractice extends Thread{
	public static void main(String[] args) {
		
	
		EncapsulationPractice t = new EncapsulationPractice();

	  Thread x = new Thread(t);

	  x.start();

	  }

	  public void run() {

	 for(int i=0;i<3;++i) {

	 System.out.print(i + "..");

	} 
}
}
