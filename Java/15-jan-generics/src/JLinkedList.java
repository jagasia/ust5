
public class JLinkedList<T> {
	Node<T> start;
	Node<T> end;

	public JLinkedList()
	{
		start=null;
		end=null;
	}
	
	public void addNode(T value)
	{
		//assumption: Always add at the end
		Node<T> node=new Node<T>();
		node.setData(value);
		
		if(start==null)
		{
			//first node to add
			start=node;
			end=node;
		}else
		{
			//already nodes are there. so append to end
			end.setNext(node);
			end=node;
		}
	}
	
	public void deleteNode(T data)
	{
		//find the node, whose value matches data and remove
		//check if you are removing one and only node
		if(start==end)
		{
			Node<T> temp = start;			
			start=null;
			end=null;
			temp=null;
			System.out.println("Deleted the only node that was present");
			return;
		}


		boolean isFound=false;
		for(Node<T> cur=start, prev=start;cur!=null;prev=cur,cur=cur.getNext())
		{
			
			if(cur.getData().equals(data))
			{
				if(cur==start)
				{
					//first node
					start=cur.getNext();
				}
				if(cur==end)
				{
					//last node
					end=prev;
				}
				isFound=true;
				Node<T> temp = cur;
				prev.setNext(cur.getNext());
				cur=cur.getNext();
				temp=null;		//deleted
				break;

			}
		}
		System.out.println((isFound)?"Deleted":"Not found to delete");
		
	}
	
	public void display()
	{
		//display all node values
		for(Node<T> cur=start;cur!=null;cur=cur.getNext())
		{
			System.out.println(cur.getData());
		}
	}
}
