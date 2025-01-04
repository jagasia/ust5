import java.util.Scanner;

public class AppMaxProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		// get n inputs
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// logic starts here
		int maxProduct=-1;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int product = arr[i] * arr[j];
//				System.out.printf("i=%d\tj=%d\tproduct=%d\n", i, j, product);
				// check if product is matching with any of the array elements
				for (int k = 0; k < n; k++) {
					if(product==arr[k])
					{
//						System.out.printf("product=%d\tarr[k]=%d\n", product, arr[k]);
						if(product>maxProduct)
							maxProduct=product;
					}
				}
			}
		}
		System.out.println(maxProduct);
	}

}
