package app_java_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class AA {
	public static void main(String[] args) {
	List<Integer> list = Arrays.asList(9,5,2,3,5,2,7,6,4,8,1,4);
	System.out.println("Given Number List  "+list);
	//Even Number
	Set<Integer> collect = list.stream().filter(x->x%2==0).collect(Collectors.toSet());
	System.out.println("Even Number  "+collect);
	
	//Odd Number
	Set<Integer> collect2 = list.stream().filter(x->x%2!=0).collect(Collectors.toSet());
	System.out.println("Odd Number  "+collect2);
	
	
	//Square
	Set<Integer> collect3 = list.stream().map(x->x*x).collect(Collectors.toSet());
	System.out.println("Square  "+collect3);
	
	//Square Only Even Number
	Set<Integer> collect4 = list.stream().filter(x->x%2==0).collect(Collectors.toSet());
	List<Integer> collect5 = collect4.stream().map(x->x*x).collect(Collectors.toList());
	System.out.println("Square Even Number  "+collect5);
	
	
	//Square Only Odd Number
	Set<Integer> collect6 = list.stream().filter(x->x%2!=0).collect(Collectors.toSet());
	List<Integer> collect7 = collect6.stream().map(x->x*x).collect(Collectors.toList());
	System.out.println("Square Odd Number  "+collect7);
	
	
	//Cube 
	Set<Integer> collect8 = list.stream().map(x->x*x*x).collect(Collectors.toSet());
	System.out.println("Cube  "+collect8);
	
	//Cube Only Even Number
	Set<Integer> collect9 = list.stream().filter(x->x%2==0).collect(Collectors.toSet());
	List<Integer> collect10 = collect9.stream().map(x->x*x*x).collect(Collectors.toList());
	System.out.println("Cube Even Number  "+collect10);
	
	//Cube Only Odd Number
	Set<Integer> collect11 = list.stream().filter(x->x%2!=0).collect(Collectors.toSet());
	List<Integer> collect12 = collect11.stream().map(x->x*x*x).collect(Collectors.toList());
	System.out.println("Cube Odd Number  "+collect12);
	
	//Sort
	Set<Integer> collect13 = list.stream().sorted().collect(Collectors.toSet());
	System.out.println("Sorted  "+collect13);
	
	//Sort then Square
	Set<Integer> collect14 = list.stream().sorted().collect(Collectors.toSet());
	List<Integer> collect15 = collect14.stream().map(x->x*x).collect(Collectors.toList());
	System.out.println("Sorted Then Square  "+collect15);
	
	//sorted then Cube
	Set<Integer> collect16 = list.stream().sorted().collect(Collectors.toSet());
	List<Integer> collect17 = collect16.stream().map(x->x*x*x).collect(Collectors.toList());
	System.out.println("Sorted Then Square  "+collect17);
	
	//reverse order
	list.sort(Collections.reverseOrder());
	System.out.println("Reverse Order  "+list);
	
	//Maximum Number
	Integer eger = list.stream().max(Integer :: compare).get();
	System.out.println("Maximum Number  "+eger);
	
	//Minimum Number
	Integer eger2 = list.stream().min(Integer :: compare).get();
	System.out.println("Minimum Number  "+eger2);
	
	
	List<String> list2 = Arrays.asList("Reflection","collection","Stream","Ambar","stream","Rampage");
	
	List<String> str = list2.stream().filter(x->x.equals("Stream")).collect(Collectors.toList());
	System.out.println("Equals = "+str);
	
 	List<String> str1 = list2.stream().filter(x->x.equalsIgnoreCase("Stream")).collect(Collectors.toList());
 	System.out.println("Equals Ignore Case = "+str1);
 	
 	List<String> str2 = list2.stream().filter(x->x.startsWith("R")).collect(Collectors.toList());
 	System.out.println("Start With R = "+str2);
 	
 	List<String> str3 = list2.stream().filter(x->x.endsWith("n")).collect(Collectors.toList());
 	System.out.println("End With n = "+str3);
 	
 	List<String> str4 = list2.stream().filter(x->x.contains("e")).collect(Collectors.toList());
 	System.out.println("Contain e = "+str4);
 	
 	List<String> str5 = list2.stream().sorted().collect(Collectors.toList());
 	System.out.println("Sorted String  = "+str5);
 	
 	list2.sort(Collections.reverseOrder());
 	System.out.println("reverse Order = "+list2);
	}
}
