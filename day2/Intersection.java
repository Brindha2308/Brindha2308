package feb06week3.day2;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
public static void main(String[] args) {
	/*
	 * Pseudo Code
	
	 * a) Declare An array for {3,2,11,4,6,7};	 
	 * b) Declare another array for {1,2,8,4,9,7};
	 * c) Declare for loop iterator from 0 to array length
	 * d) Declare a nested for another array from 0 to array length
	 * e) Compare Both the arrays using a condition statement
	 
	 *  f) Print the first array (shoud match item in both arrays)
	 */
	/*
	 * int[] arr1={3,2,11,4,6,7}; int[] arr2={1,2,8,4,9,7}; for (int i = 0; i <
	 * arr1.length; i++) { for (int j = 0; j < arr2.length; j++) {
	 * if(arr1[i]==arr2[j]) { System.out.println(arr1[i]); } } }
	 */

	Set<Integer>arr1=new HashSet<Integer>();
	
	arr1.add(3);
	arr1.add(2);
	arr1.add(11);
	arr1.add(4);
	arr1.add(6);
	arr1.add(7);
	System.out.println("Elements in array1" +arr1);
	Set<Integer> arr2=new HashSet<Integer>();
	arr2.add(1);
	arr2.add(2);
	arr2.add(8);
	arr2.add(4);
	arr2.add(9);
	arr2.add(7);
	System.out.println("Elements in array2"+arr2);
	Set<Integer> arr3=new HashSet<Integer>(arr1);
	arr3.retainAll(arr2);
	System.out.println("Intersection of Array1&Array2="+arr3);
	}
}

