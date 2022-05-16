//Course Name: CMSC203
//Project Number: 6
//Name: Daniel Fesenko
//Program: Eclipse

public class Alcohol extends Beverage {

	private boolean offeredInWeekend;
	
	public Alcohol(String name, SIZE size, boolean offeredInWeekend) {
		super(name, TYPE.ALCOHOL, size);
		this.offeredInWeekend = offeredInWeekend;
	}
	
	public String toString() {
		return super.toString() + " Offered on the weekend: " + offeredInWeekend + " Price: " + calcPrice();
	}
	
	public boolean equals(Alcohol a2) {
		return (super.equals(a2) && offeredInWeekend == a2.getWeekend());
	}
	
	public double calcPrice() {
		double price = super.calcPrice();
		if(offeredInWeekend) {
			price += 0.6;
		}
		return price;
	}
	
	public boolean getWeekend() {
		return offeredInWeekend;
	}

}
