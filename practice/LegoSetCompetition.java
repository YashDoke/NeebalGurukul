package practice;
import java.util.Scanner;
public class LegoSetCompetition {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	outer:do {
		System.err.println("Welcome to Lego Set Competition ");
		System.out.println("Enter the name of Lego Set 1");
		sc.nextLine();
		String c1= sc.nextLine();
		System.out.println("Enter the number of pieces in Lego Set 1");
		int t1= sc.nextInt();
		System.out.println("Enter the name of Lego Set 2");
		sc.nextLine();
		String c2= sc.nextLine();
		System.out.println("Enter the number of pieces in Lego Set 2");
		int t2= sc.nextInt();
		System.out.println("Enter the name of Lego Set 3");
		sc.nextLine();
		String c3= sc.nextLine();
		System.out.println("Enter the number of pieces in Lego Set 3");
		int t3= sc.nextInt();
		CompetitionLog p1 = new CompetitionLog(1,"",c1+" "+c2+" "+c3,0);
		CompetitionLog p2 = new CompetitionLog(2,"",c1+" "+c2+" "+c3,0);
		int t = t1+t2+t3;
		int d = 0;
		
		while(true) {
			++d;
			System.out.println("Enter the number of pieces player 1 used for building on day "+d);
			int q1 = sc.nextInt();
			System.out.println("Enter the number of pieces player 2 used for building on day "+d);
			int q2 = sc.nextInt();
			
			p1.setPiecesBuilt(p1.getPiecesBuilt()+q1);
			p2.setPiecesBuilt(p2.getPiecesBuilt()+q2);
			
			if(p1.getPiecesBuilt()>=t1) {
				p1.setCompleteSets(c1);
				p1.setIncompleteSets(c1+","+c3);
			}
			if(p1.getPiecesBuilt()>=t1+t2) {
				p1.setCompleteSets(c1+","+c2);
				p1.setIncompleteSets(c3);
			}
			if(p1.getPiecesBuilt()>=t1+t2+t3) {
				p1.setCompleteSets(c1+","+c2+","+c3);
				p1.setIncompleteSets("");
			}
			
			if(p2.getPiecesBuilt()>=t1) {
				p2.setCompleteSets(c1);
				p2.setIncompleteSets(c1+","+c3);
			}
			if(p2.getPiecesBuilt()>=t1+t2) {
				p2.setCompleteSets(c1+","+c2);
				p2.setIncompleteSets(c3);
			}
			if(p2.getPiecesBuilt()>=t1+t2+t3) {
				p2.setCompleteSets(c1+","+c2+","+c3);
				p2.setIncompleteSets("");
			}
			
			if(p1.getPiecesBuilt()>=t&&p2.getPiecesBuilt()>=t) {
				System.out.println("The competition ended in a tie! There will be a tiebreaker round");
				continue outer;
			}
			else if(p1.getPiecesBuilt()>=t) {
				System.out.println("Congratulations to player 1 for winning the Lego Set Competition!\n"
						+ "Additional information about the competition results is below ");
				System.out.println(p1);
				System.out.println(p2);

				break outer;
			}else if(p2.getPiecesBuilt()>=t) {
				System.out.println("Congratulations to player 2 for winning the Lego Set Competition!\n"
						+ "Additional information about the competition results is below ");
				System.out.println(p1);
				System.out.println(p2);
				break outer;
			}
		}
		
	}while(true);
}
}
