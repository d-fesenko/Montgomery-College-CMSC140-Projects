//Course Name: CMSC203
//Project Number: 6
//Name: Daniel Fesenko
//Program: Eclipse

import java.util.ArrayList;
import java.util.Collections;

public class BevShop implements BevShopInterfce {

	private ArrayList<Order> orderList = new ArrayList<Order>(0);
	
	@Override
	public boolean validTime(int time) {
		
		return (time >= MIN_TIME && time <= MAX_TIME);
	}

	@Override
	public boolean eligibleForMore() {
		
		return getNumOfAlcoholDrink() < MAX_ORDER_FOR_ALCOHOL;
	}

	@Override
	public boolean validAge(int age) {
		
		return (age > MIN_AGE_FOR_ALCOHOL);
	}

	@Override
	public void startNewOrder(int time, DAY day, String customerName, int customerAge) {
		
		orderList.add(new Order(time,day,new Customer(customerName,customerAge)));

	}

	@Override
	public void processCoffeeOrder(String bevName, SIZE size, boolean extraShot, boolean extraSyrup) {
		orderList.get(orderList.size()-1).addNewBeverage(bevName,size,extraShot,extraSyrup);

	}

	@Override
	public void processAlcoholOrder(String bevName, SIZE size) {
		orderList.get(orderList.size()-1).addNewBeverage(bevName, size);

	}

	@Override
	public void processSmoothieOrder(String bevName, SIZE size, int numOfFruits, boolean addProtein) {
		orderList.get(orderList.size()-1).addNewBeverage(bevName,size,numOfFruits,addProtein);

	}

	@Override
	public int findOrder(int orderNo) {
	
		for(int i = 0; i < orderList.size(); i++) {
			if(orderList.get(i).getOrderNo() == orderNo) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public double totalOrderPrice(int orderNo) {
		
		return orderList.get(findOrder(orderNo)).calcOrderTotal();
	}

	@Override
	public double totalMonthlySale() {
	
		double total = 0.0;
		for(int i = 0; i < orderList.size(); i++) {
			total += orderList.get(i).calcOrderTotal();
		}
		return total;
	}

	@Override
	public void sortOrders() {
		for(int i = 0; i < orderList.size(); i++) {
			Collections.swap(orderList,i,findMinimum(i));
		}

	}
	
	public void swap(Order a, Order b) {
		Order temp = new Order(a);
		orderList.set(findOrder(a.getOrderNo()), b);
		orderList.set(findOrder(b.getOrderNo()), temp);
	}
	
	public boolean isInOrder() {
		for(int i = 0; i < orderList.size()-1; i++) {
			if(orderList.get(i).getOrderNo() > orderList.get(i+1).getOrderNo()) {
				return false;
			}
		}
		return true;
	}
	
	public int findMinimum(int startingIndex) {
		int min = orderList.get(startingIndex).getOrderNo();
		int minIndex = startingIndex;
		for(int i = startingIndex; i < orderList.size(); i++) {
			if(orderList.get(i).getOrderNo() < min) {
				min = orderList.get(i).getOrderNo();
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	public String toString() {
		String str = "";
		for(int i = 0; i < orderList.size(); i++) {
			str += orderList.get(i) + "\n";
		}
		str += "Total Monthly Sales: " + totalMonthlySale();
		return str;
	}

	@Override
	public Order getOrderAtIndex(int index) {
		
		return orderList.get(index);
	}
	
	public Order getCurrentOrder() {
		return orderList.get(orderList.size()-1);
	}
	
	public int totalNumOfMonthlyOrders() {
		return orderList.size();
	}

	public boolean isMaxFruit(int i) {

		return i >= 6;
	}

	public int getNumOfAlcoholDrink() {
		
		return orderList.get(orderList.size()-1).findNumOfBeveType(TYPE.ALCOHOL);
		
	}
	
	public int getMaxOrderForAlcohol() {
		return 3;
	}
	
	public int getMinAgeForAlcohol() {
		return 21;
	}

}
