
public class JStack {
	Node top;
	
	public JStack() {
		top=null;
	}
	
	public void push(Integer data)
	{
		Node n=new Node(data, null);
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
	
	public Integer pop()
	{
		if(top==null)
		{
			//log
			System.out.println("Stack underflow");
			return -1;
		}
		Node temp=top;
		Integer data=temp.getData();
		top=top.getNext();
		temp=null;
		return data;
	}
}
