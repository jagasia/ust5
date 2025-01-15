
public class AppLinkedList2 {

	public static void main(String[] args) {
		JLinkedList<String> list=new JLinkedList<>();
		list.addNode("India");
		list.addNode("Australia");
		list.addNode("Srilanka");
		list.addNode("Japan");
		list.addNode("China");
		
		list.deleteNode("Srilanka");
		
		list.display();
	}

}
