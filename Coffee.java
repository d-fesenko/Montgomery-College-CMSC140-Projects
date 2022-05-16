//Course Name: CMSC203
//Project Number: 6
//Name: Daniel Fesenko
//Program: Eclipse

public class Coffee extends Beverage {

	private final double extraCharge = 0.5;
	private boolean hasExtraShot;
	private boolean hasExtraSyrup;
	
	public Coffee(String name, SIZE size, boolean hasExtraShot, boolean hasExtraSyrup) {
		super(name, TYPE.COFFEE, size);
		this.hasExtraShot = hasExtraShot;
		this.hasExtraSyrup = hasExtraSyrup;
	}
	
	public String toString() {
		return super.toString() + " Extra shot: " + hasExtraShot + " Extra syrup: " + hasExtraSyrup + " Price: " + calcPrice();
	}
	
	public double calcPrice() {
		double price = super.calcPrice();
		if (hasExtraShot) {
			price += extraCharge;
		}
		if (hasExtraSyrup) {
			price += extraCharge;
		}
		return price;
	}
	
	public boolean equals(Coffee c2) {
		return (super.equals(c2) && hasExtraShot == c2.getExtraShot() && hasExtraSyrup == c2.getExtraSyrup());
	}
	
	public boolean getExtraShot() {
		return hasExtraShot;
	}
	
	public boolean getExtraSyrup() {
		return hasExtraSyrup;
	}
	
}
