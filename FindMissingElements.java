package week3.day2.assign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingElements {
	public static void main(String[] args) {
		Integer[] arr = {0,1,2,3,4,7,6,8};
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(arr));
		List<Integer> list1 = new ArrayList<Integer>();
		// Sort the array	
		Collections.sort(list2);
System.out.println(list2);
		// loop through the array (start i from arr[0] till the length of the array)
           for (int i = 0; i < list2.size(); i++) {
        	 boolean check =  arr[i]==(i);
        	if (check==false)  {
        		list1.add(i);
        		 System.out.println(list1);
        		break; 
        	 }
			
		}
			
	}

}
