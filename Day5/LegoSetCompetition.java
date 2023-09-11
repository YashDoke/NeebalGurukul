

package newpackage;
import java.util.Scanner;

public class LegoSetCompetition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Lego Set Competition!");

        CompetitionLog p1 = new CompetitionLog(1, "", "", 0);
        CompetitionLog p2 = new CompetitionLog(2, "", "", 0);
        int totalPiecesUsedByPlayer1 = 0;
        int totalPiecesUsedByPlayer2 = 0;
        int totalDaysElapsed = 0;

        while (true) {
            String[] lname = new String[3];
            int[] npieces = new int[3];

            for (int i = 0; i < 3; i++) {
                System.out.println("Enter Name of Lego Set " + (i + 1) + ":");
                lname[i] = sc.nextLine();
                System.out.println("Enter the number of pieces in Lego Set " + (i + 1) + ":");
                npieces[i] = sc.nextInt();
                sc.nextLine();
            }

            int j = 1;
            boolean tie = false;

            while (true) {
                System.out.println("Enter the number of pieces player 1 used for building on day " + (j + totalDaysElapsed));
                int pieces1 = sc.nextInt();
                System.out.println("Enter the number of pieces player 2 used for building on day " + (j + totalDaysElapsed));
                int pieces2 = sc.nextInt();

                p1.setPiecesBuilt(p1.getPiecesBuilt() + pieces1);
                p2.setPiecesBuilt(p2.getPiecesBuilt() + pieces2);

                if (p1.getPiecesBuilt() >= getTotalPieces(npieces) && p2.getPiecesBuilt() >= getTotalPieces(npieces)) {
                    tie = true;
                    break;
                } else if (p1.getPiecesBuilt() >= getTotalPieces(npieces)) {
                    handleWinner(p1, p2, lname, npieces, totalPiecesUsedByPlayer1, totalPiecesUsedByPlayer2, j, totalDaysElapsed);
                    break;
                } else if (p2.getPiecesBuilt() >= getTotalPieces(npieces)) {
                    handleWinner(p2, p1, lname, npieces, totalPiecesUsedByPlayer2, totalPiecesUsedByPlayer1, j, totalDaysElapsed);
                    break;
                }
                j++;
            }

            if (tie) {
                totalPiecesUsedByPlayer2 += p1.getPiecesBuilt();
                totalPiecesUsedByPlayer1 += p2.getPiecesBuilt();
                totalDaysElapsed += j;

                p1.setEqual();
                p2.setEqual();

                System.out.println("The competition ended in a tie! There will be a tiebreaker round");
            }

            System.out.println("Do you want to continue (yes/no)?");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("no")) {
                sc.close();
                return;
            }
        }
    }

    private static int getTotalPieces(int[] npieces) {
        int total = 0;
        for (int piece : npieces) {
            total += piece;
        }
        return total;
    }

    private static void handleWinner(CompetitionLog winner, CompetitionLog loser, String[] lname, int[] npieces, int totalPiecesWonByWinner, int totalPiecesWonByLoser, int j, int totalDaysElapsed) {
        winner.setCompleteSets(String.join(" ", lname));
        winner.setIncompleteSets("none");

        String incompleteSets = "";
        int piecesLeft = winner.getPiecesBuilt();
        for (int i = 0; i < npieces.length; i++) {
            if (piecesLeft >= npieces[i]) {
                piecesLeft -= npieces[i];
            } else {
                incompleteSets += lname[i] + " ";
            }
        }
        loser.setCompleteSets("none");
        loser.setIncompleteSets(incompleteSets);

        System.out.println("Congratulations to player " + winner.getPlayerNumber() + " for winning the Lego Sets Competition!");
        System.out.println("Additional information about the competition results is below");
        winner.setPiecesBuilt(totalPiecesWonByWinner);
        loser.setPiecesBuilt(totalPiecesWonByLoser);
        System.out.println(winner);
        System.out.println(loser);
        System.out.println("The Competition lasted " + (j + totalDaysElapsed) + " days");
    }
}
