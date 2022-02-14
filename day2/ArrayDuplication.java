package feb06week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayDuplication {
public static void main(String[] args) {
	int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20, 20, 15, 12,17 };
	Set<Integer> list1=new HashSet<Integer>();
	//List<Integer> list2=new ArrayList<Integer>();
	//list1.add(arr);
	for (int i = 0; i < arr.length; i++) {
		if(list1.add(arr[i])==false){
			System.out.println(arr[i]);
		}
		
	}
}
}
