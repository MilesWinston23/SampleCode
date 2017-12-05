import java.util.ArrayList;

public class Array {
	
	

	
public static void main(String[] args) {
	ArrayList myList = new ArrayList();
	int array[] = new int[5];
	array[0] = 4;
	array[1] = 7;
	array[2] = 1;
	
	myList.add("Rate");
	myList.add(1);
	
	
	for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);
	}
	
	System.out.println(myList);
	
}
	
}
