package newpackage;

class CompetitionLog{
	private int playerNumber;
	private String completeSets;
	private String incompleteSets;
	private int piecesBuilt;
	
	CompetitionLog(int playerNumber,String completeSets,String incompleteSets,int piecesBuilt)
	{
		this.playerNumber= playerNumber;
		this.completeSets=completeSets;
		this.incompleteSets=incompleteSets;
		this.piecesBuilt=piecesBuilt;
	}

	public int getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}

	public String getCompleteSets() {
		return completeSets;
	}

	public void setCompleteSets(String completeSets) {
		this.completeSets += this.completeSets+ completeSets;
	}

	public String getIncompleteSets() {
		return incompleteSets;
	}

	public void setIncompleteSets(String incompleteSets) {
		this.incompleteSets += this.incompleteSets+ incompleteSets;
	}

	public int getPiecesBuilt() {
		return piecesBuilt;
	}

	public void setPiecesBuilt(int piecesBuilt) {
		this.piecesBuilt = this.piecesBuilt+piecesBuilt;
	}
	public void setEqual()
	{
		this.piecesBuilt=0;
		//this.completeSets="";
	}
	public String toString() {
		return "Player "+playerNumber+" completed the following sets: "+completeSets+"\r\n"
				+ "Player "+playerNumber+" did not completed the following sets: "+incompleteSets+"\r\n"
				+ "Player "+playerNumber+" built total of "+piecesBuilt+" pieces";
				
	}
	
}