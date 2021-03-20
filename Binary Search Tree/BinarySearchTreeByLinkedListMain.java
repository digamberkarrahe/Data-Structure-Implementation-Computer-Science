package binarySearchTree;

public class BinarySearchTreeByLinkedListMain {

	public static void main(String[] args) {
		
		//Constructor
		BinarySearchTreeByLinkedList tree = new BinarySearchTreeByLinkedList();
		
		//Inserting values in BST
		System.out.println("Inserting 10 nodes in Tree");
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(90);
		tree.insert(80);
		tree.insert(100);
		
		
		
		tree.printTreeGraphically();
		
		//Searching non-existing value in Tree
		System.out.println("\n\nSearching for value on BST...");
		tree.searchForValue(80);
		
		//Searching existing value in Tree
		System.out.println("\nSearching for value on BST...");
		tree.searchForValue(60);

		
		//Deleting Node from Tree
		tree.deleteNodeOfBST(90); //Node does not exists
		tree.printTreeGraphically();
		
		tree.deleteNodeOfBST(20); //Node is having 0 Child
		tree.printTreeGraphically();
		
		tree.deleteNodeOfBST(100); //Node is having 1 Child
		tree.printTreeGraphically();
		
		tree.deleteNodeOfBST(50); //Node is having 2 Child
		tree.printTreeGraphically();

		//Deleting entire Tree
		tree.deleteTree();
		
		//Traversing Tree
		tree.levelOrderTraversal();

	}//end of method

}//end of class