package week3.day2.assign;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplictes2 {
	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";

		String[] strsplit = text.split(" ");
		Set<String> list1 = new TreeSet<String>(Arrays.asList(strsplit));
		for (String list : list1) {
			System.out.println(list);

		}

	}

}
