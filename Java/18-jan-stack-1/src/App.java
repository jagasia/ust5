import java.util.Stack;

public class App {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		
//		while(stack.size()>0)
//		{
//			System.out.println(stack.pop());
//		}
		System.out.println(stack.get(5));
	}

}
