import java.util.Arrays;

//class A implements Comparator<Integer>
//{
//
//	@Override
//	public int compare(Integer o1, Integer o2) {
//		return 0;
//	}
//	
//}

public class App3 {

	public static void main(String[] args) {
		Integer arr[]= {5,2,7,1,9,3,8,4};
		
		Arrays.sort(arr, (a,b)->b-a);
		
		System.out.println(Arrays.toString(arr));
	}

}
