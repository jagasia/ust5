import java.util.Collections;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		list.add(20);
		list.add(50);
		list.add(40);
		list.add(10);
		list.add(30);
		list.add(90);
		list.add(70);
		System.out.println(list);
		Collections.sort(list);
		System.out.println("After sorting it becomes:");
		System.out.println(list);
	}

}
