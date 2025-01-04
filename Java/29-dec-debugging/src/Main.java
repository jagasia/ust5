import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int maxProduct = -1;
 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int product = arr[i] * arr[j];
                for (int k = 0; k < n; k++) {
                    if (arr[k] == product) {
                        maxProduct = Math.max(maxProduct, product);
                    }
                }
            }
        }
 
        System.out.println(maxProduct);
    }
}