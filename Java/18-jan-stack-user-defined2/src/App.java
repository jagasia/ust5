
public class App {

	public static void main(String[] args) {
		JStack stack=new JStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		
		Integer data=-1;
		
		while((data=stack.pop())!=-1)
		{
			System.out.println(data);
		}
		System.out.println("done");
	}

}
