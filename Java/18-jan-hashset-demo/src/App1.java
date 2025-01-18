import java.util.HashSet;

public class App1 {

	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<>();
		set.add(45);
		set.add(25);
		set.add(11);
		set.add(28);
		set.add(6);
		long start=System.currentTimeMillis();
		System.out.println(set.contains(11));
		long end=System.currentTimeMillis();
		System.out.println((end-start)+" milli seconds");
	}

}
