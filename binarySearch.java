class Node{	//create a class for node
	int key;	
	Node left, right;

	public Node(int item){
		key=item;
		left=right=null;
	}
}

class BinaryTree{  //craete a class for binary tree
	Node root;
//Traverse tree
	public void traverseTree(Node node){
		if(node!=null){
			traverseTree(node.left);
			System.out.print(" "+node.key);
			traverseTree(node.right);

		}
	}

	public static void main(String[] args) {
		//Create an object of a binary tree
		BinaryTree tree=new BinaryTree();
		//create a node of the tree
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);

		//Display the result

		System.out.print("\nBinary Tree: ");
		tree.traverseTree(tree.root);
	}
}


//OUTPUT
// Binary Tree: 4 2 1 3
