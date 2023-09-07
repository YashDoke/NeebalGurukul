
//4. The following even sized array shows on and off times of an electric vehicle on a
//particular day in 24 hour format: (850 means 8:50AM, 1330 means 1:30PM)
//int[] ev = {850,945,1145,1155,1230,1245,1330,1340,1425,1445};
//Calculate the running time of the electric vehicle. Expected output: 1 hr 50 min

package day4_Assignment;

public class VehicalTime {
public static void main(String[] args) {
	int[] ev = {850,945,1145,1155,1230,1245,1330,1340,1425,1445};
	
	int time = 0;
	int sub1 =0;
	for(int i=0,j=i+1;j<ev.length;i+=2,j+=2) {
		if(ev[i]<ev[j]) {
			sub1 = (ev[j]/100)-(ev[i]/100);
		}else {
			sub1 = (ev[i]/100)-(ev[j]/100);
		}
		
		
		
		int sub2 = (ev[i]%100)-(ev[j]%100);
		
		time = time + ((sub1*60)-sub2);
	}
	int hr = time/60;
	int minutes = time-(hr*60);
	
	System.out.println("output: "+hr+ " hr "+minutes+ " min");
	
	
}
}
