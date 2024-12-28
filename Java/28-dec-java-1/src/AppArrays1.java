import java.util.Arrays;

public class AppArrays1 {

	public static void main(String[] args) {
		Integer arr[]={5, 6, 8, 3, 9, 1, 4, 2};
		Arrays.sort(arr,(a,b)->b-a);
		System.out.println(Arrays.toString(arr));
	}

}
