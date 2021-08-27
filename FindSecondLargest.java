package week3.day2.assign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class FindSecondLargest {
	public static void main(String[] args) {
		Integer[] data = {3,2,11,4,6,7};
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(data));
		int size = list2.size();
		Collections.sort(list2);
		System.out.println(list2);
		System.out.println("The Second Largest Element is " + list2.get(size-2));
	}

}
