package solution;

import java.util.*;
import java.lang.Math;

public class theSecondLargest {
	public static int getSecondLargest(ArrayList<Integer> list) {
		ArrayList<Integer> temp = new ArrayList<Integer>(list);
		Collections.sort(temp);
		return temp.get(temp.size()-3);
	}
	
	public static  ArrayList<Integer> getFactor(int value, ArrayList<Integer> list){
		int check_point = (int) Math.sqrt(value);
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i=0;i<list.size();++i) {
			int temp = list.get(i);
			if(temp>check_point) {
				break; 
			}
			else {
				if(value%temp==0) {
					if((value/temp)>=temp) {
						for (int j= list.size()-1;j>=i;--j) {
							if(list.get(j)==(value/temp)) {
								result.add(temp);
								result.add(list.get(j));
								return result;
							}
						}
					}
				}
			}
		}
		return result;
	}
}
