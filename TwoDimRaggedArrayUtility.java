import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.*;
public final class TwoDimRaggedArrayUtility extends java.lang.Object {

	static double getAverage(double[][] data) {
		double total = 0;
		int count = 0;
		for (double[] row : data) {
			for (double num : row) {
				total += num;
				count++;
			}
		}
		return (total/(double)count);
	}
	
	static double getColumnTotal(double[][] data, int col) {
		double total = 0;
		for(int i = 0; i < data.length; i++) {
			if(data[i].length > col) {
			total += data[i][col];
			}
		}
		return total;
	}
	
	static double getHighestInArray(double[][] data) {
		double max = data[0][0];
		for (double[] row : data) {
			for (double num : row) {
				if(num > max) {
					max = num;
				}
			}
		}
		return max;
	}
	
	static double getHighestInColumn(double[][] data, int col) {
		int index = 0;
		while(data[index].length <= col)
		{
			index++;
		}
		double max = data[index][col];
		for(int i = 0; i < data.length; i++) {
			if(data[i].length > col) {
			if(data[i][col] > max) {
				max = data[i][col];
			}
			}
		}
		return max;
	}
	
	static int getHighestInColumnIndex(double[][] data, int col) {
		int index = 0;
		while(data[index].length <= col)
		{
			index++;
		}
		double max = data[index][col];
		int maxIndex = index;
		for(int i = 0; i < data.length; i++) {
			if(data[i].length > col) {
			if(data[i][col] > max) {
				max = data[i][col];
				maxIndex = i;
			}
		}
		}
		return maxIndex;
	}
	
	static double getHighestInRow(double[][] data, int row) {
		double max = data[row][0];
		for(int i = 0; i < data[row].length; i++) {
			if(data[row][i] > max) {
				max = data[row][i];
			}
		}
		return max;
	}
	
	static int getHighestInRowIndex(double[][] data, int row) {
		double max = data[row][0];
		int maxIndex = 0;
		for(int i = 0; i < data[row].length; i++) {
			if(data[row][i] > max) {
				max = data[row][i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	static double getLowestInArray(double[][] data) {
		double min = data[0][0];
		for (double[] row : data) {
			for (double num : row) {
				if(num < min) {
					min = num;
				}
			}
		}
		return min;
	}
	
	static double getLowestInColumn(double[][] data, int col) {
		int index = 0;
		while(data[index].length <= col)
		{
			index++;
		}
		double min = data[index][col];
		for(int i = 0; i < data.length; i++) {
			if(data[i].length > col) {
			if(data[i][col] < min) {
				min = data[i][col];
			}
			}
		}
		return min;
	}
	
	static int getLowestInColumnIndex(double[][] data, int col) {
		int index = 0;
		while(data[index].length <= col)
		{
			index++;
		}
		double min = data[index][col];
		int minIndex = index;
		for(int i = 0; i < data.length; i++) {
			if(data[i].length > col) {
			if(data[i][col] < min) {
				min = data[i][col];
				minIndex = i;
			}
			}
		}
		return minIndex;
	}
	
	static double getLowestInRow(double[][] data, int row) {
		double min = data[row][0];
		for(int i = 0; i < data[row].length; i++) {
			if(data[row][i] < min) {
				min = data[row][i];
			}
		}
		return min;
	}
	
	static int getLowestInRowIndex(double[][] data, int row) {
		double min = data[row][0];
		int minIndex = 0;
		for(int i = 0; i < data[row].length; i++) {
			if(data[row][i] < min) {
				min = data[row][i];
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	static double getRowTotal(double[][] data, int row) {
		double total = 0;
		for(int i = 0; i < data[row].length; i++) {
			total += data[row][i];
		}
		return total;
	}
	
	static double getTotal(double[][] data) {
		double total = 0;
		for (double[] row : data) {
			for (double num : row) {
				total += num;
			}
		}
		return (total);
	}
	
	
	static double[][] readFile(java.io.File file) throws FileNotFoundException {
		double[][] tempDoubleArray = new double[10][];
		Scanner fileInput = new Scanner(file);
		int rowIndex = 0;
		while (fileInput.hasNextLine()) {
			String line = fileInput.nextLine();
			String[] stringRow = (line.split(" "));
			tempDoubleArray[rowIndex] = new double[stringRow.length];
			for(int i = 0; i < stringRow.length; i++) {
				tempDoubleArray[rowIndex][i] = Double.valueOf(stringRow[i]);
		    }
			rowIndex++;
		}
		fileInput.close();
		//convert into jagged array
		double[][] doubleArray = new double[rowIndex][];
		for(int j = 0; j < doubleArray.length; j++) {
		doubleArray[j] = tempDoubleArray[j];
		}
		return doubleArray;
	}
	
	
	static void writeToFile(double[][] data, java.io.File outputFile) throws FileNotFoundException {
		PrintWriter fileOutput = new PrintWriter(outputFile);
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				fileOutput.print(data[i][j] + " ");
			}
			if(i != (data.length-1)) {
			fileOutput.println();
			}
		}
		fileOutput.close();
	}
	
}




















