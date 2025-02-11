package solution;

import java.util.*;

public class backTracking {
	
	public static ArrayList<Integer> result;
	public static ArrayList<Integer> BackTracking(ArrayList<Integer> list, ArrayList<Integer> result, int index) {
		int len_list = list.size();
		if (index == len_list-2) {
			result.add(list.get(index)*list.get(len_list-1));
		}
		else {
			for(int i=index+1;i<len_list;++i) {
				result.add(list.get(index)*list.get(i));
			}
			ArrayList<Integer> back_list = BackTracking(list, result, index+1);
			result.addAll(back_list);
			
		}
		return result;
	}
	public static ArrayList<Integer> listMultipleResult(ArrayList<Integer> list){
		
		result = new ArrayList<Integer>();
		
		result = BackTracking(list, result, 0);
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i=0;i<result.size();++i) {
			set.add(result.get(i));
		}
		ArrayList<Integer> newList = new ArrayList<Integer>(set);
		
		return newList;
	}
	
}
