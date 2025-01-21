public class App2 {

	public static void main(String[] args) {
		JStack<String> stack=new JStack<>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		stack.push("E");
		
		String data=null;
		
		while((data=stack.pop())!=null)
		{
			System.out.println(data);
		}
		System.out.println("done");
	}

}
