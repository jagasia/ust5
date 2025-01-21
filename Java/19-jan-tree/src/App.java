
public class App {

	public static void main(String[] args) {
		JBSTree tree=new JBSTree();
		tree.addNode(57);
		tree.addNode(7);
		tree.addNode(17);
		tree.addNode(51);
		tree.addNode(10);
		tree.addNode(20);
		tree.addNode(5);
		tree.addNode(27);
		tree.addNode(14);
		tree.addNode(12);
		
		tree.postOrder();
		
	}

}
