package solution;

import solution.backTracking;
import solution.theSecondLargest;

import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(2);
			list.add(3);
			list.add(5);
			list.add(8);
			
			ArrayList<Integer> listDistinctMultiple = backTracking.listMultipleResult(list);
			
			System.out.println("The distict value of multiple element to each other: "+ listDistinctMultiple.toString());
			System.out.println("The factor of the value are: "+ theSecondLargest.getFactor(24, list).toString());
	}
}
