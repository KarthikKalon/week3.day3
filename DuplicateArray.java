package week3.day2.assign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateArray {
	public static void main(String[] args) {
		
		Integer[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer> list1 = new ArrayList<Integer>();
		Set<Integer> list2 =new LinkedHashSet<Integer>();
		for (int i = 0; i < arr.length-1; i++)   {
        if (list2.contains(arr[i])) {
			   list1.add(arr[i]);
		   }
		   else {
			   list2.add(arr[i]);
		   }	
        
		}
	
	System.out.println(list1);	
	}
	
	
	
	
	
	
	

}
