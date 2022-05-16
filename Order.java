//Course Name: CMSC203
//Project Number: 6
//Name: Daniel Fesenko
//Program: Eclipse

import java.util.ArrayList;

public class Order implements OrderInterface, Comparable<Beverage> {

	private int orderNumber;
	private int orderTime;
	private DAY orderDay;
	private ArrayList<Beverage> bevList = new ArrayList<Beverage>(0);
	private Customer orderCustomer;
	
	public int getRandom() {
		return (int)(Math.random()*80000+10000);
	}
	public Order(int orderTime,DAY orderDay,Customer orderCustomer) {
		orderNumber = getRandom();
		this.orderTime = orderTime;
		this.orderDay = orderDay;
		this.orderCustomer = orderCustomer;
	}
	
	public Order(Order o) {
		orderNumber = o.getOrderNo();
		orderTime = o.getOrderTime();
		orderDay = o.getOrderDay();
		orderCustomer = o.getCustomer();
		bevList = o.getBevList();
	}
	
	public void addNewBeverage(String bevName,SIZE size,boolean extraShot,boolean extraSyrup) {
		bevList.add(new Coffee(bevName,size,extraShot,extraSyrup));
	}
	
	public void addNewBeverage(String bevName,SIZE size) {
		bevList.add(new Alcohol(bevName,size,false));
		
	}

	public void addNewBeverage(String bevName,SIZE size,int numOfFruits,boolean addProtein) {
		bevList.add(new Smoothie(bevName,size,numOfFruits,addProtein));
	}
	
	public int getTotalItems() {
		return bevList.size();
	}
	
	public int getOrderNo() {
		return orderNumber;
	}
	
	public int getOrderTime() {
		return orderTime;
	}
	
	public DAY getOrderDay() {
		return orderDay;
	}
	
	public ArrayList<Beverage> getBevList() {
		return bevList;
	}
	
	public Customer getCustomer() {
		return new Customer(orderCustomer.getName(),orderCustomer.getAge());
	}
	
	public int compareTo(Order o) {
		if(orderNumber > o.getOrderNo()) {
			return 1;
		}
		else if(orderNumber < o.getOrderNo()) {
			return -1;
		}
		else return 0;
	}
	
	public String toString() {
		String str = ("Order Number: " + orderNumber + "\nOrder Time: " + orderTime + "\nOrder Day: " + orderDay + "\n" + orderCustomer);
		for(int i = 0; i < bevList.size(); i++) {
			str += ("\n" + bevList.get(i).toString() + " Price: " + bevList.get(i).calcPrice());
		}
		str += ("\nOrder Total: " + calcOrderTotal());
		return str;
	}
	@Override
	public int compareTo(Beverage arg0) {

		return 0;
	}
	@Override
	public boolean isWeekend() {
	
		return(orderDay == DAY.SATURDAY || orderDay == DAY.SUNDAY);
	}
	@Override
	public Beverage getBeverage(int itemNo) {
		
		return bevList.get(itemNo);
	}
	@Override
	public double calcOrderTotal() {
		double price = 0.0;
		for(int i = 0; i < bevList.size(); i++) {
			price += bevList.get(i).calcPrice();
			if(bevList.get(i).getType() == TYPE.ALCOHOL && isWeekend()) {
				price += 0.6;
			}
		}
		return price;
		
	}
	@Override
	public int findNumOfBeveType(TYPE type) {
		
		int count = 0;
		
		for(int i = 0; i < bevList.size(); i++) {
			if(bevList.get(i).getType() == type) {
				count++;
			}
		}
		return count;
	}
}
