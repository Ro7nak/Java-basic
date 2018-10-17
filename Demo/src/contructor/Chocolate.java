package contructor;

public class Chocolate {

	private int barCode;
	private String name;
	private int weight;
	private int cost;
	
	public Chocolate() {
		barCode = 101;
		name = "Cadbury";
		weight = 12;
		cost = 10;
	}

	public int getBarCode() {
		return barCode;
	}

	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
}
