
public class Property {
	private String propertyName;
	private String city;
	private double rentalAmount;
	private String owner;
	private Plot plot;

	
	public String toString() {
		return("Property Name: " + propertyName + "\nCity: " + city + "\nOwner: " + owner + "\nRental Amount: " + rentalAmount);
	}
	
	public Property(Property p1) {
		city = p1.city;
		owner = p1.owner;
		propertyName = p1.propertyName;
		rentalAmount = p1.rentalAmount;
		plot = p1.plot;
	}
	
	public Property(String propertyName,String city,double rentalAmount,String owner,Plot plot) {
		propertyName = this.propertyName;
		city = this.city;
		rentalAmount = this.rentalAmount;
		owner = this.owner;
		plot = this.plot;
	}
	
	public Property(String propertyName,String city,double rentalAmount,String owner) {
		propertyName = this.propertyName;
		city = this.city;
		rentalAmount = this.rentalAmount;
		owner = this.owner;
	}
	
	public Property(String name, String city, double rentalAmount, String owner, int x, int y, int width, int depth) {
		propertyName = name;
		city = this.city;
		rentalAmount = this.rentalAmount;
		owner = this.owner;
		plot = new Plot(x,y,width,depth);
	}
	
	public Property(String name, String city, int initRentalAmount, String owner, int x, int y, int width, int depth) {
		propertyName = name;
		city = this.city;
		rentalAmount = (double) initRentalAmount;
		owner = this.owner;
		plot = new Plot(x,y,width,depth);
		
	}
	
	public String getPropertyName() {
		return propertyName;
	}
	
	public void setPropertyName(String str) {
		propertyName = str;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String str) {
		city = str;
	}
	
	public double getRentalAmount() {
		return rentalAmount;
	}
	
	public void setRentalAmount(int val) {
		rentalAmount = val;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String str) {
		owner = str;
	}
	
	public Plot getPlot() {
		return plot;
	}
	
	public void setPlot(Plot plot) {
		plot = this.plot;
	}
	

}
