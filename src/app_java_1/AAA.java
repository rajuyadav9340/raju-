package app_java_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class AAA {
public static void main(String[] args) {
	ArrayList<Integer> ar = new ArrayList<>();
	ar.add(9);
	ar.add(1);
	ar.add(8);
	ar.add(2);
	ar.add(7);
	ar.add(9);
	ar.add(3);
	ar.add(6);
	ar.add(2);
	ar.add(4);
	ar.add(5);
	System.out.println(ar);
	
	HashSet<Integer> hs = new HashSet<>();
	hs.addAll(ar);
	System.out.println(hs);
	
	Collections.sort(ar);
	System.out.println(ar);
	
	
	System.out.println(Collections.binarySearch(ar, 4));


		
}
}
