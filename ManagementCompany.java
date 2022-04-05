
public class ManagementCompany {
private int MAX_PROPERTY = 5;
private double mgmFeePer;
private String name;
private Property[] properties;
private String taxID;
private int MGMT_WIDTH = 10;
private int MGMT_DEPTH = 10;
private Plot plot;
private int propertyIndex = 0;

/**

* Constructor Creates a ManagementCompany object using the passed informations.

* @param name represents the name of the company

* @param taxID represents the company's tax ID

* @param mgmFee represents the company's management fee

*/
public ManagementCompany() {
	name = "";
	taxID = "";
	plot = new Plot(0, 0, 10, 10);
	properties = new Property[MAX_PROPERTY];
}

public ManagementCompany(String name, String taxID, double mgmFeePer) {
	name = this.name;
	taxID = this.taxID;
	mgmFeePer = this.mgmFeePer;
	plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
	properties = new Property[MAX_PROPERTY];
}

public ManagementCompany(String name, String taxID, double mgmFeePer, int x, int y, int width, int depth) {
	name = this.name;
	taxID = this.taxID;
	mgmFeePer = this.mgmFeePer;
	plot = new Plot(x, y, width, depth);
	properties = new Property[MAX_PROPERTY];
}

public ManagementCompany(ManagementCompany c1) {
	name = c1.getName();
	taxID = c1.getID();
	mgmFeePer = c1.getFee();
	plot = new Plot(c1.getPlot().getX(),c1.getPlot().getY(),c1.getPlot().getWidth(),c1.getPlot().getDepth());
}

public int addProperty(Property p1) {

		if (propertyIndex >= MAX_PROPERTY) {
		return -1;
		}
		else {
		properties[propertyIndex] = p1;
		propertyIndex++;
		return propertyIndex-1;
		}

		}

public int addProperty(String name, String city, double rentalAmount, String owner, Plot plot) {
	if(propertyIndex <= 4) {
	properties[propertyIndex++] = new Property(name, city, rentalAmount, owner, plot);
	}
	else {
		return -1;
	}
	if(propertyIndex > 4) {
		return -1;
	}
	if(properties[propertyIndex-1] == null) {
		return -2;
	}
	if(plot.encompasses(properties[propertyIndex-1].getPlot()) == false) {
		return -3;
	}
	for(int i = 0; i < propertyIndex; i++) {
		if (plot.overlaps(properties[i].getPlot())) {
			return -4;
		}
	}
	return propertyIndex;
}

public String displayPropertyAtIndex(int i) {
	return properties[i].toString();
}

public int getMAX_PROPERTY() {
	return MAX_PROPERTY;
}

public double maxRentProp() {
	double maxRent = 0.0;
	for(int i = 0; i < propertyIndex; i++) {
		if(properties[i].getRentalAmount() > maxRent) {
			maxRent = properties[i].getRentalAmount();
		}
	}
	return maxRent;
}

public int maxRentPropertyIndex() {
	double maxRent = 0.0;
	int maxRentIndex = 0;
	for(int i = 0; i < propertyIndex; i++) {
		if(properties[i].getRentalAmount() > maxRent) {
			maxRent = properties[i].getRentalAmount();
			maxRentIndex = i;
		}
	}
	return maxRentIndex;
}

public double totalRent() {
	double total = 0;
	for(int i = 0; i < propertyIndex; i++) {
		total += properties[i].getRentalAmount();
	}
	return total;
}

public String toString() {
	String information = "";
	for(int i = 0; i < propertyIndex; i++) {
		information += ("\nProperty Name: " + properties[i].getPropertyName());
		information += ("\nLocated in " + properties[i].getCity());
		information += ("\nBelonging to: " + properties[i].getOwner());
		information += ("\nRent Amount: " + properties[i].getRentalAmount());
	}
	return information;
}


public String getName() {
	return name;
}

public void setName(String name) {
	name = this.name;
}

public String getID() {
	return taxID;
}

public void setID(String taxID) {
	taxID = this.taxID;
}

public double getFee() {
	return mgmFeePer;
}

public void setFee(double mgmFeePer) {
	mgmFeePer = this.mgmFeePer;
}

public Plot getPlot() {
	return plot;
}

public void setPlot(Plot plot) {
	plot = this.plot;
}

}
