import java.util.Stack;

public class AppStack {

	public static void main(String[] args) {
		Stack<Integer> numbers=new Stack<>();
		numbers.push(1);
		numbers.push(2);
		numbers.push(3);
		numbers.push(4);
		numbers.push(5);
		
//		for(Integer x:numbers)
//			System.out.println(x);
		
		System.out.println(numbers.pop());
		System.out.println(numbers.pop());
		System.out.println(numbers.pop());
		System.out.println(numbers.pop());
		System.out.println(numbers.pop());
		
	}

}
