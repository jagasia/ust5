
public class JBSTree {
	private Node root;

	public JBSTree() {
		root = null;
	}

	public void addNode(Integer data) {
		root = addNode(data, root);
	}

	private Node addNode(Integer data, Node curr) {
		Node n = new Node(data, null, null);
		// if tree is already empty
		if (curr == null) {
			curr = n;
		} else {
			if (data < curr.getData()) {
				// go left
				curr.setLeft(addNode(data, curr.getLeft()));
			} else if (data > curr.getData())
				curr.setRight(addNode(data, curr.getRight()));
		}
		return curr;
	}

	public void inOrder() {
		inOrderTraversal(root);
	}
	
	public void preOrder() {
		preOrderTraversal(root);
	}
	
	public void postOrder()
	{
		postOrderTraversal(root);
	}
	

	public void inOrderTraversal(Node root) {
		if (root != null) {
			inOrderTraversal(root.getLeft());
			System.out.println(root.getData());
			inOrderTraversal(root.getRight());
		}
	}
	
	public void preOrderTraversal(Node root) {
		if (root != null) {
			System.out.println(root.getData());
			preOrderTraversal(root.getLeft());			
			preOrderTraversal(root.getRight());
		}
	}
	
	public void postOrderTraversal(Node root)
	{
		if (root != null) {			
			preOrderTraversal(root.getLeft());			
			preOrderTraversal(root.getRight());
			System.out.println(root.getData());
		}
	}
	
}
