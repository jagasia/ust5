
public class JStack<T> {
	Node<T> top;
	
	public JStack() {
		top=null;
	}
	
	public void push(T data)
	{
		Node<T> n=new Node(data, null);
		//check if top is null. if so, then we are adding our first node
		if(top==null)
		{
			top=n;
		}else
		{
			n.setNext(top);
			top=n;
		}
	}
	
	public T pop()
	{
		if(top==null)
		{
			//log
			System.out.println("Stack underflow");
			return null;
		}
		Node<T> temp=top;
		T data=temp.getData();
		top=top.getNext();
		temp=null;
		return data;
	}
}
