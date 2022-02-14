package feb06week3.day2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class MissingElement {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(6);
	list.add(8);
	list.add(7);
	Collections.sort(list);
	System.out.println(list);
	for (int i = 1; i < list.size() ; i++) {
		if(i != list.get(i-1)) {
			System.out.println(i);
			break;
}
}
}
}