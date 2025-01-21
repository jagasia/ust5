import java.util.LinkedList;

public class App1 {

	public static void main(String[] args) {
		LinkedList<Integer> llist=new LinkedList<>();
		llist.add(20);
		llist.add(30);
		llist.add(40);
		llist.add(50);
		llist.add(60);
		llist.add(70);
		llist.add(80);
		llist.add(90);
		llist.add(110);
		
		llist.addFirst(100);
		
		while(!llist.isEmpty())
			System.out.println(llist.pollLast());
	}

}
