import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		JBSTree tree=new JBSTree();
		do
		{
			System.out.println("1) Adding a node\r\n"
					+ "2) In order traversal\r\n"
					+ "3) Pre order traversal\r\n"
					+ "4) Post order traversal\r\n"
					+ "5) Delete a node\r\n"
					+ "6) Search (check if a node exist or not)\r\n"
					+ "any other) Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:	//add
				System.out.print("Enter the value of node:");
				int value=sc.nextInt();
				tree.addNode(value);
				System.out.println("Added");
				break;
			case 2: //in order
				System.out.println("Displaying the nodes in the tree using In Order Traversal:");
				tree.inOrder();
				break;
			case 3: //pre order
				System.out.println("Displaying the nodes in the tree using Pre Order Traversal:");
				tree.preOrder();
				break;
			case 4: //post order
				System.out.println("Displaying the nodes in the tree using Post Order Traversal:");
				tree.postOrder();
				break;
			case 5: //delete
				System.out.println("Under construction");
				break;
			case 6: //search
				System.out.print("Enter the value to search:");
				Integer searchValue=sc.nextInt();
				System.out.println(tree.search(searchValue));
				break;
			default:
				return;			//or System.exit(0);	many test env does not allow System.exit(0);
			}
		}while(true);
	}

}
