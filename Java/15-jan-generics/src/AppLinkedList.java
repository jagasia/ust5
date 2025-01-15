
public class AppLinkedList {

	public static void main(String[] args) {
		JLinkedList<Integer> list=new JLinkedList<>();
		list.addNode(11);
		list.addNode(1);
		list.addNode(20);
		list.addNode(14);
		list.addNode(7);
		
		list.deleteNode(14);
		
		list.display();
	}

}
