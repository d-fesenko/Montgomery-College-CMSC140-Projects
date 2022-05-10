
public class HolidayBonus extends java.lang.Object {
	
static double[] calculateHolidayBonus(double[][] data, double high, double low, double other) {
	int index = 0;
	int rowTotal = 0;
		
	double[] bonuses = new double[data.length];
	
	for(int i = 0; i < data.length; i++) {
		for(int j = 0; j < data[i].length; j++) {
			double num = data[i][j];
			if(num <= 0) {
				rowTotal += 0;
				continue;
			}
			if(num == TwoDimRaggedArrayUtility.getHighestInColumn(data, j)) {
				rowTotal += high;
				continue;
			}
			if(num == TwoDimRaggedArrayUtility.getLowestInColumn(data, j)) {
				rowTotal += low;
				continue;
			}
			rowTotal += other;
		}
		bonuses[index++] = rowTotal;
		rowTotal = 0;
	}

	return bonuses;
}

static double calculateTotalHolidayBonus(double[][]data, double high, double low, double other) {
	
	double total = 0;
	double[] bonusArray = calculateHolidayBonus(data, high, low, other);
	for(double num : bonusArray) {
		total += num;
	}
	return total;
}
}
