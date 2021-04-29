class LinkedList<T>{
	private Node<T> head;

	//Internal class represent node in linkedlist

	private static class Node<T>{
		private T data;
		private Node<T> next;
		public Node(T data){
			super();
			this.data=data;
			this.next=null;
		}
	}

	//insert the node in linked list

	public void insert (T data){
		Node<T> newNode=new Node<T>(data);
		if(head==null){
			head=newNode;
		}else{
			Node<T> currentNode=head;
			while(currentNode.next!=null){
				currentNode=currentNode.next;
			}

			currentNode.next=newNode;
		}
	}

	//return middle node

	public Node<T> getMiddleNodeOfLinkedList(){
		//if linked list empty
		if(head==null){
			return null;
		}

		Node<T> slowReference=head;  	//moving one node at a time.
		Node<T> fastReference=head;	 //moving two node at a time.

		while(fastReference!=null && fastReference.next!=null){
			slowReference=slowReference.next;
			fastReference=fastReference.next.next;

		}
		return slowReference;
	}

	//traverse linked list and display all data

	public void displayLinkedList(){
		Node<T> currentNode=head;
		while(currentNode!=null){
			System.out.print(currentNode.data+ "->");
			currentNode=currentNode.next;
		}
		System.out.println(currentNode);
	}

	public static void main(String[] args) {
		LinkedList<Integer> linkedlist=new LinkedList<>();
		linkedlist.insert(10);
		linkedlist.insert(20);
		linkedlist.insert(30);
		linkedlist.insert(40);
		System.out.println("List 1::");
		linkedlist.displayLinkedList();
		Node<Integer> getMiddleNodeOfLinkedList1=linkedlist.getMiddleNodeOfLinkedList();
		System.out.println("Middle Element: "+getMiddleNodeOfLinkedList1.data);
		System.out.println("-------------------------------");
		LinkedList<Integer> linkedlist2=new LinkedList<>();
		linkedlist2.insert(5);
		linkedlist2.insert(10);
		linkedlist2.insert(15);
		linkedlist2.insert(20);
		linkedlist2.insert(25);
		System.out.println("List 2:: ");
		linkedlist2.displayLinkedList();
		Node<Integer> getMiddleNodeOfLinkedList2=linkedlist2.getMiddleNodeOfLinkedList();
		System.out.println("Middle Element: "+getMiddleNodeOfLinkedList2.data);

	}
}



//OUTPUT
//ListList 1::
//10->20->30->40->null
//Middle Element: 30
//-------------------------------
//List List 2::
//5->10->15->20->25->null
//Middle Element: 15