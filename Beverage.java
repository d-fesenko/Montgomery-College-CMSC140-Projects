//Course Name: CMSC203
//Project Number: 6
//Name: Daniel Fesenko
//Program: Eclipse

public abstract class Beverage {

	private String name;
	private TYPE type;
	private SIZE size;
	private final double basePrice = 2.0;
	private final double sizePrice = 1.0;
	
	public Beverage(String name,TYPE type,SIZE size) {
		this.name = name;
		this.type = type;
		this.size = size;
	}
	
	public String getBevName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public TYPE getType() {
		return type;
	}
	
	public void setType(TYPE type) {
		this.type = type;
	}
	
	public SIZE getSize() {
		return size;
	}
	
	public void setSize(SIZE size) {
		this.size = size;
	}
	
	public double getBasePrice() {
		return basePrice;
	}
	
	public double calcPrice() {
		double extraPrice = 0.0;
		
		switch(size) {
		case SMALL:
			break;
		case MEDIUM:
			extraPrice = sizePrice*1;
			break;
		case LARGE:
			extraPrice = sizePrice*2;
			break;
		}
		return basePrice + extraPrice;
	}
	
	public String toString() {
		return ("Name: " + name + " Beverage Type: " + type + " Size: " + size);
	}
	
	public boolean equals(Beverage b2) {
		return(name.equals(b2.getBevName()) && size.equals(b2.getSize()) && type.equals(b2.getType()));
	}
	
}
