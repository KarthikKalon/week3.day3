package week3.day2.assign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortCollections {
	public static void main(String[] args) {
		String[] string1= {"Google","Microsoft","TestLeaf","Maverick"};
		List<String> str1=new ArrayList<String>(Arrays.asList(string1));
	
		int sizestr=str1.size();
		Collections.sort(str1);
		Collections.reverse(str1);
		System.out.println(sizestr);
		for( String name:str1) {
			System.out.println(name);
		}
	}
}
   