package week3.day2.assign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String string1= "PayPal India";
		String repstr = string1.replace('I', 'i');
		System.out.println(repstr);
        char charstr[]=repstr.toCharArray();
		Set<Character> charset=new TreeSet<Character>();
		List<Character> dupchar=new ArrayList <Character>( );
	   for (int i = 0; i < charstr.length-1; i++) {
		   if (charset.contains(charstr[i])) {
			   dupchar.add(charstr[i]);
		   }
		   else {
			   charset.add(charstr[i]);
		   }
		
	}
	   charset.remove(' ');
	   System.out.println(charset);
	}
} 
