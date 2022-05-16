//Course Name: CMSC203
//Project Number: 6
//Name: Daniel Fesenko
//Program: Eclipse

public class Smoothie extends Beverage {
	
	private int fruits;
	private boolean hasProtein;
	
	public Smoothie(String name, SIZE size, int fruits, boolean hasProtein) {
		super(name, TYPE.SMOOTHIE, size);
		this.fruits = fruits;
		this.hasProtein = hasProtein;
	}
	
	public String toString() {
		return (super.toString() + " Amount of Fruits: " + fruits + " Protein: " + hasProtein + " Price: " + calcPrice());
	}
	
	public boolean equals(Smoothie s2) {
		return (super.equals(s2) && fruits == s2.getNumOfFruits() && hasProtein == s2.getAddProtein());
	}
	
	public double calcPrice() {
		double price = super.calcPrice();
		
		price += 0.5*fruits;
		
		if(hasProtein) {
			price += 1.5;
		}
		
		return price;
	}
	
	public int getNumOfFruits() {
		return fruits;
	}
	
	public boolean getAddProtein() {
		return hasProtein;
	}

}
