import java.util.ArrayDeque;

public class App2 {

	public static void main(String[] args) {
		ArrayDeque<Integer> q=new ArrayDeque<>();
		q.add(42);
		q.add(10);
		q.add(5);
		q.add(50);
		q.add(12);
		
		while(!q.isEmpty())
			System.out.println(q.poll());
		
	}

}
