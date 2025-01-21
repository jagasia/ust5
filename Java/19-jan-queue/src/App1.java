import java.util.PriorityQueue;

public class App1 {

	public static void main(String[] args) {
		PriorityQueue<Integer> q=new PriorityQueue<>();
		q.add(5);
		q.add(1);
		q.add(3);
		q.add(2);
		q.add(4);
		
		while(!q.isEmpty())
			System.out.println(q.poll());
		
	}

}
