package model;

public class Game {
	private Player playerA;
	private Player playerB;
	
	private String[] grid;
	private String winner;
	
	public Game(String usernameA, String usernameB) {
		playerA = new Player(usernameA);
		playerB = new Player(usernameB);
		
		grid = new String[9];
		for (int i = 0; i < 9; i++) {
				grid[i] = " ";
		}
		
		winner = "";
	}
	
	private int countOccupied() {
		int occupied = 0;
		for (int i = 0; i < 9; i++) {
			if (grid[i] != " ") {
					occupied++;
			}
		}
		System.out.println("Occupied: " + occupied);
		
		return occupied;
	}
	
	public String getCurrPlayer() {
		if (countOccupied() % 2 == 0)
			return playerA.getCharacter();
		else return playerB.getCharacter();
	}
	
	public void setMove(String username, int index) {
		if (username == playerA.getCharacter()) {
			if (grid[index] == " ")
				grid[index] = playerA.getCharacter();
		}
		else if (username == playerB.getCharacter()) {
			if (grid[index] == " ")
				grid[index] = playerB.getCharacter();
		}
	}
	
	public boolean isGameOver() {
		// check for horizontal patterns
		System.out.println("CHECKING HORIZONTAL...");
		for (int i = 0; i < 7; i+=3) {
			if (grid[i] == grid[i+1] && grid[i+1] == grid[i+2] && grid[i] != " ") {
				winner = grid[i];
				System.out.println("THERE'S A WINNER!!");
				return true;
			}
		}
		
		// check for vertical patterns
		System.out.println("CHECKING VERTICAL...");
		for (int i = 0; i < 3; i++) {
			if (grid[i] == grid[i+3] && grid[i+3] == grid[i+6] && grid[i] != " ") {
				winner = grid[i];
				System.out.println("THERE'S A WINNER!!");
				return true;
			}
		}
		
		// check for diagonal \ patterns
		System.out.println("CHECKING \\...");
		if (grid[0] == grid[3] && grid[3] == grid[7] && grid[0] != " ") {
			winner = grid[0];
			System.out.println("THERE'S A WINNER!!");
			return true;
		}
		
		// check for diagonal / patterns
		System.out.println("CHECKING /...");
		if (grid[2] == grid[4] && grid[4] == grid[6] && grid[2] != " ") {
			winner = grid[2];
			System.out.println("THERE'S A WINNER!!");
			return true;
		}
		
		if (countOccupied() == 9) 
			return true;
		
		return false;
	}
	
	public String getWinner() {
		return winner;
	}
}
