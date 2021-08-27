package week3.day2.assign;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class FindIntersection {
	public static void main(String[] args) {
		String string1[]={"3","2","11","4","6","7"};
		String string2[]={"1","2","8","4","9","7"};
		Set<String> list1 = new TreeSet<String>(Arrays.asList(string1));
		Set<String> list2 = new TreeSet<String>(Arrays.asList(string2));
         list1.retainAll(list2);
         System.out.println(list1);
		
	}

}
