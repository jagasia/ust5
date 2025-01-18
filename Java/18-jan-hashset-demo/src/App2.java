import java.util.ArrayList;

public class App2 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(45);
		list.add(25);
		list.add(11);
		list.add(28);
		list.add(6);
		long start=System.currentTimeMillis();
		System.out.println(list.contains(11));
		long end=System.currentTimeMillis();
		System.out.println((end-start)+" milli seconds");	
	}
}
