package ploymorphism;

public class PlayerRating {

	private int playerPosition;
	private String playerName;
	private float criticOneRating;
	private float criticTwoRating;
	private float criticThreeRating;
	private float average;
	private char category;
	
	public PlayerRating(int playerPosition, String playerName) {
		this.playerName = playerName;
		this.playerPosition = playerPosition;
	}
	
	public void calculateAverageRating(float criticOneRating, float criticTwoRating) {
		average = (criticOneRating+criticTwoRating)/2;
	}
	
	public void calculateAverageRating(float criticOneRating, float criticTwoRating, float crticThreeRating) {
		average = (criticOneRating+criticTwoRating+criticThreeRating)/3;
	}
	
	public void calculateCategory() {
		if(average>8)
			category = 'A';
		else if (average>5 && average<=8)
			category = 'B';
		else
			category = 'C';
	}
	
	public void display() {
		System.out.println("the player name is "+playerName);
		System.out.println("the player position is "+playerPosition);
		System.out.println("the average rating is "+average);
		System.out.println("the category is "+category);
	}
}
