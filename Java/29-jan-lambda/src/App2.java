import java.util.Arrays;
import java.util.Comparator;


class LengthComparator implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		return o1.length()-o2.length();
	}
	
}

public class App2 {

	public static void main(String[] args) {
		//they ask you to sort the countries by their length
		String arr[]= {"India","China","Australia","Japan","Bangladesh","England"};
		//how do you sort these countries? by their length of string
//		Arrays.sort(arr, new LengthComparator());
		Arrays.sort(arr, (x,y)->x.length()-y.length());
		for(String x : arr)
			System.out.println(x);
	}

}
